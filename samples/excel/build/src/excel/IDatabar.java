package excel  ;

import com4j.*;

@IID("{00024496-0001-0000-C000-000000000046}")
public interface IDatabar extends Com4jObject {
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
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int getPriority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(11)
  void setPriority(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "StopIfTrue"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean getStopIfTrue();


  /**
   * <p>
   * Getter method for the COM property "AppliesTo"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(13)
  excel.Range getAppliesTo();


  /**
   * <p>
   * Getter method for the COM property "MinPoint"
   * </p>
   * @return  Returns a value of type excel.ConditionValue
   */

  @VTID(14)
  excel.ConditionValue getMinPoint();


  /**
   * <p>
   * Getter method for the COM property "MaxPoint"
   * </p>
   * @return  Returns a value of type excel.ConditionValue
   */

  @VTID(15)
  excel.ConditionValue getMaxPoint();


  /**
   * <p>
   * Getter method for the COM property "PercentMin"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int getPercentMin();


  /**
   * <p>
   * Setter method for the COM property "PercentMin"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(17)
  void setPercentMin(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PercentMax"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(18)
  int getPercentMax();


  /**
   * <p>
   * Setter method for the COM property "PercentMax"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(19)
  void setPercentMax(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "BarColor"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getBarColor();


  /**
   * <p>
   * Getter method for the COM property "ShowValue"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(21)
  boolean getShowValue();


  /**
   * <p>
   * Setter method for the COM property "ShowValue"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(22)
  void setShowValue(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(23)
  java.lang.String getFormula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(24)
  void setFormula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(25)
  int getType();


  /**
   */

  @VTID(26)
  void setFirstPriority();


  /**
   */

  @VTID(27)
  void setLastPriority();


  /**
   */

  @VTID(28)
  void delete();


  /**
   * @param range Mandatory excel.Range parameter.
   */

  @VTID(29)
  void modifyAppliesToRange(
    excel.Range range);


  /**
   * <p>
   * Getter method for the COM property "PTCondition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean getPTCondition();


  /**
   * <p>
   * Getter method for the COM property "ScopeType"
   * </p>
   * @return  Returns a value of type excel.XlPivotConditionScope
   */

  @VTID(31)
  excel.XlPivotConditionScope getScopeType();


  /**
   * <p>
   * Setter method for the COM property "ScopeType"
   * </p>
   * @param rhs Mandatory excel.XlPivotConditionScope parameter.
   */

  @VTID(32)
  void setScopeType(
    excel.XlPivotConditionScope rhs);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(33)
  int getDirection();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(34)
  void setDirection(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "BarFillType"
   * </p>
   * @return  Returns a value of type excel.XlDataBarFillType
   */

  @VTID(35)
  excel.XlDataBarFillType getBarFillType();


  /**
   * <p>
   * Setter method for the COM property "BarFillType"
   * </p>
   * @param rhs Mandatory excel.XlDataBarFillType parameter.
   */

  @VTID(36)
  void setBarFillType(
    excel.XlDataBarFillType rhs);


  /**
   * <p>
   * Getter method for the COM property "AxisPosition"
   * </p>
   * @return  Returns a value of type excel.XlDataBarAxisPosition
   */

  @VTID(37)
  excel.XlDataBarAxisPosition getAxisPosition();


  /**
   * <p>
   * Setter method for the COM property "AxisPosition"
   * </p>
   * @param rhs Mandatory excel.XlDataBarAxisPosition parameter.
   */

  @VTID(38)
  void setAxisPosition(
    excel.XlDataBarAxisPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "AxisColor"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(39)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getAxisColor();


  /**
   * <p>
   * Getter method for the COM property "BarBorder"
   * </p>
   * @return  Returns a value of type excel.DataBarBorder
   */

  @VTID(40)
  excel.DataBarBorder getBarBorder();


  /**
   * <p>
   * Getter method for the COM property "NegativeBarFormat"
   * </p>
   * @return  Returns a value of type excel.NegativeBarFormat
   */

  @VTID(41)
  excel.NegativeBarFormat getNegativeBarFormat();


  // Properties:
}
