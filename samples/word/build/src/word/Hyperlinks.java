package word  ;

import com4j.*;

@IID("{0002099C-0000-0000-C000-000000000046}")
public interface Hyperlinks extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.Hyperlink
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.Hyperlink item(
    java.lang.Object index);


  /**
   * @param anchor Mandatory com4j.Com4jObject parameter.
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param subAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Hyperlink
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(13)
  word.Hyperlink _Add(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject anchor,
    @Optional java.lang.Object address,
    @Optional java.lang.Object subAddress);


  /**
   * @param anchor Mandatory com4j.Com4jObject parameter.
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @param subAddress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param screenTip Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textToDisplay Optional parameter. Default value is com4j.Variant.getMissing()
   * @param target Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Hyperlink
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  word.Hyperlink add(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject anchor,
    @Optional java.lang.Object address,
    @Optional java.lang.Object subAddress,
    @Optional java.lang.Object screenTip,
    @Optional java.lang.Object textToDisplay,
    @Optional java.lang.Object target);


  // Properties:
}
