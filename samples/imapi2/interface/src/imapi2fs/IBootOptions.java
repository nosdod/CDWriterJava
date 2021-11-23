package imapi2fs  ;

import com4j.*;

/**
 * Boot options
 */
@IID("{2C941FD4-975B-59BE-A960-9A2A262853A5}")
public interface IBootOptions extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Get boot image data stream
   * </p>
   * <p>
   * Getter method for the COM property "BootImage"
   * </p>
   * @return  Returns a value of type imapi2fs.IStream
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  imapi2common.IStream getBootImage();


  /**
   * <p>
   * Get boot manufacturer
   * </p>
   * <p>
   * Getter method for the COM property "Manufacturer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String getManufacturer();


  /**
   * <p>
   * Get boot manufacturer
   * </p>
   * <p>
   * Setter method for the COM property "Manufacturer"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void setManufacturer(
    java.lang.String pVal);


  /**
   * <p>
   * Get boot platform identifier
   * </p>
   * <p>
   * Getter method for the COM property "PlatformId"
   * </p>
   * @return  Returns a value of type imapi2fs.PlatformId
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  imapi2fs.PlatformId getPlatformId();


  /**
   * <p>
   * Get boot platform identifier
   * </p>
   * <p>
   * Setter method for the COM property "PlatformId"
   * </p>
   * @param pVal Mandatory imapi2fs.PlatformId parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void setPlatformId(
    imapi2fs.PlatformId pVal);


  /**
   * <p>
   * Get boot emulation type
   * </p>
   * <p>
   * Getter method for the COM property "Emulation"
   * </p>
   * @return  Returns a value of type imapi2fs.EmulationType
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  imapi2fs.EmulationType getEmulation();


  /**
   * <p>
   * Get boot emulation type
   * </p>
   * <p>
   * Setter method for the COM property "Emulation"
   * </p>
   * @param pVal Mandatory imapi2fs.EmulationType parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void setEmulation(
    imapi2fs.EmulationType pVal);


  /**
   * <p>
   * Get boot image size
   * </p>
   * <p>
   * Getter method for the COM property "ImageSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  int getImageSize();


  /**
   * <p>
   * Set the boot image data stream, emulation type, and image size
   * </p>
   * @param newVal Mandatory imapi2fs.IStream parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(15)
  void assignBootImage(
    imapi2common.IStream newVal);


  // Properties:
}
