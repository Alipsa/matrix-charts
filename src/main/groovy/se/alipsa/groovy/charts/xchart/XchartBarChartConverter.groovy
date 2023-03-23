package se.alipsa.groovy.charts.xchart

import org.knowm.xchart.CategoryChart
import org.knowm.xchart.CategoryChartBuilder
import se.alipsa.groovy.charts.BarChart
import se.alipsa.groovy.matrix.ListConverter

class XchartBarChartConverter {

    static CategoryChart convert(BarChart barChart) {

        CategoryChart chart =
                new CategoryChartBuilder()
                        .width(800)
                        .height(600)
                        .title(barChart.title)
                        .xAxisTitle(barChart.xAxisTitle)
                        .yAxisTitle(barChart.yAxisTitle)
                        .build()

        def values = ListConverter.convert(barChart.valueSeries[0], Double)
        chart.addSeries(barChart.title, barChart.categorySeries, values)
        return chart
    }
}
