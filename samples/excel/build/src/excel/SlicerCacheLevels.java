package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SlicerCacheLevels extends Com4jObject,Iterable<Com4jObject> {
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
   * @param level Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(170)
  @PropGet
  excel.SlicerCacheLevel getItem(
    @Optional java.lang.Object level);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param level Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.SlicerCacheLevel get_Default(
    @Optional java.lang.Object level);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
