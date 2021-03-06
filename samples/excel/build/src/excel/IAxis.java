package excel  ;

import com4j.*;

@IID("{00020848-0001-0000-C000-000000000046}")
public interface IAxis extends Com4jObject {
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
   * Getter method for the COM property "AxisBetweenCategories"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean getAxisBetweenCategories();


  /**
   * <p>
   * Setter method for the COM property "AxisBetweenCategories"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void setAxisBetweenCategories(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AxisGroup"
   * </p>
   * @return  Returns a value of type excel.XlAxisGroup
   */

  @VTID(12)
  excel.XlAxisGroup getAxisGroup();


  /**
   * <p>
   * Getter method for the COM property "AxisTitle"
   * </p>
   * @return  Returns a value of type excel.AxisTitle
   */

  @VTID(13)
  excel.AxisTitle getAxisTitle();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type excel.Border
   */

  @VTID(14)
  excel.Border getBorder();


  /**
   * <p>
   * Getter method for the COM property "CategoryNames"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCategoryNames();


  /**
   * <p>
   * Setter method for the COM property "CategoryNames"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(16)
  void setCategoryNames(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Crosses"
   * </p>
   * @return  Returns a value of type excel.XlAxisCrosses
   */

  @VTID(17)
  excel.XlAxisCrosses getCrosses();


  /**
   * <p>
   * Setter method for the COM property "Crosses"
   * </p>
   * @param rhs Mandatory excel.XlAxisCrosses parameter.
   */

  @VTID(18)
  void setCrosses(
    excel.XlAxisCrosses rhs);


  /**
   * <p>
   * Getter method for the COM property "CrossesAt"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(19)
  double getCrossesAt();


  /**
   * <p>
   * Setter method for the COM property "CrossesAt"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(20)
  void setCrossesAt(
    double rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "HasMajorGridlines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean getHasMajorGridlines();


  /**
   * <p>
   * Setter method for the COM property "HasMajorGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(23)
  void setHasMajorGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasMinorGridlines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean getHasMinorGridlines();


  /**
   * <p>
   * Setter method for the COM property "HasMinorGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void setHasMinorGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasTitle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(26)
  boolean getHasTitle();


  /**
   * <p>
   * Setter method for the COM property "HasTitle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(27)
  void setHasTitle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorGridlines"
   * </p>
   * @return  Returns a value of type excel.Gridlines
   */

  @VTID(28)
  excel.Gridlines getMajorGridlines();


  /**
   * <p>
   * Getter method for the COM property "MajorTickMark"
   * </p>
   * @return  Returns a value of type excel.XlTickMark
   */

  @VTID(29)
  excel.XlTickMark getMajorTickMark();


  /**
   * <p>
   * Setter method for the COM property "MajorTickMark"
   * </p>
   * @param rhs Mandatory excel.XlTickMark parameter.
   */

  @VTID(30)
  void setMajorTickMark(
    excel.XlTickMark rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorUnit"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(31)
  double getMajorUnit();


  /**
   * <p>
   * Setter method for the COM property "MajorUnit"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(32)
  void setMajorUnit(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorUnitIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(33)
  boolean getMajorUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MajorUnitIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(34)
  void setMajorUnitIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MaximumScale"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(35)
  double getMaximumScale();


  /**
   * <p>
   * Setter method for the COM property "MaximumScale"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(36)
  void setMaximumScale(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MaximumScaleIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(37)
  boolean getMaximumScaleIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MaximumScaleIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(38)
  void setMaximumScaleIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MinimumScale"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(39)
  double getMinimumScale();


  /**
   * <p>
   * Setter method for the COM property "MinimumScale"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(40)
  void setMinimumScale(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MinimumScaleIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(41)
  boolean getMinimumScaleIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MinimumScaleIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(42)
  void setMinimumScaleIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorGridlines"
   * </p>
   * @return  Returns a value of type excel.Gridlines
   */

  @VTID(43)
  excel.Gridlines getMinorGridlines();


  /**
   * <p>
   * Getter method for the COM property "MinorTickMark"
   * </p>
   * @return  Returns a value of type excel.XlTickMark
   */

  @VTID(44)
  excel.XlTickMark getMinorTickMark();


  /**
   * <p>
   * Setter method for the COM property "MinorTickMark"
   * </p>
   * @param rhs Mandatory excel.XlTickMark parameter.
   */

  @VTID(45)
  void setMinorTickMark(
    excel.XlTickMark rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorUnit"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(46)
  double getMinorUnit();


  /**
   * <p>
   * Setter method for the COM property "MinorUnit"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(47)
  void setMinorUnit(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorUnitIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(48)
  boolean getMinorUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MinorUnitIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(49)
  void setMinorUnitIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ReversePlotOrder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(50)
  boolean getReversePlotOrder();


  /**
   * <p>
   * Setter method for the COM property "ReversePlotOrder"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(51)
  void setReversePlotOrder(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ScaleType"
   * </p>
   * @return  Returns a value of type excel.XlScaleType
   */

  @VTID(52)
  excel.XlScaleType getScaleType();


  /**
   * <p>
   * Setter method for the COM property "ScaleType"
   * </p>
   * @param rhs Mandatory excel.XlScaleType parameter.
   */

  @VTID(53)
  void setScaleType(
    excel.XlScaleType rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(54)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "TickLabelPosition"
   * </p>
   * @return  Returns a value of type excel.XlTickLabelPosition
   */

  @VTID(55)
  excel.XlTickLabelPosition getTickLabelPosition();


  /**
   * <p>
   * Setter method for the COM property "TickLabelPosition"
   * </p>
   * @param rhs Mandatory excel.XlTickLabelPosition parameter.
   */

  @VTID(56)
  void setTickLabelPosition(
    excel.XlTickLabelPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "TickLabels"
   * </p>
   * @return  Returns a value of type excel.TickLabels
   */

  @VTID(57)
  excel.TickLabels getTickLabels();


  /**
   * <p>
   * Getter method for the COM property "TickLabelSpacing"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(58)
  int getTickLabelSpacing();


  /**
   * <p>
   * Setter method for the COM property "TickLabelSpacing"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(59)
  void setTickLabelSpacing(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "TickMarkSpacing"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(60)
  int getTickMarkSpacing();


  /**
   * <p>
   * Setter method for the COM property "TickMarkSpacing"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(61)
  void setTickMarkSpacing(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type excel.XlAxisType
   */

  @VTID(62)
  excel.XlAxisType getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory excel.XlAxisType parameter.
   */

  @VTID(63)
  void setType(
    excel.XlAxisType rhs);


  /**
   * <p>
   * Getter method for the COM property "BaseUnit"
   * </p>
   * @return  Returns a value of type excel.XlTimeUnit
   */

  @VTID(64)
  excel.XlTimeUnit getBaseUnit();


  /**
   * <p>
   * Setter method for the COM property "BaseUnit"
   * </p>
   * @param rhs Mandatory excel.XlTimeUnit parameter.
   */

  @VTID(65)
  void setBaseUnit(
    excel.XlTimeUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "BaseUnitIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(66)
  boolean getBaseUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "BaseUnitIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(67)
  void setBaseUnitIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorUnitScale"
   * </p>
   * @return  Returns a value of type excel.XlTimeUnit
   */

  @VTID(68)
  excel.XlTimeUnit getMajorUnitScale();


  /**
   * <p>
   * Setter method for the COM property "MajorUnitScale"
   * </p>
   * @param rhs Mandatory excel.XlTimeUnit parameter.
   */

  @VTID(69)
  void setMajorUnitScale(
    excel.XlTimeUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorUnitScale"
   * </p>
   * @return  Returns a value of type excel.XlTimeUnit
   */

  @VTID(70)
  excel.XlTimeUnit getMinorUnitScale();


  /**
   * <p>
   * Setter method for the COM property "MinorUnitScale"
   * </p>
   * @param rhs Mandatory excel.XlTimeUnit parameter.
   */

  @VTID(71)
  void setMinorUnitScale(
    excel.XlTimeUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "CategoryType"
   * </p>
   * @return  Returns a value of type excel.XlCategoryType
   */

  @VTID(72)
  excel.XlCategoryType getCategoryType();


  /**
   * <p>
   * Setter method for the COM property "CategoryType"
   * </p>
   * @param rhs Mandatory excel.XlCategoryType parameter.
   */

  @VTID(73)
  void setCategoryType(
    excel.XlCategoryType rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(74)
  double getLeft();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(75)
  double getTop();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(76)
  double getWidth();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(77)
  double getHeight();


  /**
   * <p>
   * Getter method for the COM property "DisplayUnit"
   * </p>
   * @return  Returns a value of type excel.XlDisplayUnit
   */

  @VTID(78)
  excel.XlDisplayUnit getDisplayUnit();


  /**
   * <p>
   * Setter method for the COM property "DisplayUnit"
   * </p>
   * @param rhs Mandatory excel.XlDisplayUnit parameter.
   */

  @VTID(79)
  void setDisplayUnit(
    excel.XlDisplayUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayUnitCustom"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(80)
  double getDisplayUnitCustom();


  /**
   * <p>
   * Setter method for the COM property "DisplayUnitCustom"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(81)
  void setDisplayUnitCustom(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDisplayUnitLabel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(82)
  boolean getHasDisplayUnitLabel();


  /**
   * <p>
   * Setter method for the COM property "HasDisplayUnitLabel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(83)
  void setHasDisplayUnitLabel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayUnitLabel"
   * </p>
   * @return  Returns a value of type excel.DisplayUnitLabel
   */

  @VTID(84)
  excel.DisplayUnitLabel getDisplayUnitLabel();


  /**
   * <p>
   * Getter method for the COM property "LogBase"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(85)
  double getLogBase();


  /**
   * <p>
   * Setter method for the COM property "LogBase"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(86)
  void setLogBase(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TickLabelSpacingIsAuto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(87)
  boolean getTickLabelSpacingIsAuto();


  /**
   * <p>
   * Setter method for the COM property "TickLabelSpacingIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(88)
  void setTickLabelSpacingIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type excel.ChartFormat
   */

  @VTID(89)
  excel.ChartFormat getFormat();


  // Properties:
}
