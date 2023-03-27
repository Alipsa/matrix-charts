package se.alipsa.groovy.charts;

import se.alipsa.groovy.charts.jfx.JfxConverter
import se.alipsa.groovy.charts.png.PngConverter
import se.alipsa.groovy.charts.svg.SvgConverter

import java.nio.file.Files;

class Plot {

  static void svg(Chart chart, File file) throws IOException {
    try(BufferedWriter os = Files.newBufferedWriter(file.toPath())) {
      svg(chart, os)
    }
  }

  static void svg(Chart chart, BufferedWriter os) {
    SvgConverter.convert(chart, os)
  }

  static void svg(Chart chart, OutputStream os) {
    SvgConverter.convert(chart, new BufferedWriter(new OutputStreamWriter(os)))
  }

  static void png(Chart chart, File file, double width, double height) throws IOException {
    try(OutputStream os = Files.newOutputStream(file.toPath())) {
      png(chart, os, width, height)
    }
  }

  static void png(Chart chart, OutputStream os, double width, double height) {
    PngConverter.convert(chart, os, width, height)
  }

  static javafx.scene.chart.Chart jfx(Chart chart) {
    JfxConverter.convert(chart)
  }
}
