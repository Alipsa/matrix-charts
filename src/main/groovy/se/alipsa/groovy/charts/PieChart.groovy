package se.alipsa.groovy.charts

import se.alipsa.groovy.matrix.TableMatrix;


class PieChart extends Chart {

  static PieChart create(String title, List<?> groupCol, List<?> numberCol){
    PieChart chart = new PieChart()
    chart.categorySeries = groupCol
    chart.valueSeries = [numberCol]
    chart.title = title
    return chart
  }

  static PieChart create(TableMatrix table, String groupColName, String numberColName){
    return create(table.name(), table, groupColName, numberColName)
  }

  static PieChart create(String title, TableMatrix table, String groupColName, String numberColName){
    return create(title, table.column(groupColName), table.column(numberColName))
  }
}
