package helpers

import play.api._
import play.api.db._
import play.api.Play.current
import anorm._

object SetupHelper {

  def isNew = {
  	
  	DB.withConnection { implicit c =>
  		SQL("SELECT ox_entity FROM information_schema.tables WHERE table_schema =  AND table_name = 'tablename';").execute()    
	} 
  } 

}