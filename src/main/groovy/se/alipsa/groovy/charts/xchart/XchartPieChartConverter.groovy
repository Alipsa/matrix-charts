package se.alipsa.groovy.charts.xchart

import org.knowm.xchart.PieChart
import org.knowm.xchart.PieChartBuilder
import se.alipsa.groovy.matrix.ListConverter

class XchartPieChartConverter {

    static PieChart convert(se.alipsa.groovy.charts.PieChart pieChart) {
        def chart = new PieChartBuilder()
                .width(800)
                .height(600)
                .title(pieChart.title)
                .build()

        def values = ListConverter.convert(pieChart.valueSeries[0], Double)
        for (int i = 0; i < values.size(); i++) {
            chart.addSeries(String.valueOf(pieChart.categorySeries[i]), values[i])
        }
        return chart
    }
}
