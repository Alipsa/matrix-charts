package se.alipsa.groovy.charts.xchart

import org.knowm.xchart.XYChart
import org.knowm.xchart.XYChartBuilder
import se.alipsa.groovy.charts.AreaChart
import se.alipsa.groovy.matrix.ListConverter

class XchartAreaChartConverter {

    static XYChart convert(AreaChart areaChart) {
        XYChart chart = new XYChartBuilder()
                .width(600)
                .height(400)
                .title(areaChart.title)
                .xAxisTitle(areaChart.xAxisTitle)
                .yAxisTitle(areaChart.yAxisTitle)
                .build()
        def values = ListConverter.convert(areaChart.valueSeries[0], Double)
        chart.addSeries(areaChart.title, areaChart.categorySeries, values)
        return chart
    }
}
