package se.alipsa.groovy.gg

import se.alipsa.groovy.gg.aes.Aes
import se.alipsa.groovy.gg.facet.Facet
import se.alipsa.groovy.gg.geom.Geom
import se.alipsa.groovy.gg.stat.Stat
import se.alipsa.groovy.gg.theme.Theme
import se.alipsa.groovy.matrix.Matrix

class GgChart {

  GgChart(Matrix data, Aes aes) {

  }

  GgChart plus(Geom geom) {
    return this
  }

  GgChart plus(Theme theme) {
    return this
  }

  GgChart plus(Stat stat) {
    return this
  }

  GgChart plus(Facet facet) {
    return this
  }
}
