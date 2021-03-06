package excel  ;

import com4j.*;

@IID("{000244A5-0001-0000-C000-000000000046}")
public interface ITableStyleElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "HasFormat"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean getHasFormat();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type excel.Interior
   */

  @VTID(11)
  excel.Interior getInterior();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type excel.Borders
   */

  @VTID(12)
  excel.Borders getBorders();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type excel.Font
   */

  @VTID(13)
  excel.Font getFont();


  /**
   * <p>
   * Getter method for the COM property "StripeSize"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(14)
  int getStripeSize();


  /**
   * <p>
   * Setter method for the COM property "StripeSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(15)
  void setStripeSize(
    int rhs);


  /**
   */

  @VTID(16)
  void clear();


  // Properties:
}
