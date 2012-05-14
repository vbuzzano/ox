
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Page[Entity],Int,String,play.api.mvc.Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: Page[Entity], currentOrderBy: Int, currentFilter: String)(implicit flash: play.api.mvc.Flash):play.api.templates.Html = {
        _display_ {
def /*16.2*/header/*16.8*/(orderBy: Int, title: String):play.api.templates.Html = {_display_(

Seq(format.raw/*16.41*/("""
    <th class="col"""),_display_(Seq(/*17.20*/orderBy)),format.raw/*17.27*/(""" header """),_display_(Seq(/*17.36*/if(scala.math.abs(currentOrderBy) == orderBy){/*17.83*/{if(currentOrderBy < 0) "headerSortDown" else "headerSortUp"}})),format.raw/*17.144*/("""">
        <a href=""""),_display_(Seq(/*18.19*/link(0, Some(orderBy)))),format.raw/*18.41*/("""">"""),_display_(Seq(/*18.44*/title)),format.raw/*18.49*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage: Int, newOrderBy: Option[Int] = None) = {{
    routes.Entities.list(newPage, newOrderBy.map { orderBy =>
        if(orderBy == scala.math.abs(currentOrderBy)) -currentOrderBy else orderBy
    }.getOrElse(currentOrderBy), currentFilter)
    
}};
Seq(format.raw/*1.109*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*11.2*/("""

"""),format.raw/*15.37*/("""
"""),format.raw/*20.2*/("""

"""),_display_(Seq(/*22.2*/main("Entities Manager", "admin")/*22.35*/ {_display_(Seq(format.raw/*22.37*/("""
   <div class="page-header"><h1>Entities manager</h1></div>	

    """),_display_(Seq(/*25.6*/flash/*25.11*/.get("success").map/*25.30*/ { message =>_display_(Seq(format.raw/*25.43*/("""
        <div class="alert alert-success">
            <strong>Done!</strong> """),_display_(Seq(/*27.37*/message)),format.raw/*27.44*/("""
        </div>
    """)))})),format.raw/*29.6*/("""

    <div id="actions">
            """),_display_(Seq(/*32.14*/helper/*32.20*/.form(action=routes.Entities.list(), args = 'class -> "well form-search")/*32.93*/ {_display_(Seq(format.raw/*32.95*/("""
                <input type="search" id="searchbox" name="f" value=""""),_display_(Seq(/*33.70*/currentFilter)),format.raw/*33.83*/("""" placeholder="Filter by entity name, tablename or uid..." class="input-medium search-query">
                <input type="submit" id="searchsubmit" value="Filter" class="btn btn-primary">

	            <div style="float:right"><a class="btn btn-success" id="add" href=""""),_display_(Seq(/*36.82*/routes/*36.88*/.Entities.blank())),format.raw/*36.105*/("""">Add a new entity</a></div>
            """)))})),format.raw/*37.14*/("""
    </div>

    """),_display_(Seq(/*40.6*/Option(currentPage.items)/*40.31*/.filterNot(_.isEmpty).map/*40.56*/ { entities =>_display_(Seq(format.raw/*40.70*/("""
        
        <table class="entities table table-striped">
            <thead>
                <tr>
                    """),_display_(Seq(/*45.22*/header(3, "Entity name"))),format.raw/*45.46*/("""
                    """),_display_(Seq(/*46.22*/header(4, "Table name"))),format.raw/*46.45*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq(/*51.18*/entities/*51.26*/.map/*51.30*/ {/*52.21*/case entity =>/*52.35*/ {_display_(Seq(format.raw/*52.37*/("""
                        <tr>
                            <td><a href=""""),_display_(Seq(/*54.43*/routes/*54.49*/.Entities.edit(entity.id.get))),format.raw/*54.78*/("""">"""),_display_(Seq(/*54.81*/entity/*54.87*/.name)),format.raw/*54.92*/("""</a></td>
                            <td>"""),_display_(Seq(/*55.34*/entity/*55.40*/.tablename)),format.raw/*55.50*/("""</td>
                        </tr>
                    """)))}})),format.raw/*58.18*/("""

            </tbody>
        </table>
        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq(/*64.18*/currentPage/*64.29*/.prev.map/*64.38*/ { page =>_display_(Seq(format.raw/*64.48*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq(/*66.35*/link(page))),format.raw/*66.45*/("""">&larr; Previous</a>
                    </li> 
                """)))}/*68.18*/.getOrElse/*68.28*/ {_display_(Seq(format.raw/*68.30*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*72.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq(/*74.36*/(currentPage.offset + 1))),format.raw/*74.60*/(""" to """),_display_(Seq(/*74.65*/(currentPage.offset + entities.size))),format.raw/*74.101*/(""" of """),_display_(Seq(/*74.106*/currentPage/*74.117*/.total)),format.raw/*74.123*/("""</a>
                </li>
                """),_display_(Seq(/*76.18*/currentPage/*76.29*/.next.map/*76.38*/ { page =>_display_(Seq(format.raw/*76.48*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq(/*78.35*/link(page))),format.raw/*78.45*/("""">Next &rarr;</a>
                    </li> 
                """)))}/*80.18*/.getOrElse/*80.28*/ {_display_(Seq(format.raw/*80.30*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*84.18*/("""
            </ul>
        </div>
        
    """)))}/*88.6*/.getOrElse/*88.16*/ {_display_(Seq(format.raw/*88.18*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))})),format.raw/*94.6*/("""
""")))})))}
    }
    
    def render(currentPage:Page[Entity],currentOrderBy:Int,currentFilter:String,flash:play.api.mvc.Flash) = apply(currentPage,currentOrderBy,currentFilter)(flash)
    
    def f:((Page[Entity],Int,String) => (play.api.mvc.Flash) => play.api.templates.Html) = (currentPage,currentOrderBy,currentFilter) => (flash) => apply(currentPage,currentOrderBy,currentFilter)(flash)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 14 00:54:31 CEST 2012
                    SOURCE: /home/vincent/Development/workspaces/oxygenERP/app/views/admin/ad/entity/list.scala.html
                    HASH: 872b6ab1dbf72a5335825f58eeb151db2aa20b2b
                    MATRIX: 556->1|724->604|738->610|830->643|881->663|910->670|950->679|1005->726|1090->787|1142->808|1186->830|1220->833|1247->838|1285->237|1296->241|1573->108|1602->235|1630->492|1660->602|1688->854|1721->857|1763->890|1798->892|1896->960|1910->965|1938->984|1984->997|2094->1076|2123->1083|2175->1104|2244->1142|2259->1148|2341->1221|2376->1223|2477->1293|2512->1306|2814->1577|2829->1583|2869->1600|2943->1642|2991->1660|3025->1685|3059->1710|3106->1724|3262->1849|3308->1873|3361->1895|3406->1918|3519->2000|3536->2008|3549->2012|3560->2036|3583->2050|3618->2052|3721->2124|3736->2130|3787->2159|3821->2162|3836->2168|3863->2173|3937->2216|3952->2222|3984->2232|4074->2307|4228->2430|4248->2441|4266->2450|4309->2460|4413->2533|4445->2543|4530->2609|4549->2619|4584->2621|4754->2759|4858->2832|4904->2856|4940->2861|4999->2897|5036->2902|5057->2913|5086->2919|5161->2963|5181->2974|5199->2983|5242->2993|5346->3066|5378->3076|5459->3138|5478->3148|5513->3150|5679->3284|5745->3332|5764->3342|5799->3344|5936->3450
                    LINES: 19->1|21->16|21->16|23->16|24->17|24->17|24->17|24->17|24->17|25->18|25->18|25->18|25->18|27->6|27->6|33->1|35->5|36->11|38->15|39->20|41->22|41->22|41->22|44->25|44->25|44->25|44->25|46->27|46->27|48->29|51->32|51->32|51->32|51->32|52->33|52->33|55->36|55->36|55->36|56->37|59->40|59->40|59->40|59->40|64->45|64->45|65->46|65->46|70->51|70->51|70->51|70->52|70->52|70->52|72->54|72->54|72->54|72->54|72->54|72->54|73->55|73->55|73->55|75->58|81->64|81->64|81->64|81->64|83->66|83->66|85->68|85->68|85->68|89->72|91->74|91->74|91->74|91->74|91->74|91->74|91->74|93->76|93->76|93->76|93->76|95->78|95->78|97->80|97->80|97->80|101->84|105->88|105->88|105->88|111->94
                    -- GENERATED --
                */
            