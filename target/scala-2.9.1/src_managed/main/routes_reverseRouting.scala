// @SOURCE:/home/vincent/Development/workspaces/oxygenERP/conf/routes
// @HASH:1813498838cbcc2250be8bf5765741c82d0b49fb
// @DATE:Mon May 14 00:45:30 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseEntities {
    


 
// @LINE:11
def blank() = {
   Call("GET", "/admin/ad/entities/create")
}
                                                        
 
// @LINE:12
def edit(id:Long) = {
   Call("GET", "/admin/ad/entities/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:9
def list(p:Int = 0, s:Int = 2, f:String = "") = {
   Call("GET", "/admin/ad/entities" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == 2) None else Some(implicitly[QueryStringBindable[Int]].unbind("s", s)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                        
 
// @LINE:10
def create() = {
   Call("POST", "/admin/ad/entities/create")
}
                                                        

                      
    
}
                            

// @LINE:8
class ReverseAdminAD {
    


 
// @LINE:8
def index() = {
   Call("GET", "/admin/ad")
}
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:15
class ReverseAssets {
    


 
// @LINE:15
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseEntities {
    


 
// @LINE:11
def blank = JavascriptReverseRoute(
   "controllers.Entities.blank",
   """
      function() {
      return _wA({method:"GET", url:"/admin/ad/entities/create"})
      }
   """
)
                                                        
 
// @LINE:12
def edit = JavascriptReverseRoute(
   "controllers.Entities.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/admin/ad/entities/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:9
def list = JavascriptReverseRoute(
   "controllers.Entities.list",
   """
      function(p,s,f) {
      return _wA({method:"GET", url:"/admin/ad/entities" + _qS([(p == """ +  implicitly[JavascriptLitteral[Int]].to(0) + """ ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == """ +  implicitly[JavascriptLitteral[Int]].to(2) + """ ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("s", s)), (f == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                                                        
 
// @LINE:10
def create = JavascriptReverseRoute(
   "controllers.Entities.create",
   """
      function() {
      return _wA({method:"POST", url:"/admin/ad/entities/create"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:8
class ReverseAdminAD {
    


 
// @LINE:8
def index = JavascriptReverseRoute(
   "controllers.AdminAD.index",
   """
      function() {
      return _wA({method:"GET", url:"/admin/ad"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:15
class ReverseAssets {
    


 
// @LINE:15
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseEntities {
    


 
// @LINE:11
def blank() = new play.api.mvc.HandlerRef(
   controllers.Entities.blank(), HandlerDef(this, "controllers.Entities", "blank", Seq())
)
                              
 
// @LINE:12
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Entities.edit(id), HandlerDef(this, "controllers.Entities", "edit", Seq(classOf[Long]))
)
                              
 
// @LINE:9
def list(p:Int, s:Int, f:String) = new play.api.mvc.HandlerRef(
   controllers.Entities.list(p, s, f), HandlerDef(this, "controllers.Entities", "list", Seq(classOf[Int], classOf[Int], classOf[String]))
)
                              
 
// @LINE:10
def create() = new play.api.mvc.HandlerRef(
   controllers.Entities.create(), HandlerDef(this, "controllers.Entities", "create", Seq())
)
                              

                      
    
}
                            

// @LINE:8
class ReverseAdminAD {
    


 
// @LINE:8
def index() = new play.api.mvc.HandlerRef(
   controllers.AdminAD.index(), HandlerDef(this, "controllers.AdminAD", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:15
class ReverseAssets {
    


 
// @LINE:15
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                