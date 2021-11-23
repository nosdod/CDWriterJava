package imapi2fs  ;

import com4j.*;

/**
 * File system image (rev.3)
 */
@IID("{7CFF842C-7E97-4807-8304-910DD8F7C051}")
public interface IFileSystemImage3 extends imapi2fs.IFileSystemImage2 {
  // Methods:
  /**
   * <p>
   * If true, indicates that UDF Metadata and Metadata Mirror files are truly redundant, i.e. reference different extents
   * </p>
   * <p>
   * Getter method for the COM property "CreateRedundantUdfMetadataFiles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(59)
  boolean getCreateRedundantUdfMetadataFiles();


  /**
   * <p>
   * If true, indicates that UDF Metadata and Metadata Mirror files are truly redundant, i.e. reference different extents
   * </p>
   * <p>
   * Setter method for the COM property "CreateRedundantUdfMetadataFiles"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(60)
  void setCreateRedundantUdfMetadataFiles(
    boolean pVal);


  /**
   * <p>
   * Probe if a specific file system on the disc is appendable through IMAPI
   * </p>
   * @param fileSystemToProbe Mandatory imapi2fs.FsiFileSystems parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(61)
  boolean probeSpecificFileSystem(
    imapi2fs.FsiFileSystems fileSystemToProbe);


  // Properties:
}
