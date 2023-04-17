package se.alipsa.groovy.gg.aes

class Aes {

  def colNames = []
  String colorColumn

  Aes(List<String> colNames) {
    this.colNames.addAll(colNames)
  }

  Aes(List<String> colNames, String colorColumn) {
    this.colNames.addAll(colNames)
    this.colorColumn = colorColumn
  }

}
