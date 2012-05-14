
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
object summary extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Entity,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(entity: Entity):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.18*/("""

"""),_display_(Seq(/*3.2*/main("Entity")/*3.16*/ {_display_(Seq(format.raw/*3.18*/("""
    
    <h2>"""),_display_(Seq(/*5.10*/entity/*5.16*/.name)),format.raw/*5.21*/("""</h2>
    
    <h6>Table name</h6>
    
    <p>"""),_display_(Seq(/*9.9*/entity/*9.15*/.tablename)),format.raw/*9.25*/("""</p>
""")))})))}
    }
    
    def render(entity:Entity) = apply(entity)
    
    def f:((Entity) => play.api.templates.Html) = (entity) => apply(entity)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 13 23:47:52 CEST 2012
                    SOURCE: /home/vincent/Development/workspaces/oxygenERP/app/views/admin/ad/entity/summary.scala.html
                    HASH: 8816e8da4cb1780cc16a4e421c50729b3665f979
                    MATRIX: 523->1|611->17|643->20|665->34|699->36|744->51|758->57|784->62|861->110|875->116|906->126
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|26->5|30->9|30->9|30->9
                    -- GENERATED --
                */
            