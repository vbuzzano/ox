
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String, section: String = "home")(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.58*/("""

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>"""),_display_(Seq(/*7.13*/title)),format.raw/*7.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href=""""),_display_(Seq(/*13.18*/routes/*13.24*/.Assets.at("bootstrap/css/bootstrap.css"))),format.raw/*13.65*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq(/*14.18*/routes/*14.24*/.Assets.at("stylesheets/main.css"))),format.raw/*14.58*/("""" rel="stylesheet">
    <style>
      body """),format.raw("""{"""),format.raw/*16.13*/("""
        padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
      """),format.raw("""}"""),format.raw/*18.8*/("""
    </style>
    <link href="""""),_display_(Seq(/*20.19*/routes/*20.25*/.Assets.at("strap/css/bootstrap-responsive.css"))),format.raw/*20.73*/("""" rel="stylesheet">

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href=""""),_display_(Seq(/*28.38*/routes/*28.44*/.Assets.at("strap/ico/favicon.ico"))),format.raw/*28.79*/("""">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href=""""),_display_(Seq(/*29.69*/routes/*29.75*/.Assets.at("strap/ico/apple-touch-icon-144-precomposed.png"))),format.raw/*29.135*/("""">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href=""""),_display_(Seq(/*30.69*/routes/*30.75*/.Assets.at("strap/ico/apple-touch-icon-114-precomposed.png"))),format.raw/*30.135*/("""">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href=""""),_display_(Seq(/*31.67*/routes/*31.73*/.Assets.at("strap/ico/apple-touch-icon-72-precomposed.png"))),format.raw/*31.132*/("""">
    <link rel="apple-touch-icon-precomposed" href=""""),_display_(Seq(/*32.53*/routes/*32.59*/.Assets.at("strap/ico/apple-touch-icon-57-precomposed.png"))),format.raw/*32.118*/("""">
  </head>

  <body>

    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="/">Oxygen ERP</a>
          <div class="nav-collapse">
            <ul class="nav">
              <li """),_display_(Seq(/*48.20*/{if (section == "home") "class='active'"})),format.raw/*48.61*/("""><a href="/">Home</a></li>
              <li """),_display_(Seq(/*49.20*/{if (section == "admin") "class='active'"})),format.raw/*49.62*/("""><a href=""""),_display_(Seq(/*49.73*/routes/*49.79*/.AdminAD.index)),format.raw/*49.93*/("""">Admin</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">
        """),_display_(Seq(/*57.10*/content)),format.raw/*57.17*/("""
    </div> <!-- /container -->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src=""""),_display_(Seq(/*63.19*/routes/*63.25*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*63.70*/(""""></script>
    <script src=""""),_display_(Seq(/*64.19*/routes/*64.25*/.Assets.at("bootstrap/js/bootstrap.min.js"))),format.raw/*64.68*/(""""></script>
  </body>
</html>
"""))}
    }
    
    def render(title:String,section:String,content:Html) = apply(title,section)(content)
    
    def f:((String,String) => (Html) => play.api.templates.Html) = (title,section) => (content) => apply(title,section)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 14 01:12:48 CEST 2012
                    SOURCE: /home/vincent/Development/workspaces/oxygenERP/app/views/main.scala.html
                    HASH: 5790169e348ef986e0ae5465d34da0da8de648bb
                    MATRIX: 516->1|644->57|757->140|783->145|1016->347|1031->353|1094->394|1162->431|1177->437|1233->471|1324->515|1481->626|1544->658|1559->664|1629->712|1939->991|1954->997|2011->1032|2113->1103|2128->1109|2211->1169|2313->1240|2328->1246|2411->1306|2511->1375|2526->1381|2608->1440|2694->1495|2709->1501|2791->1560|3321->2059|3384->2100|3461->2146|3525->2188|3567->2199|3582->2205|3618->2219|3800->2370|3829->2377|4065->2582|4080->2588|4147->2633|4208->2663|4223->2669|4288->2712
                    LINES: 19->1|22->1|28->7|28->7|34->13|34->13|34->13|35->14|35->14|35->14|37->16|39->18|41->20|41->20|41->20|49->28|49->28|49->28|50->29|50->29|50->29|51->30|51->30|51->30|52->31|52->31|52->31|53->32|53->32|53->32|69->48|69->48|70->49|70->49|70->49|70->49|70->49|78->57|78->57|84->63|84->63|84->63|85->64|85->64|85->64
                    -- GENERATED --
                */
            