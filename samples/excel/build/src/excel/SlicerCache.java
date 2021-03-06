package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SlicerCache extends Com4jObject {
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
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int getIndex();


  /**
   * <p>
   * Getter method for the COM property "OLAP"
   * </p>
   */

  @DISPID(2077)
  @PropGet
  boolean getOLAP();


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   */

  @DISPID(685)
  @PropGet
  excel.XlPivotTableSourceType getSourceType();


  /**
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   */

  @DISPID(2544)
  @PropGet
  excel.WorkbookConnection getWorkbookConnection();


  /**
   * <p>
   * Getter method for the COM property "Slicers"
   * </p>
   */

  @DISPID(2881)
  @PropGet
  excel.Slicers getSlicers();


  /**
   * <p>
   * Getter method for the COM property "PivotTables"
   * </p>
   */

  @DISPID(690)
  @PropGet
  excel.SlicerPivotTables getPivotTables();


  /**
   * <p>
   * Getter method for the COM property "SlicerCacheLevels"
   * </p>
   */

  @DISPID(2974)
  @PropGet
  excel.SlicerCacheLevels getSlicerCacheLevels();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleSlicerItems"
   * </p>
   */

  @DISPID(2975)
  @PropGet
  excel.SlicerItems getVisibleSlicerItems();


  /**
   * <p>
   * Getter method for the COM property "VisibleSlicerItemsList"
   * </p>
   */

  @DISPID(2976)
  @PropGet
  java.lang.Object getVisibleSlicerItemsList();


  /**
   * <p>
   * Setter method for the COM property "VisibleSlicerItemsList"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2976)
  @PropPut
  void setVisibleSlicerItemsList(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SlicerItems"
   * </p>
   */

  @DISPID(2977)
  @PropGet
  excel.SlicerItems getSlicerItems();


  /**
   * <p>
   * Getter method for the COM property "CrossFilterType"
   * </p>
   */

  @DISPID(2978)
  @PropGet
  excel.XlSlicerCrossFilterType getCrossFilterType();


  /**
   * <p>
   * Setter method for the COM property "CrossFilterType"
   * </p>
   * @param rhs Mandatory excel.XlSlicerCrossFilterType parameter.
   */

  @DISPID(2978)
  @PropPut
  void setCrossFilterType(
    excel.XlSlicerCrossFilterType rhs);


  /**
   * <p>
   * Getter method for the COM property "SortItems"
   * </p>
   */

  @DISPID(2979)
  @PropGet
  excel.XlSlicerSort getSortItems();


  /**
   * <p>
   * Setter method for the COM property "SortItems"
   * </p>
   * @param rhs Mandatory excel.XlSlicerSort parameter.
   */

  @DISPID(2979)
  @PropPut
  void setSortItems(
    excel.XlSlicerSort rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   */

  @DISPID(721)
  @PropGet
  java.lang.String getSourceName();


  /**
   * <p>
   * Getter method for the COM property "SortUsingCustomLists"
   * </p>
   */

  @DISPID(2574)
  @PropGet
  boolean getSortUsingCustomLists();


  /**
   * <p>
   * Setter method for the COM property "SortUsingCustomLists"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2574)
  @PropPut
  void setSortUsingCustomLists(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAllItems"
   * </p>
   */

  @DISPID(452)
  @PropGet
  boolean getShowAllItems();


  /**
   * <p>
   * Setter method for the COM property "ShowAllItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(452)
  @PropPut
  void setShowAllItems(
    boolean rhs);


  /**
   */

  @DISPID(2594)
  void clearManualFilter();


  /**
   */

  @DISPID(117)
  void delete();


  // Properties:
}
