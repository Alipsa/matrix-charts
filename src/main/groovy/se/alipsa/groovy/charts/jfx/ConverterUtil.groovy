package se.alipsa.groovy.charts.jfx;

import javafx.scene.chart.*

class ConverterUtil {

  static void populateVerticalSeries(XYChart<?,?> fxChart, se.alipsa.groovy.charts.Chart data) {
    def series = data.getValueSeries()
    def categories = data.getCategorySeries()
    for (column in series) {
      XYChart.Series fxSeries = new XYChart.Series()
      //fxSeries.setName(column.name());
      for (int i = 0; i < column.size(); i++) {
        fxSeries.getData().add(new XYChart.Data(categories.get(i), column.get(i)))
      }
      fxChart.getData().add(fxSeries)
    }
  }

  static void populateHorizontalSeries(XYChart<?,?> fxChart, se.alipsa.groovy.charts.Chart data) {
    def series = data.getValueSeries()
    def categories = data.getCategorySeries()
    for (column in series) {
      XYChart.Series fxSeries = new XYChart.Series()
      //fxSeries.setName(column.name());
      for (int i = 0; i < column.size(); i++) {
        fxSeries.getData().add(new XYChart.Data(column.get(i), categories.get(i)))
      }
      fxChart.getData().add(fxSeries)
    }
  }


}
