package word  ;

import com4j.*;

@IID("{1B426348-607D-433C-9216-C5D2BF0EF31F}")
public interface OMathMatRows extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(8)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(9)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.OMathMatRow
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.OMathMatRow item(
    int index);


  /**
   * @param beforeRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.OMathMatRow
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(13)
  word.OMathMatRow add(
    @Optional java.lang.Object beforeRow);


  // Properties:
}
