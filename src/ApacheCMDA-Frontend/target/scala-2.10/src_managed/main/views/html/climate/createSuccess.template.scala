
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object createSuccess extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Create Successfully")/*1.29*/ {_display_(Seq[Any](format.raw/*1.31*/("""
<html>
	<head> 
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
		<title>Create Successfully</title> 
		<style>
		body"""),format.raw/*7.7*/("""{"""),format.raw/*7.8*/("""
			text-align:center;
			margin-left:auto;
			margin-right:auto;
		"""),format.raw/*11.3*/("""}"""),format.raw/*11.4*/("""
		</style>
	</head> 
	<body> 
		<h1>Congratulations!</h1>
		<h3>Registration has been successful.</h3>
		<script type="text/javascript"> 
		var t=5; // set the time of re-directing
		setInterval("refer()",1000); // 1s start up
		function refer()"""),format.raw/*20.19*/("""{"""),format.raw/*20.20*/("""  
		    if(t==0)"""),format.raw/*21.15*/("""{"""),format.raw/*21.16*/(""" 
		        location='"""),_display_(Seq[Any](/*22.22*/routes/*22.28*/.Application.login())),format.raw/*22.48*/("""'; 
		    """),format.raw/*23.7*/("""}"""),format.raw/*23.8*/(""" 
		    document.getElementById('show').innerHTML="The page will be redirected to the home page in "
		    +""+t+" seconds";
		    t--; 
		"""),format.raw/*27.3*/("""}"""),format.raw/*27.4*/(""" 
		</script> 
		<span id="show"></span> 
	</body>
</html>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 17 21:24:32 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/app/views/climate/createSuccess.scala.html
                    HASH: c6c5702493468ad2f31b9a27a199efa6f322d748
                    MATRIX: 880->1|915->28|954->30|1124->174|1151->175|1246->243|1274->244|1548->490|1577->491|1622->508|1651->509|1710->532|1725->538|1767->558|1804->568|1832->569|1998->708|2026->709
                    LINES: 29->1|29->1|29->1|35->7|35->7|39->11|39->11|48->20|48->20|49->21|49->21|50->22|50->22|50->22|51->23|51->23|55->27|55->27
                    -- GENERATED --
                */
            