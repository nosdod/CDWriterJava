package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface GroupObject extends Com4jObject {
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
   * Getter method for the COM property "BottomRightCell"
   * </p>
   */

  @DISPID(615)
  @PropGet
  excel.Range getBottomRightCell();


  /**
   */

  @DISPID(602)
  java.lang.Object bringToFront();


  /**
   */

  @DISPID(551)
  java.lang.Object copy();


  /**
   * @param appearance Optional parameter. Default value is 2
   * @param format Optional parameter. Default value is -4147
   */

  @DISPID(213)
  java.lang.Object copyPicture(
    @Optional @DefaultValue("2") excel.XlPictureAppearance appearance,
    @Optional @DefaultValue("-4147") excel.XlCopyPictureFormat format);


  /**
   */

  @DISPID(565)
  java.lang.Object cut();


  /**
   */

  @DISPID(117)
  java.lang.Object delete();


  /**
   */

  @DISPID(1039)
  com4j.Com4jObject duplicate();


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   */

  @DISPID(600)
  @PropGet
  boolean getEnabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(600)
  @PropPut
  void setEnabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  double getHeight();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(123)
  @PropPut
  void setHeight(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int getIndex();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   */

  @DISPID(127)
  @PropGet
  double getLeft();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(127)
  @PropPut
  void setLeft(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   */

  @DISPID(269)
  @PropGet
  boolean getLocked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(269)
  @PropPut
  void setLocked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnAction"
   * </p>
   */

  @DISPID(596)
  @PropGet
  java.lang.String getOnAction();


  /**
   * <p>
   * Setter method for the COM property "OnAction"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(596)
  @PropPut
  void setOnAction(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Placement"
   * </p>
   */

  @DISPID(617)
  @PropGet
  java.lang.Object getPlacement();


  /**
   * <p>
   * Setter method for the COM property "Placement"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(617)
  @PropPut
  void setPlacement(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintObject"
   * </p>
   */

  @DISPID(618)
  @PropGet
  boolean getPrintObject();


  /**
   * <p>
   * Setter method for the COM property "PrintObject"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(618)
  @PropPut
  void setPrintObject(
    boolean rhs);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(235)
  java.lang.Object select(
    @Optional java.lang.Object replace);


  /**
   */

  @DISPID(605)
  java.lang.Object sendToBack();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(126)
  @PropGet
  double getTop();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(126)
  @PropPut
  void setTop(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TopLeftCell"
   * </p>
   */

  @DISPID(620)
  @PropGet
  excel.Range getTopLeftCell();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   */

  @DISPID(558)
  @PropGet
  boolean getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(558)
  @PropPut
  void setVisible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   */

  @DISPID(122)
  @PropGet
  double getWidth();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(122)
  @PropPut
  void setWidth(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "ZOrder"
   * </p>
   */

  @DISPID(622)
  @PropGet
  int getZOrder();


  /**
   * <p>
   * Getter method for the COM property "ShapeRange"
   * </p>
   */

  @DISPID(1528)
  @PropGet
  excel.ShapeRange getShapeRange();


  /**
   */

  @DISPID(65563)
  void _Dummy27();


  /**
   */

  @DISPID(65564)
  void _Dummy28();


  /**
   * <p>
   * Getter method for the COM property "AddIndent"
   * </p>
   */

  @DISPID(1063)
  @PropGet
  boolean getAddIndent();


  /**
   * <p>
   * Setter method for the COM property "AddIndent"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1063)
  @PropPut
  void setAddIndent(
    boolean rhs);


  /**
   */

  @DISPID(65566)
  void _Dummy30();


  /**
   * <p>
   * Getter method for the COM property "ArrowHeadLength"
   * </p>
   */

  @DISPID(611)
  @PropGet
  java.lang.Object getArrowHeadLength();


  /**
   * <p>
   * Setter method for the COM property "ArrowHeadLength"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(611)
  @PropPut
  void setArrowHeadLength(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ArrowHeadStyle"
   * </p>
   */

  @DISPID(612)
  @PropGet
  java.lang.Object getArrowHeadStyle();


  /**
   * <p>
   * Setter method for the COM property "ArrowHeadStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(612)
  @PropPut
  void setArrowHeadStyle(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ArrowHeadWidth"
   * </p>
   */

  @DISPID(613)
  @PropGet
  java.lang.Object getArrowHeadWidth();


  /**
   * <p>
   * Setter method for the COM property "ArrowHeadWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(613)
  @PropPut
  void setArrowHeadWidth(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoSize"
   * </p>
   */

  @DISPID(614)
  @PropGet
  boolean getAutoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(614)
  @PropPut
  void setAutoSize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   */

  @DISPID(128)
  @PropGet
  excel.Border getBorder();


  /**
   */

  @DISPID(65572)
  void _Dummy36();


  /**
   */

  @DISPID(65573)
  void _Dummy37();


  /**
   */

  @DISPID(65574)
  void _Dummy38();


  /**
   * @param customDictionary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreUppercase Optional parameter. Default value is com4j.Variant.getMissing()
   * @param alwaysSuggest Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spellLang Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(505)
  java.lang.Object checkSpelling(
    @Optional java.lang.Object customDictionary,
    @Optional java.lang.Object ignoreUppercase,
    @Optional java.lang.Object alwaysSuggest,
    @Optional java.lang.Object spellLang);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  int get_Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(0)
  @PropPut
  @DefaultMethod
  void set_Default(
    int rhs);


  /**
   */

  @DISPID(65577)
  void _Dummy41();


  /**
   */

  @DISPID(65578)
  void _Dummy42();


  /**
   */

  @DISPID(65579)
  void _Dummy43();


  /**
   */

  @DISPID(65580)
  void _Dummy44();


  /**
   */

  @DISPID(65581)
  void _Dummy45();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   */

  @DISPID(146)
  @PropGet
  excel.Font getFont();


  /**
   */

  @DISPID(65583)
  void _Dummy47();


  /**
   */

  @DISPID(65584)
  void _Dummy48();


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   */

  @DISPID(136)
  @PropGet
  java.lang.Object getHorizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(136)
  @PropPut
  void setHorizontalAlignment(
    java.lang.Object rhs);


  /**
   */

  @DISPID(65586)
  void _Dummy50();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   */

  @DISPID(129)
  @PropGet
  excel.Interior getInterior();


  /**
   */

  @DISPID(65588)
  void _Dummy52();


  /**
   */

  @DISPID(65589)
  void _Dummy53();


  /**
   */

  @DISPID(65590)
  void _Dummy54();


  /**
   */

  @DISPID(65591)
  void _Dummy55();


  /**
   */

  @DISPID(65592)
  void _Dummy56();


  /**
   */

  @DISPID(65593)
  void _Dummy57();


  /**
   */

  @DISPID(65594)
  void _Dummy58();


  /**
   */

  @DISPID(65595)
  void _Dummy59();


  /**
   */

  @DISPID(65596)
  void _Dummy60();


  /**
   */

  @DISPID(65597)
  void _Dummy61();


  /**
   */

  @DISPID(65598)
  void _Dummy62();


  /**
   */

  @DISPID(65599)
  void _Dummy63();


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   */

  @DISPID(134)
  @PropGet
  java.lang.Object getOrientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(134)
  @PropPut
  void setOrientation(
    java.lang.Object rhs);


  /**
   */

  @DISPID(65601)
  void _Dummy65();


  /**
   */

  @DISPID(65602)
  void _Dummy66();


  /**
   */

  @DISPID(65603)
  void _Dummy67();


  /**
   */

  @DISPID(65604)
  void _Dummy68();


  /**
   * <p>
   * Getter method for the COM property "RoundedCorners"
   * </p>
   */

  @DISPID(619)
  @PropGet
  boolean getRoundedCorners();


  /**
   * <p>
   * Setter method for the COM property "RoundedCorners"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(619)
  @PropPut
  void setRoundedCorners(
    boolean rhs);


  /**
   */

  @DISPID(65606)
  void _Dummy70();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   */

  @DISPID(103)
  @PropGet
  boolean getShadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(103)
  @PropPut
  void setShadow(
    boolean rhs);


  /**
   */

  @DISPID(65608)
  void _Dummy72();


  /**
   */

  @DISPID(65609)
  void _Dummy73();


  /**
   */

  @DISPID(244)
  com4j.Com4jObject ungroup();


  /**
   */

  @DISPID(65611)
  void _Dummy75();


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   */

  @DISPID(137)
  @PropGet
  java.lang.Object getVerticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(137)
  @PropPut
  void setVerticalAlignment(
    java.lang.Object rhs);


  /**
   */

  @DISPID(65613)
  void _Dummy77();


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   */

  @DISPID(975)
  @PropGet
  int getReadingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(975)
  @PropPut
  void setReadingOrder(
    int rhs);


  // Properties:
}
