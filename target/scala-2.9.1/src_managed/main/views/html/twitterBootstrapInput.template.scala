
package views.html

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
object twitterBootstrapInput extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[views.html.helper.FieldElements,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(elements: views.html.helper.FieldElements):play.api.templates.Html = {
        _display_ {import play.api.i18n._

import views.html.helper._


Seq(format.raw/*1.45*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.52*/("""

<div class="control-group """),_display_(Seq(/*10.28*/elements/*10.36*/.args.get('_class))),format.raw/*10.54*/(""" """),_display_(Seq(/*10.56*/if(elements.hasErrors)/*10.78*/ {_display_(Seq(format.raw/*10.80*/("""error""")))})),format.raw/*10.86*/("""" id=""""),_display_(Seq(/*10.93*/elements/*10.101*/.args.get('_id).getOrElse(elements.id + "_field"))),format.raw/*10.150*/("""">
    <label class="control-label" for=""""),_display_(Seq(/*11.40*/elements/*11.48*/.id)),format.raw/*11.51*/("""">"""),_display_(Seq(/*11.54*/elements/*11.62*/.label(elements.lang))),format.raw/*11.83*/("""</label>
    <div class="controls">
        """),_display_(Seq(/*13.10*/elements/*13.18*/.input)),format.raw/*13.24*/("""
        <p class="help-inline">"""),_display_(Seq(/*14.33*/elements/*14.41*/.errors(elements.lang).mkString(", "))),format.raw/*14.78*/("""</p>
        <p class="help-block">"""),_display_(Seq(/*15.32*/elements/*15.40*/.infos(elements.lang).mkString(", "))),format.raw/*15.76*/("""</p> 
    </div>
</div>"""))}
    }
    
    def render(elements:views.html.helper.FieldElements) = apply(elements)
    
    def f:((views.html.helper.FieldElements) => play.api.templates.Html) = (elements) => apply(elements)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 13 23:47:52 CEST 2012
                    SOURCE: /home/vincent/Development/workspaces/oxygenERP/app/views/twitterBootstrapInput.scala.html
                    HASH: cbd9d6ba0b24f16b20afecf52b71818dd11f40ef
                    MATRIX: 546->1|712->44|740->98|768->254|828->283|845->291|885->309|918->311|949->333|984->335|1022->341|1060->348|1078->356|1150->405|1223->447|1240->455|1265->458|1299->461|1316->469|1359->490|1435->535|1452->543|1480->549|1544->582|1561->590|1620->627|1687->663|1704->671|1762->707
                    LINES: 19->1|25->1|27->5|28->8|30->10|30->10|30->10|30->10|30->10|30->10|30->10|30->10|30->10|30->10|31->11|31->11|31->11|31->11|31->11|31->11|33->13|33->13|33->13|34->14|34->14|34->14|35->15|35->15|35->15
                    -- GENERATED --
                */
            