package imapi2fs  ;

import com4j.*;

/**
 * Represents a single CD/DVD type device, and enables many common operations via a simplified API.
 */
@IID("{27354133-7F64-5B0F-8F00-5D77AFBE261E}")
public interface IDiscRecorder2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Ejects the media (if any) and opens the tray
   * </p>
   */

  @DISPID(256) //= 0x100. The runtime will prefer the VTID if present
  @VTID(7)
  void ejectMedia();


  /**
   * <p>
   * Close the media tray and load any media in the tray.
   * </p>
   */

  @DISPID(257) //= 0x101. The runtime will prefer the VTID if present
  @VTID(8)
  void closeTray();


  /**
   * <p>
   * Acquires exclusive access to device.  May be called multiple times.
   * </p>
   * @param force Mandatory boolean parameter.
   * @param __MIDL__IDiscRecorder20000 Mandatory java.lang.String parameter.
   */

  @DISPID(258) //= 0x102. The runtime will prefer the VTID if present
  @VTID(9)
  void acquireExclusiveAccess(
    boolean force,
    java.lang.String __MIDL__IDiscRecorder20000);


  /**
   * <p>
   * Releases exclusive access to device.  Call once per AcquireExclusiveAccess().
   * </p>
   */

  @DISPID(259) //= 0x103. The runtime will prefer the VTID if present
  @VTID(10)
  void releaseExclusiveAccess();


  /**
   * <p>
   * Disables Media Change Notification (MCN).
   * </p>
   */

  @DISPID(260) //= 0x104. The runtime will prefer the VTID if present
  @VTID(11)
  void disableMcn();


  /**
   * <p>
   * Re-enables Media Change Notification after a call to DisableMcn()
   * </p>
   */

  @DISPID(261) //= 0x105. The runtime will prefer the VTID if present
  @VTID(12)
  void enableMcn();


  /**
   * <p>
   * Initialize the recorder, opening a handle to the specified recorder.
   * </p>
   * @param recorderUniqueId Mandatory java.lang.String parameter.
   */

  @DISPID(262) //= 0x106. The runtime will prefer the VTID if present
  @VTID(13)
  void initializeDiscRecorder(
    java.lang.String recorderUniqueId);


  /**
   * <p>
   * The unique ID used to initialize the recorder.
   * </p>
   * <p>
   * Getter method for the COM property "ActiveDiscRecorder"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(14)
  @DefaultMethod
  java.lang.String getActiveDiscRecorder();


  /**
   * <p>
   * The vendor ID in the device's INQUIRY data.
   * </p>
   * <p>
   * Getter method for the COM property "VendorId"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(513) //= 0x201. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String getVendorId();


  /**
   * <p>
   * The Product ID in the device's INQUIRY data.
   * </p>
   * <p>
   * Getter method for the COM property "ProductId"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(514) //= 0x202. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String getProductId();


  /**
   * <p>
   * The Product Revision in the device's INQUIRY data.
   * </p>
   * <p>
   * Getter method for the COM property "ProductRevision"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(515) //= 0x203. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String getProductRevision();


  /**
   * <p>
   * Get the unique volume name (this is not a drive letter).
   * </p>
   * <p>
   * Getter method for the COM property "VolumeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(516) //= 0x204. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String getVolumeName();


  /**
   * <p>
   * Drive letters and NTFS mount points to access the recorder.
   * </p>
   * <p>
   * Getter method for the COM property "VolumePathNames"
   * </p>
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(517) //= 0x205. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.Object[] getVolumePathNames();


  /**
   * <p>
   * Gets whether the device can load the media tray
   * </p>
   * <p>
   * Getter method for the COM property "DeviceCanLoadMedia"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(518) //= 0x206. The runtime will prefer the VTID if present
  @VTID(20)
  boolean getDeviceCanLoadMedia();


  /**
   * <p>
   * Gets the legacy 'device number' associated with the recorder.  This number is not guaranteed to be static.
   * </p>
   * <p>
   * Getter method for the COM property "LegacyDeviceNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(519) //= 0x207. The runtime will prefer the VTID if present
  @VTID(21)
  int getLegacyDeviceNumber();


  /**
   * <p>
   * Gets a list of all feature pages supported by the device
   * </p>
   * <p>
   * Getter method for the COM property "SupportedFeaturePages"
   * </p>
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(520) //= 0x208. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.Object[] getSupportedFeaturePages();


  /**
   * <p>
   * Gets a list of all feature pages with 'current' bit set to true
   * </p>
   * <p>
   * Getter method for the COM property "CurrentFeaturePages"
   * </p>
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(521) //= 0x209. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.Object[] getCurrentFeaturePages();


  /**
   * <p>
   * Gets a list of all profiles supported by the device
   * </p>
   * <p>
   * Getter method for the COM property "SupportedProfiles"
   * </p>
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(522) //= 0x20a. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.Object[] getSupportedProfiles();


  /**
   * <p>
   * Gets a list of all profiles with 'currentP' bit set to true
   * </p>
   * <p>
   * Getter method for the COM property "CurrentProfiles"
   * </p>
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(523) //= 0x20b. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.Object[] getCurrentProfiles();


  /**
   * <p>
   * Gets a list of all MODE PAGES supported by the device
   * </p>
   * <p>
   * Getter method for the COM property "SupportedModePages"
   * </p>
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(524) //= 0x20c. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.Object[] getSupportedModePages();


  /**
   * <p>
   * Queries the device to determine who, if anyone, has acquired exclusive access
   * </p>
   * <p>
   * Getter method for the COM property "ExclusiveAccessOwner"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(525) //= 0x20d. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String getExclusiveAccessOwner();


  // Properties:
}
