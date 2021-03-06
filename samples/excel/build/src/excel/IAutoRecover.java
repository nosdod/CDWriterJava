package excel  ;

import com4j.*;

@IID("{0002445A-0001-0000-C000-000000000046}")
public interface IAutoRecover extends Com4jObject {
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
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean getEnabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void setEnabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Time"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int getTime();


  /**
   * <p>
   * Setter method for the COM property "Time"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(13)
  void setTime(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String getPath();


  /**
   * <p>
   * Setter method for the COM property "Path"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(15)
  void setPath(
    java.lang.String rhs);


  // Properties:
}
