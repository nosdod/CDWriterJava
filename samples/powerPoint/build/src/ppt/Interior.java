package ppt  ;

import com4j.*;

@IID("{92D41A6C-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface Interior extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "Color"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  void color(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object color();


  /**
   * <p>
   * Setter method for the COM property "ColorIndex"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(9)
  void colorIndex(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ColorIndex"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object colorIndex();


  /**
   * <p>
   * Setter method for the COM property "InvertIfNegative"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(11)
  void invertIfNegative(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "InvertIfNegative"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object invertIfNegative();


  /**
   * <p>
   * Setter method for the COM property "Pattern"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(13)
  void pattern(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object pattern();


  /**
   * <p>
   * Setter method for the COM property "PatternColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(15)
  void patternColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PatternColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object patternColor();


  /**
   * <p>
   * Setter method for the COM property "PatternColorIndex"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(17)
  void patternColorIndex(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PatternColorIndex"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object patternColorIndex();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(19)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(21)
  ppt._Application application();


  // Properties:
}
