package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SparklineGroup extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int getCount();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  @PropGet
  excel.Sparkline getItem(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   */

  @DISPID(1397)
  @PropGet
  excel.Range getLocation();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param rhs Mandatory excel.Range parameter.
   */

  @DISPID(1397)
  @PropPut
  void setLocation(
    excel.Range rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceData"
   * </p>
   */

  @DISPID(686)
  @PropGet
  java.lang.String getSourceData();


  /**
   * <p>
   * Setter method for the COM property "SourceData"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(686)
  @PropPut
  void setSourceData(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "DateRange"
   * </p>
   */

  @DISPID(2948)
  @PropGet
  java.lang.String getDateRange();


  /**
   * <p>
   * Setter method for the COM property "DateRange"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2948)
  @PropPut
  void setDateRange(
    java.lang.String rhs);


  /**
   * @param location Mandatory excel.Range parameter.
   */

  @DISPID(2949)
  void modifyLocation(
    excel.Range location);


  /**
   * @param sourceData Mandatory java.lang.String parameter.
   */

  @DISPID(2950)
  void modifySourceData(
    java.lang.String sourceData);


  /**
   * @param location Mandatory excel.Range parameter.
   * @param sourceData Mandatory java.lang.String parameter.
   */

  @DISPID(1581)
  void modify(
    excel.Range location,
    java.lang.String sourceData);


  /**
   * @param dateRange Mandatory java.lang.String parameter.
   */

  @DISPID(2951)
  void modifyDateRange(
    java.lang.String dateRange);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  excel.XlSparkType getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory excel.XlSparkType parameter.
   */

  @DISPID(108)
  @PropPut
  void setType(
    excel.XlSparkType rhs);


  /**
   * <p>
   * Getter method for the COM property "SeriesColor"
   * </p>
   */

  @DISPID(2952)
  @PropGet
  excel.FormatColor getSeriesColor();


  /**
   * <p>
   * Getter method for the COM property "Points"
   * </p>
   */

  @DISPID(70)
  @PropGet
  excel.SparkPoints getPoints();


  /**
   * <p>
   * Getter method for the COM property "Axes"
   * </p>
   */

  @DISPID(23)
  @PropGet
  excel.SparkAxes getAxes();


  /**
   * <p>
   * Getter method for the COM property "DisplayBlanksAs"
   * </p>
   */

  @DISPID(93)
  @PropGet
  excel.XlDisplayBlanksAs getDisplayBlanksAs();


  /**
   * <p>
   * Setter method for the COM property "DisplayBlanksAs"
   * </p>
   * @param rhs Mandatory excel.XlDisplayBlanksAs parameter.
   */

  @DISPID(93)
  @PropPut
  void setDisplayBlanksAs(
    excel.XlDisplayBlanksAs rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayHidden"
   * </p>
   */

  @DISPID(2953)
  @PropGet
  boolean getDisplayHidden();


  /**
   * <p>
   * Setter method for the COM property "DisplayHidden"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2953)
  @PropPut
  void setDisplayHidden(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LineWeight"
   * </p>
   */

  @DISPID(2954)
  @PropGet
  java.lang.Object getLineWeight();


  /**
   * <p>
   * Setter method for the COM property "LineWeight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2954)
  @PropPut
  void setLineWeight(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotBy"
   * </p>
   */

  @DISPID(202)
  @PropGet
  excel.XlSparklineRowCol getPlotBy();


  /**
   * <p>
   * Setter method for the COM property "PlotBy"
   * </p>
   * @param rhs Mandatory excel.XlSparklineRowCol parameter.
   */

  @DISPID(202)
  @PropPut
  void setPlotBy(
    excel.XlSparklineRowCol rhs);


  // Properties:
}
