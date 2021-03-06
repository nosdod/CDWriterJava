package excel  ;

import com4j.*;

@IID("{000244A9-0001-0000-C000-000000000046}")
public interface ISortField extends Com4jObject {
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
   * Getter method for the COM property "SortOn"
   * </p>
   * @return  Returns a value of type excel.XlSortOn
   */

  @VTID(10)
  excel.XlSortOn getSortOn();


  /**
   * <p>
   * Setter method for the COM property "SortOn"
   * </p>
   * @param rhs Mandatory excel.XlSortOn parameter.
   */

  @VTID(11)
  void setSortOn(
    excel.XlSortOn rhs);


  /**
   * <p>
   * Getter method for the COM property "SortOnValue"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getSortOnValue();


  /**
   * <p>
   * Getter method for the COM property "Key"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(13)
  excel.Range getKey();


  /**
   * <p>
   * Getter method for the COM property "Order"
   * </p>
   * @return  Returns a value of type excel.XlSortOrder
   */

  @VTID(14)
  excel.XlSortOrder getOrder();


  /**
   * <p>
   * Setter method for the COM property "Order"
   * </p>
   * @param rhs Mandatory excel.XlSortOrder parameter.
   */

  @VTID(15)
  void setOrder(
    excel.XlSortOrder rhs);


  /**
   * <p>
   * Getter method for the COM property "CustomOrder"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCustomOrder();


  /**
   * <p>
   * Setter method for the COM property "CustomOrder"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(17)
  void setCustomOrder(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "DataOption"
   * </p>
   * @return  Returns a value of type excel.XlSortDataOption
   */

  @VTID(18)
  excel.XlSortDataOption getDataOption();


  /**
   * <p>
   * Setter method for the COM property "DataOption"
   * </p>
   * @param rhs Mandatory excel.XlSortDataOption parameter.
   */

  @VTID(19)
  void setDataOption(
    excel.XlSortDataOption rhs);


  /**
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(20)
  int getPriority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(21)
  void setPriority(
    int rhs);


  /**
   */

  @VTID(22)
  void delete();


  /**
   * @param key Mandatory excel.Range parameter.
   */

  @VTID(23)
  void modifyKey(
    excel.Range key);


  /**
   * @param icon Mandatory excel.Icon parameter.
   */

  @VTID(24)
  void setIcon(
    excel.Icon icon);


  // Properties:
}
