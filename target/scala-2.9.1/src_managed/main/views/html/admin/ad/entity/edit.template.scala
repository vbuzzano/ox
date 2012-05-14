
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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Entity],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, entityForm: Form[Entity]):play.api.templates.Html = {
        _display_ {import helper.FieldConstructor

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq(format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.75*/(""" 

"""),_display_(Seq(/*7.2*/main("Application Dictionary", "admin")/*7.41*/ {_display_(Seq(format.raw/*7.43*/("""
    <div class="page-header">
        """),_display_(Seq(/*9.10*/helper/*9.16*/.form(routes.Application.index, 'class -> "float-right")/*9.72*/ {_display_(Seq(format.raw/*9.74*/("""
            <input type="submit" value="Delete this entity" class="btn btn-danger">
        """)))})),format.raw/*11.10*/("""
        <h1>Edit entity</h1>
    </div>	

    """),_display_(Seq(/*15.6*/helper/*15.12*/.form(action = routes.Entities.create, args = 'class -> "form-horizontal")/*15.86*/ {_display_(Seq(format.raw/*15.88*/("""

        <fieldset>
	        """),_display_(Seq(/*18.11*/helper/*18.17*/.inputText(
	            entityForm("name"),
	            '_label -> "Entity name"
	        ))),format.raw/*21.11*/("""

            <div class="control-group" id="tablename_field">
                <label class="control-label">Table name</label>
                <div class="controls">
                    <span class="input-label">"""),_display_(Seq(/*26.48*/entityForm("tablename")/*26.71*/.value)),format.raw/*26.77*/("""</label>
                </div>
            </div>

            <div class="control-group" id="uid_field">
                <label class="control-label">Entity UID</label>
                <div class="controls">
                    <span class="input-label">"""),_display_(Seq(/*33.48*/entityForm("uid")/*33.65*/.value)),format.raw/*33.71*/("""</label>
                </div>
            </div>	

            <div class="control-group" id="id_field">
                <label class="control-label">Entity Id</label>
                <div class="controls">
                    <span class="input-label">"""),_display_(Seq(/*40.48*/id)),format.raw/*40.50*/("""</label>
                    <input type="hidden" name="id" value=""""),_display_(Seq(/*41.60*/id)),format.raw/*41.62*/(""""/>
                </div>
            </div>	
		</fieldset>

        <div class="form-actions">
            <input type="submit" class="btn btn-primary" value="Update this entity"> or <a href=""""),_display_(Seq(/*47.99*/routes/*47.105*/.Entities.list())),format.raw/*47.121*/("""" class="btn">Cancel</a>
        </div>
    """)))})),format.raw/*49.6*/("""	

""")))})),format.raw/*51.2*/("""
"""))}
    }
    
    def render(id:Long,entityForm:Form[Entity]) = apply(id,entityForm)
    
    def f:((Long,Form[Entity]) => play.api.templates.Html) = (id,entityForm) => apply(id,entityForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 14 01:34:42 CEST 2012
                    SOURCE: /home/vincent/Development/workspaces/oxygenERP/app/views/admin/ad/entity/edit.scala.html
                    HASH: 699d5929612a0add7dffdf2397219c38191eed0d
                    MATRIX: 531->1|667->73|699->97|773->37|801->71|829->146|862->150|909->189|943->191|1013->231|1027->237|1091->293|1125->295|1251->389|1329->437|1344->443|1427->517|1462->519|1524->550|1539->556|1654->649|1898->862|1930->885|1958->891|2246->1148|2272->1165|2300->1171|2587->1427|2611->1429|2710->1497|2734->1499|2960->1694|2976->1700|3015->1716|3091->1761|3126->1765
                    LINES: 19->1|22->5|22->5|23->1|25->4|26->5|28->7|28->7|28->7|30->9|30->9|30->9|30->9|32->11|36->15|36->15|36->15|36->15|39->18|39->18|42->21|47->26|47->26|47->26|54->33|54->33|54->33|61->40|61->40|62->41|62->41|68->47|68->47|68->47|70->49|72->51
                    -- GENERATED --
                */
            