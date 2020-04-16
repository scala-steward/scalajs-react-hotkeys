package react.hotkeys

import utest._
import japgolly.scalajs.react.test._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import org.scalajs.dom.document
import scala.scalajs.js.annotation.JSGlobal
import org.scalajs.dom.raw.HTMLElement

/*@js.native
@JSImport("highcharts", JSImport.Default)
object Highcharts extends TypeofHighcharts

@js.native
@JSGlobal("console")
object consoleObj extends js.Object

@js.native
@JSImport("util", JSImport.Namespace)
object UtilObj extends js.Object*/

object MainTest extends TestSuite {
  // val console = consoleObj.asInstanceOf[js.Dynamic]
  // val util = UtilObj.asInstanceOf[js.Dynamic]
    
  val tests = Tests {
    /*test("render") {
      val chart = Chart(Highcharts.defaultOptions)
      ReactTestUtils.withRenderedIntoDocument(chart) { m =>
        val html = m.outerHtmlScrubbed()
        val normalizedHTML = html.replaceAll(" id=\"highcharts-\\w{7}-\\d-?\"", "")
        assert(normalizedHTML == """<div data-highcharts-chart="0" style="overflow: hidden;"><div style="position: relative; overflow: hidden; width: 600px; height: 400px; text-align: left; line-height: normal; z-index: 0;" dir="ltr" class="highcharts-container "><svg version="1.1" class="highcharts-root" style="font-family:&quot;Lucida Grande&quot;, &quot;Lucida Sans Unicode&quot;, Arial, Helvetica, sans-serif;font-size:12px;" xmlns="http://www.w3.org/2000/svg" width="600" height="400" viewBox="0 0 600 400"><desc>Created with Highcharts 7.2.1</desc><defs><clipPath><rect x="0" y="0" width="580" height="375" fill="none"></rect></clipPath></defs><rect fill="#ffffff" class="highcharts-background" x="0" y="0" width="600" height="400" rx="0" ry="0"></rect><rect fill="none" class="highcharts-plot-background" x="10" y="10" width="580" height="375"></rect><rect fill="none" class="highcharts-plot-border" data-z-index="1" x="10" y="10" width="580" height="375"></rect><g class="highcharts-series-group" data-z-index="3"></g><text x="300" text-anchor="middle" class="highcharts-title" data-z-index="4" style="color:#333333;font-size:18px;fill:#333333;" y="24"><tspan>Chart title</tspan></text><text x="300" text-anchor="middle" class="highcharts-subtitle" data-z-index="4" style="color:#666666;fill:#666666;" y="10"></text><text x="10" text-anchor="start" class="highcharts-caption" data-z-index="4" style="color:#666666;fill:#666666;" y="397"></text><g class="highcharts-legend" data-z-index="7"><rect fill="none" class="highcharts-legend-box" rx="0" ry="0" x="0" y="0" width="8" height="8" visibility="hidden"></rect><g data-z-index="1"><g></g></g></g><text x="590" class="highcharts-credits" text-anchor="end" data-z-index="8" style="cursor:pointer;color:#999999;font-size:9px;fill:#999999;" y="395">Highcharts.com</text></svg></div></div>""")
      }


    }
  }*/
}
