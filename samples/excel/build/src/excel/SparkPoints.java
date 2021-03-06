package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SparkPoints extends Com4jObject {
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
   * Getter method for the COM property "Negative"
   * </p>
   */

  @DISPID(2955)
  @PropGet
  excel.SparkColor getNegative();


  /**
   * <p>
   * Getter method for the COM property "Markers"
   * </p>
   */

  @DISPID(2956)
  @PropGet
  excel.SparkColor getMarkers();


  /**
   * <p>
   * Getter method for the COM property "Highpoint"
   * </p>
   */

  @DISPID(2957)
  @PropGet
  excel.SparkColor getHighpoint();


  /**
   * <p>
   * Getter method for the COM property "Lowpoint"
   * </p>
   */

  @DISPID(2958)
  @PropGet
  excel.SparkColor getLowpoint();


  /**
   * <p>
   * Getter method for the COM property "Firstpoint"
   * </p>
   */

  @DISPID(2959)
  @PropGet
  excel.SparkColor getFirstpoint();


  /**
   * <p>
   * Getter method for the COM property "Lastpoint"
   * </p>
   */

  @DISPID(2960)
  @PropGet
  excel.SparkColor getLastpoint();


  // Properties:
}
