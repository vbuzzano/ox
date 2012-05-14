
package views.html.admin.ad

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq(_display_(Seq(/*1.2*/main("Application Dictionary", "admin")/*1.41*/ {_display_(Seq(format.raw/*1.43*/("""
    <div class="page-header"><h1>Application Dictionary</h1></div>	
	<a href=""""),_display_(Seq(/*3.12*/routes/*3.18*/.Entities.list())),format.raw/*3.34*/("""">Entity manager</a>
""")))})),format.raw/*4.2*/("""

"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 14 00:28:27 CEST 2012
                    SOURCE: /home/vincent/Development/workspaces/oxygenERP/app/views/admin/ad/index.scala.html
                    HASH: 294c876d89ab52bdd3d927d75bf4921af5d1d71d
                    MATRIX: 577->1|624->40|658->42|768->122|782->128|819->144|871->166
                    LINES: 22->1|22->1|22->1|24->3|24->3|24->3|25->4
                    -- GENERATED --
                */
            