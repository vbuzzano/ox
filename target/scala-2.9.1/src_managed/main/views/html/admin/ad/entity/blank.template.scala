
package views.html.admin.ad.entity

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
object blank extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Entity],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[Entity]):play.api.templates.Html = {
        _display_ {import helper.FieldConstructor

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq(format.raw/*1.22*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.75*/(""" 

"""),_display_(Seq(/*7.2*/main("Application Dictionary", "admin")/*7.41*/ {_display_(Seq(format.raw/*7.43*/("""
    <div class="page-header"><h1>Create a new entity</h1></div>	
    
    """),_display_(Seq(/*10.6*/helper/*10.12*/.form(action = routes.Entities.create, args = 'class -> "form-horizontal")/*10.86*/ {_display_(Seq(format.raw/*10.88*/("""

        <fieldset>

	        """),_display_(Seq(/*14.11*/helper/*14.17*/.inputText(
	            form("name"),
	            '_label -> "Entity name"
	        ))),format.raw/*17.11*/("""
	
	        """),_display_(Seq(/*19.11*/helper/*19.17*/.inputText(
	            form("tablename"),
	            '_label -> "Table name"
	        ))),format.raw/*22.11*/("""

	        """),_display_(Seq(/*24.11*/helper/*24.17*/.inputText(
	            form("uid"),
	            '_label -> "Entity UID"
	        ))),format.raw/*27.11*/("""

		</fieldset>

        <div class="form-actions">
            <input type="submit" class="btn btn-primary" value="Create this entity"> or <a href=""""),_display_(Seq(/*32.99*/routes/*32.105*/.Entities.list())),format.raw/*32.121*/("""" class="btn">Cancel</a>
        </div>
    """)))})),format.raw/*34.6*/("""	
""")))})),format.raw/*35.2*/("""
"""))}
    }
    
    def render(form:Form[Entity]) = apply(form)
    
    def f:((Form[Entity]) => play.api.templates.Html) = (form) => apply(form)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 14 01:36:04 CEST 2012
                    SOURCE: /home/vincent/Development/workspaces/oxygenERP/app/views/admin/ad/entity/blank.scala.html
                    HASH: febabc2acf432eb9ee6ec1db08cbaba91ede0965
                    MATRIX: 527->1|647->57|679->81|753->21|781->55|809->130|842->134|889->173|923->175|1029->251|1044->257|1127->331|1162->333|1225->365|1240->371|1349->458|1393->471|1408->477|1521->568|1564->580|1579->586|1686->671|1867->821|1883->827|1922->843|1998->888|2032->891
                    LINES: 19->1|22->5|22->5|23->1|25->4|26->5|28->7|28->7|28->7|31->10|31->10|31->10|31->10|35->14|35->14|38->17|40->19|40->19|43->22|45->24|45->24|48->27|53->32|53->32|53->32|55->34|56->35
                    -- GENERATED --
                */
            