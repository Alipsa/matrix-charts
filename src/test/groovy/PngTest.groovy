import org.junit.jupiter.api.Test

import java.time.LocalDate
import se.alipsa.groovy.matrix.*
import se.alipsa.groovy.charts.*

import static org.junit.jupiter.api.Assertions.*
import static se.alipsa.groovy.matrix.ListConverter.*

class PngTest {

    def empData = TableMatrix.create(
            emp_id: 1..5,
            emp_name: ["Rick","Dan","Michelle","Ryan","Gary"],
            salary: [623.3,515.2,611.0,729.0,843.25],
            start_date: toLocalDates("2012-01-01", "2013-09-23", "2014-11-15", "2014-05-11", "2015-03-27"),
            [int, String, Number, LocalDate]
    )

    @Test
    void testBarchartToPng() {
        def file = File.createTempFile("barchart", ".png")
        BarChart chart = BarChart.createVertical("Salaries", empData, "emp_name", ChartType.NONE, "salary")
        try {
            Plot.png(chart, file, 600, 400)
            println("Wrote $file")
            assertTrue(file.exists())
        } catch (UnsatisfiedLinkError | NoClassDefFoundError e) {
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
        } catch (UnsatisfiedLinkError | NoClassDefFoundError e) {
            println "No graphics environment available: $e, skipping test"
        }
    }
}
