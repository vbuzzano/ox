package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._

import models._

import anorm._

object Entities extends Controller {

  def index = Action {
    Ok
  }

  /**
   * Entity Create Form definition.
   */
  val entityForm :Form[Entity] = Form(
    
    // Defines a mapping that will handle Entity value
    mapping(
      "id" -> ignored(NotAssigned:Pk[Long]),
      "uid" -> nonEmptyText(5, 36)
              .verifying("UID must be unique", fields => fields match { 
                     case (uid) => !Entity.existsUID(uid) 
              }),
      "name" -> nonEmptyText(5, 100),
      "tablename" -> nonEmptyText(5, 60)
              .verifying("Tablename must be unique", fields => fields match { 
                     case (tablename) => !Entity.existsTablename(tablename) 
              })
    )(Entity.apply)(Entity.unapply)
  )

  /**
   * Entity Create Form definition.
   */
  val entityEditForm :Form[Entity] = Form(
    
    // Defines a mapping that will handle Entity value
    mapping(
      "id" -> ignored(NotAssigned:Pk[Long]),
      "uid" -> nonEmptyText(5, 36)
              .verifying("UID must be unique", fields => fields match { 
                     case (uid) => !Entity.existsUID(uid) 
              }),
      "name" -> nonEmptyText(5, 100),
      "tablename" -> nonEmptyText(5, 60)
              .verifying("Tablename must be unique", fields => fields match { 
                     case tablename => !Entity.existsTablename(tablename) 
              })
    )(Entity.apply)(Entity.unapply)
  )

  
    /**
   * Display the paginated list of entities.
   *
   * @param page Current page number (starts from 0)
   * @param orderBy Column to be sorted
   * @param filter Filter applied on entitiy name
   */
  def list(page: Int, orderBy: Int, filter: String) = Action { implicit request =>
    Ok(views.html.admin.ad.entity.list(
      Entity.list(page = page, orderBy = orderBy, filter = ("%"+filter+"%")),
      orderBy, filter
    ))
  }

  /**
   * Display the 'new entity form'.
   */
  def blank = Action {
  	Ok(views.html.admin.ad.entity.blank(entityForm.fill(new Entity)))
  }

  /**
   * Handle the 'new entity form' submission.
   */
  def create = Action { implicit request =>
   entityForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.admin.ad.entity.blank(formWithErrors)),
      entity => {
        try { 
          Entity.create(entity)
          Redirect(routes.Entities.list()).flashing("success" -> "Entity %s has been created".format(entity.name))
        } catch {
          case e => { println(e); BadRequest(views.html.admin.ad.entity.blank(entityForm.fill(entity)))}
      	}
      }
    )
  }

  /**
   * Display the 'edit form' of a existing Entity.
   *
   * @param id Id of the Entity to edit
   */
  def edit(id: Long) = Action {
    Entity.findById(id).map { entity =>
      Ok(views.html.admin.ad.entity.edit(id, entityEditForm.fill(entity)))
    }.getOrElse(NotFound)
  }

  /**
   * Handle the 'edit form' submission 
   *
   * @param id Id of the Entity to edit
   */
  def update(id: Long) = Action { implicit request =>
    entityForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.admin.ad.entity.edit(id, formWithErrors)),
      entity => {
        Entity.update(id, entity)
        Redirect(routes.Entities.list()).flashing("success" -> "Entity %s has been updated".format(entity.name))
      }
    )
  }
  
}
