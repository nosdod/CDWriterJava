package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface HPageBreaks extends Com4jObject,Iterable<Com4jObject> {
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
   * @param index Mandatory int parameter.
   */

  @DISPID(170)
  @PropGet
  excel.HPageBreak getItem(
    int index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory int parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.HPageBreak get_Default(
    int index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param before Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(181)
  excel.HPageBreak add(
    com4j.Com4jObject before);


  // Properties:
}
