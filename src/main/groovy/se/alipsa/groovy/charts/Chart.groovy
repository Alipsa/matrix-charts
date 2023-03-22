package se.alipsa.groovy.charts

import se.alipsa.groovy.matrix.TableMatrix;

/**
 * Represents a chart in some form.
 * A chart can be exported into various formats using the Plot class e.g:
 * <code>
 * AreaChart chart = new AreaChart(table);
 * inout.view(Plot.jfx(chart))
 * </code>
 */
public abstract class Chart {

  protected String title;

  protected List<?> categorySeries;
  protected List<?>[] valueSeries;

  public String getTitle() {
    return title;
  }

  public List<?> getCategorySeries() {
    return categorySeries;
  }

  public List<?>[] getValueSeries() {
    return valueSeries;
  }

  static void validateSeries(TableMatrix[] series) {
    int idx = 0;
    if (series == null || series.length == 0) {
      throw new IllegalArgumentException("The series contains no data");
    }

    TableMatrix firstTable = series[0];
    Class firstColumn = firstTable.columnType(0)
    Class secondColumn = firstTable.columnType(1)
    if (firstTable.columnCount() != 2) {
      throw new IllegalArgumentException("Table " + idx + "(" + firstTable.name() + ") does not contain 2 columns.");
    }

    for (table in series) {
      if (idx == 0) {
        idx++;
        continue;
      }
      if (table.columnCount() != 2) {
        throw new IllegalArgumentException("Table " + idx + "(" + table.name() + ") does not contain 2 columns.");
      }
      Class col0Type = table.columnType(0)
      Class col1Type = table.columnType(1)
      if (DataType.differs(firstColumn, col0Type)) {
        throw new IllegalArgumentException("Column mismatch in series " + idx + "(" + table.name()
            + "). First series has type " + firstColumn.name() + " in the first column but this series has " + col0Type);
      }
      if (DataType.differs(secondColumn, col1Type)) {
        throw new IllegalArgumentException("Column mismatch in series " + idx + "(" + table.name()
            + "). First series has type " + secondColumn.name() + " in the second column but this series has " + col1Type);
      }
      idx++;
    }
  }

  @Override
  public String toString() {
    return title + ", category: " + categorySeries.name() + ", " + valueSeries.length + " value series";
  }
}
