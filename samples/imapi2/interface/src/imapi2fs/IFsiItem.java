package imapi2fs  ;

import com4j.*;

/**
 * FileSystemImage item
 */
@IID("{2C941FD9-975B-59BE-A960-9A2A262853A5}")
public interface IFsiItem extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Item name
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String getName();


  /**
   * <p>
   * Full path
   * </p>
   * <p>
   * Getter method for the COM property "FullPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String getFullPath();


  /**
   * <p>
   * Date and time of creation
   * </p>
   * <p>
   * Getter method for the COM property "CreationTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Date getCreationTime();


  /**
   * <p>
   * Date and time of creation
   * </p>
   * <p>
   * Setter method for the COM property "CreationTime"
   * </p>
   * @param pVal Mandatory java.util.Date parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(10)
  void setCreationTime(
    java.util.Date pVal);


  /**
   * <p>
   * Date and time of last access
   * </p>
   * <p>
   * Getter method for the COM property "LastAccessedTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Date getLastAccessedTime();


  /**
   * <p>
   * Date and time of last access
   * </p>
   * <p>
   * Setter method for the COM property "LastAccessedTime"
   * </p>
   * @param pVal Mandatory java.util.Date parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(12)
  void setLastAccessedTime(
    java.util.Date pVal);


  /**
   * <p>
   * Date and time of last modification
   * </p>
   * <p>
   * Getter method for the COM property "LastModifiedTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(13)
  java.util.Date getLastModifiedTime();


  /**
   * <p>
   * Date and time of last modification
   * </p>
   * <p>
   * Setter method for the COM property "LastModifiedTime"
   * </p>
   * @param pVal Mandatory java.util.Date parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(14)
  void setLastModifiedTime(
    java.util.Date pVal);


  /**
   * <p>
   * Flag indicating if item is hidden
   * </p>
   * <p>
   * Getter method for the COM property "IsHidden"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(15)
  boolean getIsHidden();


  /**
   * <p>
   * Flag indicating if item is hidden
   * </p>
   * <p>
   * Setter method for the COM property "IsHidden"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(16)
  void setIsHidden(
    boolean pVal);


  /**
   * <p>
   * Name of item in the specified file system
   * </p>
   * @param fileSystem Mandatory imapi2fs.FsiFileSystems parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String fileSystemName(
    imapi2fs.FsiFileSystems fileSystem);


  /**
   * <p>
   * Name of item in the specified file system
   * </p>
   * @param fileSystem Mandatory imapi2fs.FsiFileSystems parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String fileSystemPath(
    imapi2fs.FsiFileSystems fileSystem);


  // Properties:
}
