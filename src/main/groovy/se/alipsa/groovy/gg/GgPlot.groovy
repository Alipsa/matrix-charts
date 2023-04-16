package se.alipsa.groovy.gg

import se.alipsa.groovy.gg.aes.Aes
import se.alipsa.groovy.gg.geom.GeomPoint
import se.alipsa.groovy.gg.geom.GeomSegment
import se.alipsa.groovy.gg.scale.ScaleColorManual
import se.alipsa.groovy.matrix.Matrix

/**
 * An api very similar to ggplot2 making ports from R code using ggplot2 simple.
 */
class GgPlot {

  static GgChart ggplot(Matrix data, Aes aes) {
    return new GgChart(data, aes)
  }

  static Aes aes(String... colNames) {
    return new Aes(colNames)
  }


  static GeomPoint geom_point() {
    return new GeomPoint()
  }

  static GeomSegment geom_segment() {
    return new GeomSegment()
  }

  static ScaleColorManual scale_colour_manual(Map mappings) {
    return new ScaleColorManual(mappings)
  }
}
