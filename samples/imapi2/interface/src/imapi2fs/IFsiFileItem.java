package imapi2fs  ;

import com4j.*;

/**
 * FileSystemImage file item
 */
@IID("{2C941FDB-975B-59BE-A960-9A2A262853A5}")
public interface IFsiFileItem extends imapi2fs.IFsiItem {
  // Methods:
  /**
   * <p>
   * Data byte count
   * </p>
   * <p>
   * Getter method for the COM property "DataSize"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(19)
  long getDataSize();


  /**
   * <p>
   * Lower 32 bits of the data byte count
   * </p>
   * <p>
   * Getter method for the COM property "DataSize32BitLow"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(20)
  int getDataSize32BitLow();


  /**
   * <p>
   * Upper 32 bits of the data byte count
   * </p>
   * <p>
   * Getter method for the COM property "DataSize32BitHigh"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(21)
  int getDataSize32BitHigh();


  /**
   * <p>
   * Data stream
   * </p>
   * <p>
   * Getter method for the COM property "Data"
   * </p>
   * @return  Returns a value of type imapi2fs.IStream
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(22)
  imapi2common.IStream getData();


  /**
   * <p>
   * Data stream
   * </p>
   * <p>
   * Setter method for the COM property "Data"
   * </p>
   * @param pVal Mandatory imapi2fs.IStream parameter.
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(23)
  void setData(
    imapi2common.IStream pVal);


  // Properties:
}
