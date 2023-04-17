package se.alipsa.groovy.gg

import se.alipsa.groovy.gg.aes.Aes
import se.alipsa.groovy.gg.geom.GeomAbline
import se.alipsa.groovy.gg.geom.GeomBar
import se.alipsa.groovy.gg.geom.GeomBin2d
import se.alipsa.groovy.gg.geom.GeomBlank
import se.alipsa.groovy.gg.geom.GeomBoxplot
import se.alipsa.groovy.gg.geom.GeomCol
import se.alipsa.groovy.gg.geom.GeomContour
import se.alipsa.groovy.gg.geom.GeomContourFilled
import se.alipsa.groovy.gg.geom.GeomCount
import se.alipsa.groovy.gg.geom.GeomHline
import se.alipsa.groovy.gg.geom.GeomPoint
import se.alipsa.groovy.gg.geom.GeomSegment
import se.alipsa.groovy.gg.geom.GeomVline
import se.alipsa.groovy.gg.scale.ScaleColorManual
import se.alipsa.groovy.gg.stat.StatBin2d
import se.alipsa.groovy.gg.stat.StatBoxplot
import se.alipsa.groovy.gg.stat.StatContour
import se.alipsa.groovy.gg.stat.StatContourFilled
import se.alipsa.groovy.gg.stat.StatCount
import se.alipsa.groovy.matrix.Matrix

/**
 * An api very similar to ggplot2 making ports from R code using ggplot2 simple.
 */
class GgPlot {

  static GgChart ggplot(Matrix data, Aes aes) {
    return new GgChart(data, aes)
  }

  static Aes aes(List<String> colNames) {
    return new Aes(colNames)
  }

  static Aes aes(List<String> colNames, String colour) {
    return new Aes(colNames, colour)
  }

  static GeomAbline geom_abline() {
    return new GeomAbline()
  }

  static GeomBar geom_bar() {
    return new GeomBar()
  }

  static GeomBin2d geom_bin_2d() {
    return new GeomBin2d()
  }

  static GeomBlank geom_blank() {
    return new GeomBlank()
  }

  static GeomBoxplot geom_boxplot() {
    return new GeomBoxplot()
  }

  static GeomCol geom_col() {
    return new GeomCol()
  }

  static GeomContour geom_contour() {
    return new GeomContour()
  }

  static GeomContourFilled geom_contour_filled() {
    return new GeomContourFilled()
  }

  static GeomCount geom_count() {
    return new GeomCount()
  }

  static GeomHline geom_hline() {
    return new GeomHline()
  }

  static GeomVline geom_vline() {
    return new GeomVline()
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

  static StatBin2d stat_bin_2d() {
    return new StatBin2d()
  }

  static StatBoxplot stat_boxplot() {
    return new StatBoxplot()
  }

  static StatContour stat_contour() {
    return new StatContour()
  }

  static StatContourFilled stat_contour_filled() {
    return new StatContourFilled()
  }

  static StatCount stat_count() {
    return new StatCount()
  }


}
