package se.alipsa.groovy.charts;

import se.alipsa.groovy.charts.jfx.JfxConverter
import se.alipsa.groovy.charts.png.PngConverter
import se.alipsa.groovy.charts.svg.SvgConverter

import java.nio.file.Files;

class Plot {

  static void svg(Chart chart, File file) throws IOException {
    try(OutputStream os = Files.newOutputStream(file.toPath())) {
      svg(chart, os)
    }
  }

  static void svg(Chart chart, OutputStream os) {
    SvgConverter.convert(chart, os)
  }

  static void png(Chart chart, File file) throws IOException {
    try(OutputStream os = Files.newOutputStream(file.toPath())) {
      png(chart, os)
    }
  }

  static void png(Chart chart, OutputStream os) {
    PngConverter.convert(chart, os)
  }

  static javafx.scene.chart.Chart jfx(Chart chart) {
    JfxConverter.convert(chart)
  }
}
