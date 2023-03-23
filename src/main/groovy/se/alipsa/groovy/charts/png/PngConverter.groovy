package se.alipsa.groovy.charts.png

import org.knowm.xchart.BitmapEncoder
import se.alipsa.groovy.charts.AreaChart
import se.alipsa.groovy.charts.BarChart
import se.alipsa.groovy.charts.Chart
import se.alipsa.groovy.charts.PieChart
import se.alipsa.groovy.charts.xchart.*

class PngConverter {

    static void convert(Chart chart, OutputStream out) throws IOException {
        def xChart
        if (chart instanceof BarChart) {
            xChart = XchartBarChartConverter.convert(chart as BarChart)

        } else if (chart instanceof AreaChart) {
            xChart = XchartAreaChartConverter.convert(chart as AreaChart)

        } else if (chart instanceof PieChart) {
            xChart = XchartPieChartConverter.convert(chart as PieChart)

        } else {
            throw new RuntimeException("$Chart.class is not yet implemented")
        }
        BitmapEncoder.saveBitmap(xChart, out, BitmapEncoder.BitmapFormat.PNG)
    }
}
