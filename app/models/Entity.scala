package models

import play.api.db._
import play.api.Play.current
 
import anorm._
import anorm.SqlParser._

case class Entity(
  id: Pk[Long] = NotAssigned,
  uid: String = java.util.UUID.randomUUID().toString(),
  
  name: String = "",
  tablename: String = ""
)

object Entity {
 
  val simple = {
    get[Pk[Long]]("ox_entity.id") ~
    get[String]("ox_entity.uid") ~
    get[String]("ox_entity.name") ~
    get[String]("ox_entity.tablename") map {
      case id~uid~name~tablename => Entity(id, uid, name, tablename)
    }
  }

  /**
   * Retrieve all Entities.
   */
   def findAll(): Seq[Entity] = {
    DB.withConnection { implicit connection =>
      SQL("select * from ox_entity").as(Entity.simple *)
    }
  }

  /**
   * Retrieve an Entity from the id.
   */
  def findById(id: Long): Option[Entity] = {
    DB.withConnection { implicit connection =>
      SQL("select * from ox_entity where id = {id}").on('id -> id).as(Entity.simple.singleOpt)
    }
  }

  /**
   * Retrieve an Entity from the uid.
   */
  def findById(uid: String): Option[Entity] = {
    DB.withConnection { implicit connection =>
      SQL("select * from ox_entity where uid = {uid}").on('ui -> uid).as(Entity.simple.singleOpt)
    }
  }
 
   /**
   * Return a page of Entities.
   *
   * @param page Page to display
   * @param pageSize Number of entities per page
   * @param orderBy Entity property used for sorting
   * @param filter Filter applied on the name column
   */
  def list(page: Int = 0, pageSize: Int = 10, orderBy: Int = 1, filter: String = "%"): Page[Entity] = {
    
    val offest = pageSize * page
    
    DB.withConnection { implicit connection =>
      
      val entities = SQL(
        """
          select ox_entity.* from ox_entity
          where ox_entity.name like {filter} 
             or ox_entity.tablename like {filter} 
             or ox_entity.uid like {filter}
          order by {orderBy} nulls last
          limit {pageSize} offset {offset}
        """
      ).on(
        'pageSize -> pageSize, 
        'offset -> offest,
        'filter -> filter,
        'orderBy -> orderBy
      ).as(Entity.simple *)

      val totalRows = SQL(
        """
          select count(*) from ox_entity 
          where ox_entity.name like {filter} 
             or ox_entity.tablename like {filter} 
        """
      ).on(
        'filter -> filter
      ).as(scalar[Long].single)

      Page(entities, page, offest, totalRows)
      
    }
    
  }
  
  /**
   * Create a new Entity.
   *
   * @param entity The Entity values.
   */
  def create(entity: Entity): Unit = {
    DB.withConnection { implicit connection =>
      SQL("insert into ox_entity(uid, name, tablename) values ({uid}, {name}, {tablename})").on(
        'uid -> entity.uid,
        'name -> entity.name,
        'tablename -> entity.tablename
      ).executeInsert()
    }
  }

  /**
   * Update an entity.
   *
   * @param id The Entity id
   * @param entity The Entity values.
   */
  def update(id: Long, entity: Entity) = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          update computer
          set name = {name}
          where id = {id}
        """
      ).on(
        'id -> id,
        'name -> entity.name
      ).executeUpdate()
    }
  }

  /**
   * Does an Entity UID exists ?
   *
   * @param uid The UID value.
   * @return boolean
   */
  def existsUID(uid: String): Boolean = {
    DB.withConnection { implicit connection =>
      val firstrow = SQL("select count(1) as c from ox_entity where uid = {uid}").on('uid -> uid).apply().head
      val count = firstrow[Long]("c")
      count > 0
    }
  }

  /**
   * Does an Entity tablename exists ?
   *
   * @param tablename The tablename value.
   * @return boolean
   */
  def existsTablename(tablename: String): Boolean = {
    DB.withConnection { implicit connection =>
      val firstrow = SQL("select count(1) as c from ox_entity where tablename = {tablename}").on('tablename -> tablename).apply().head
      val count = firstrow[Long]("c")
      count > 0
    }
  }

}