package word  ;

import com4j.*;

@IID("{8245795B-9AED-4943-A16D-E586ED8180D1}")
public interface OMathArgs extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.OMath
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  word.OMath item(
    int index);


  /**
   * @param beforeArg Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.OMath
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(12)
  word.OMath add(
    @Optional java.lang.Object beforeArg);


  // Properties:
}
