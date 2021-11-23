package imapi2  ;

import com4j.*;

/**
 * Provides notification of the arrival/removal of CD/DVD (optical) devices.
 */
@IID("{27354131-7F64-5B0F-8F00-5D77AFBE261E}")
public interface DDiscMaster2Events extends Com4jObject {
  // Methods:
  /**
   * <p>
   * A device was added to the system
   * </p>
   * @param object Mandatory com4j.Com4jObject parameter.
   * @param uniqueId Mandatory java.lang.String parameter.
   */

  @VTID(7)
  void notifyDeviceAdded(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject object,
    java.lang.String uniqueId);


  /**
   * <p>
   * A device was removed from the system
   * </p>
   * @param object Mandatory com4j.Com4jObject parameter.
   * @param uniqueId Mandatory java.lang.String parameter.
   */

  @VTID(8)
  void notifyDeviceRemoved(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject object,
    java.lang.String uniqueId);


  // Properties:
}
