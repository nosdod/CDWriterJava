package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface AboveAverage extends Com4jObject {
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
   * Getter method for the COM property "Priority"
   * </p>
   */

  @DISPID(985)
  @PropGet
  int getPriority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(985)
  @PropPut
  void setPriority(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "StopIfTrue"
   * </p>
   */

  @DISPID(2625)
  @PropGet
  boolean getStopIfTrue();


  /**
   * <p>
   * Setter method for the COM property "StopIfTrue"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2625)
  @PropPut
  void setStopIfTrue(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AppliesTo"
   * </p>
   */

  @DISPID(2626)
  @PropGet
  excel.Range getAppliesTo();


  /**
   * <p>
   * Getter method for the COM property "AboveBelow"
   * </p>
   */

  @DISPID(2731)
  @PropGet
  excel.XlAboveBelow getAboveBelow();


  /**
   * <p>
   * Setter method for the COM property "AboveBelow"
   * </p>
   * @param rhs Mandatory excel.XlAboveBelow parameter.
   */

  @DISPID(2731)
  @PropPut
  void setAboveBelow(
    excel.XlAboveBelow rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   */

  @DISPID(129)
  @PropGet
  excel.Interior getInterior();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   */

  @DISPID(435)
  @PropGet
  excel.Borders getBorders();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   */

  @DISPID(146)
  @PropGet
  excel.Font getFont();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  int getType();


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   */

  @DISPID(193)
  @PropGet
  java.lang.Object getNumberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(193)
  @PropPut
  void setNumberFormat(
    java.lang.Object rhs);


  /**
   */

  @DISPID(2629)
  void setFirstPriority();


  /**
   */

  @DISPID(2630)
  void setLastPriority();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param range Mandatory excel.Range parameter.
   */

  @DISPID(2627)
  void modifyAppliesToRange(
    excel.Range range);


  /**
   * <p>
   * Getter method for the COM property "PTCondition"
   * </p>
   */

  @DISPID(2631)
  @PropGet
  boolean getPTCondition();


  /**
   * <p>
   * Getter method for the COM property "ScopeType"
   * </p>
   */

  @DISPID(2615)
  @PropGet
  excel.XlPivotConditionScope getScopeType();


  /**
   * <p>
   * Setter method for the COM property "ScopeType"
   * </p>
   * @param rhs Mandatory excel.XlPivotConditionScope parameter.
   */

  @DISPID(2615)
  @PropPut
  void setScopeType(
    excel.XlPivotConditionScope rhs);


  /**
   * <p>
   * Getter method for the COM property "CalcFor"
   * </p>
   */

  @DISPID(2730)
  @PropGet
  excel.XlCalcFor getCalcFor();


  /**
   * <p>
   * Setter method for the COM property "CalcFor"
   * </p>
   * @param rhs Mandatory excel.XlCalcFor parameter.
   */

  @DISPID(2730)
  @PropPut
  void setCalcFor(
    excel.XlCalcFor rhs);


  /**
   * <p>
   * Getter method for the COM property "NumStdDev"
   * </p>
   */

  @DISPID(2732)
  @PropGet
  int getNumStdDev();


  /**
   * <p>
   * Setter method for the COM property "NumStdDev"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2732)
  @PropPut
  void setNumStdDev(
    int rhs);


  // Properties:
}
