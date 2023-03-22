package se.alipsa.groovy.charts;

import se.alipsa.groovy.charts.jfx.JfxAreaChartConverter
import se.alipsa.groovy.charts.jfx.JfxBarChartConverter
import se.alipsa.groovy.charts.jfx.JfxPieChartConverter

import java.nio.file.Files;

class Plot {

  static void pdf(Chart chart, File file) throws IOException {
    try(OutputStream os = Files.newOutputStream(file.toPath())) {
      pdf(chart, os);
    }
  }

  static void pdf(Chart chart, OutputStream os) {
    throw new RuntimeException("Not yet implemented")
  }

  static void svg(Chart chart, File file) throws IOException {
    try(OutputStream os = Files.newOutputStream(file.toPath())) {
      svg(chart, os)
    }
  }

  static void svg(Chart chart, OutputStream os) {
    throw new RuntimeException("Not yet implemented")
  }

  static void png(Chart chart, File file) throws IOException {
    try(OutputStream os = Files.newOutputStream(file.toPath())) {
      png(chart, os)
    }
  }

  static void png(Chart chart, OutputStream os) {
    throw new RuntimeException("Not yet implemented")
  }

  static javafx.scene.chart.Chart jfx(Chart chart) {
    if (chart instanceof AreaChart) {
      return JfxAreaChartConverter.convert((AreaChart) chart)
    } else if (chart instanceof BarChart) {
      return JfxBarChartConverter.convert((BarChart) chart)
    } else if (chart instanceof PieChart) {
      return JfxPieChartConverter.convert((PieChart) chart)
    }
    throw new RuntimeException(chart.getClass().getSimpleName() + " conversion is not yet implemented")
  }
}
