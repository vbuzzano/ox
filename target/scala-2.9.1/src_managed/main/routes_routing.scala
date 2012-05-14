// @SOURCE:/home/vincent/Development/workspaces/oxygenERP/conf/routes
// @HASH:1813498838cbcc2250be8bf5765741c82d0b49fb
// @DATE:Mon May 14 00:45:30 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:8
val controllers_AdminAD_index1 = Route("GET", PathPattern(List(StaticPart("/admin/ad"))))
                    

// @LINE:9
val controllers_Entities_list2 = Route("GET", PathPattern(List(StaticPart("/admin/ad/entities"))))
                    

// @LINE:10
val controllers_Entities_create3 = Route("POST", PathPattern(List(StaticPart("/admin/ad/entities/create"))))
                    

// @LINE:11
val controllers_Entities_blank4 = Route("GET", PathPattern(List(StaticPart("/admin/ad/entities/create"))))
                    

// @LINE:12
val controllers_Entities_edit5 = Route("GET", PathPattern(List(StaticPart("/admin/ad/entities/edit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:15
val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/admin/ad""","""controllers.AdminAD.index"""),("""GET""","""/admin/ad/entities""","""controllers.Entities.list(p:Int ?= 0, s:Int ?= 2, f:String ?= "")"""),("""POST""","""/admin/ad/entities/create""","""controllers.Entities.create"""),("""GET""","""/admin/ad/entities/create""","""controllers.Entities.blank"""),("""GET""","""/admin/ad/entities/edit/$id<[^/]+>""","""controllers.Entities.edit(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:8
case controllers_AdminAD_index1(params) => {
   call { 
        invokeHandler(_root_.controllers.AdminAD.index, HandlerDef(this, "controllers.AdminAD", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Entities_list2(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[Int]("s", Some(2)), params.fromQuery[String]("f", Some(""))) { (p, s, f) =>
        invokeHandler(_root_.controllers.Entities.list(p, s, f), HandlerDef(this, "controllers.Entities", "list", Seq(classOf[Int], classOf[Int], classOf[String])))
   }
}
                    

// @LINE:10
case controllers_Entities_create3(params) => {
   call { 
        invokeHandler(_root_.controllers.Entities.create, HandlerDef(this, "controllers.Entities", "create", Nil))
   }
}
                    

// @LINE:11
case controllers_Entities_blank4(params) => {
   call { 
        invokeHandler(_root_.controllers.Entities.blank, HandlerDef(this, "controllers.Entities", "blank", Nil))
   }
}
                    

// @LINE:12
case controllers_Entities_edit5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Entities.edit(id), HandlerDef(this, "controllers.Entities", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:15
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                