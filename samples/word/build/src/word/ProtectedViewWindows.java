package word  ;

import com4j.*;

@IID("{FD0A74E8-C719-49F6-BA1B-F6D9839D1AB9}")
public interface ProtectedViewWindows extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(10)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.ProtectedViewWindow
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.ProtectedViewWindow item(
    java.lang.Object index);


  /**
   * @param fileName Mandatory java.lang.Object parameter.
   * @param addToRecentFiles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visible Optional parameter. Default value is com4j.Variant.getMissing()
   * @param openAndRepair Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.ProtectedViewWindow
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  word.ProtectedViewWindow open(
    java.lang.Object fileName,
    @Optional java.lang.Object addToRecentFiles,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object visible,
    @Optional java.lang.Object openAndRepair);


  // Properties:
}
