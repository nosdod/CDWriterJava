package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface AutoFilter extends Com4jObject {
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
   * Getter method for the COM property "Range"
   * </p>
   */

  @DISPID(197)
  @PropGet
  excel.Range getRange();


  /**
   * <p>
   * Getter method for the COM property "Filters"
   * </p>
   */

  @DISPID(1617)
  @PropGet
  excel.Filters getFilters();


  /**
   * <p>
   * Getter method for the COM property "FilterMode"
   * </p>
   */

  @DISPID(800)
  @PropGet
  boolean getFilterMode();


  /**
   * <p>
   * Getter method for the COM property "Sort"
   * </p>
   */

  @DISPID(880)
  @PropGet
  excel.Sort getSort();


  /**
   */

  @DISPID(2640)
  void applyFilter();


  /**
   */

  @DISPID(794)
  void showAllData();


  // Properties:
}
