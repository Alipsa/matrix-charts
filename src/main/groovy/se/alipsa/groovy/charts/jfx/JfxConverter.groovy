package se.alipsa.groovy.charts.jfx

import javafx.scene.chart.XYChart
import se.alipsa.groovy.charts.AreaChart
import se.alipsa.groovy.charts.BarChart
import se.alipsa.groovy.charts.Chart
import se.alipsa.groovy.charts.PieChart

class JfxConverter {

    static javafx.scene.chart.Chart convert(Chart chart) {
        if (chart instanceof AreaChart) {
            return JfxAreaChartConverter.convert((AreaChart) chart)
        } else if (chart instanceof BarChart) {
            return JfxBarChartConverter.convert((BarChart) chart)
        } else if (chart instanceof PieChart) {
            return JfxPieChartConverter.convert((PieChart) chart)
        }
        throw new RuntimeException(chart.getClass().getSimpleName() + " conversion is not yet implemented")
    }

    static javafx.scene.chart.AreaChart<?,?> convert(AreaChart chart) {
        return JfxAreaChartConverter.convert(chart)
    }

    static XYChart<?,?> convert(BarChart chart) {
        return JfxBarChartConverter.convert(chart)
    }

    static javafx.scene.chart.PieChart convert(PieChart chart) {
        return JfxPieChartConverter.convert(chart)
    }
}
