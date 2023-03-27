package se.alipsa.groovy.charts.svg

import javafx.embed.swing.JFXPanel
import se.alipsa.groovy.charts.Chart
import se.alipsa.groovy.charts.jfx.JfxConverter

class SvgConverter {

    static void convert(Chart chart, BufferedWriter out) {
        new JFXPanel()
        new org.jfxconverter.drivers.svg.SVGConverter()
            .convert(JfxConverter.convert(chart), out)
    }
}
