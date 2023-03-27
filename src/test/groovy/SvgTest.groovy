import org.junit.jupiter.api.Test
import se.alipsa.groovy.charts.AreaChart
import se.alipsa.groovy.charts.BarChart
import se.alipsa.groovy.charts.ChartType
import se.alipsa.groovy.charts.Plot
import se.alipsa.groovy.matrix.TableMatrix

import java.time.LocalDate

import static org.junit.jupiter.api.Assertions.assertTrue
import static se.alipsa.groovy.matrix.ListConverter.toLocalDates

class SvgTest {

    def empData = TableMatrix.create(
            emp_id: 1..5,
            emp_name: ["Rick","Dan","Michelle","Ryan","Gary"],
            salary: [623.3,515.2,611.0,729.0,843.25],
            start_date: toLocalDates("2012-01-01", "2013-09-23", "2014-11-15", "2014-05-11", "2015-03-27"),
            [int, String, Number, LocalDate]
    )

    @Test
    void testBarchartToSvg() {
        def file = File.createTempFile("barchart", ".svg")
        BarChart chart = BarChart.createVertical("Salaries", empData, "emp_name", ChartType.NONE, "salary")
        try {
            Plot.svg(chart, file)
            println("Wrote $file")
            assertTrue(file.exists())
        } catch (UnsatisfiedLinkError e) {
            println "No graphics environment available: $e, skipping test"
        }
    }

    @Test
    void testAreaChartToPng() {
        def file = File.createTempFile("areaChart", ".png")
        AreaChart chart = AreaChart.create("Salaries", empData, "emp_name", "salary")
        try {
            Plot.png(chart, file, 1024, 768)
            println("Wrote $file")
            assertTrue(file.exists())
        } catch (UnsatisfiedLinkError e) {
            println "No graphics environment available: $e, skipping test"
        }
    }
}
