import play.api._
import helpers._

object Global extends GlobalSettings {
  
  override def onStart(app: Application) {
  	
  	//println(SetupHelper.isNew)

    Logger.info("Oxygen ERP has started")
  }  
  
  override def onStop(app: Application) {
    Logger.info("Oxygen ERP shutdown...")
  }  
}