package imapi2fs  ;

import com4j.*;

/**
 * FileSystemImage file item (rev.2)
 */
@IID("{199D0C19-11E1-40EB-8EC2-C8C822A07792}")
public interface IFsiFileItem2 extends imapi2fs.IFsiFileItem {
  // Methods:
  /**
   * <p>
   * Get the list of the named streams of the file
   * </p>
   * <p>
   * Getter method for the COM property "FsiNamedStreams"
   * </p>
   * @return  Returns a value of type imapi2fs.IFsiNamedStreams
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(24)
  imapi2fs.IFsiNamedStreams getFsiNamedStreams();


  @VTID(24)
  @ReturnValue(defaultPropertyThrough={imapi2fs.IFsiNamedStreams.class})
  imapi2fs.IFsiFileItem2 getFsiNamedStreams(
    int index);

  /**
   * <p>
   * Flag indicating if file item is a named stream of a file
   * </p>
   * <p>
   * Getter method for the COM property "IsNamedStream"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(25)
  boolean getIsNamedStream();


  /**
   * <p>
   * Add a new named stream to the collection
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @param streamData Mandatory imapi2fs.IStream parameter.
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(26)
  void addStream(
    java.lang.String name,
    imapi2common.IStream streamData);


  /**
   * <p>
   * Remove a specific named stream from the collection
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(27)
  void removeStream(
    java.lang.String name);


  /**
   * <p>
   * Flag indicating if file is Real-Time
   * </p>
   * <p>
   * Getter method for the COM property "IsRealTime"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(28)
  boolean getIsRealTime();


  /**
   * <p>
   * Flag indicating if file is Real-Time
   * </p>
   * <p>
   * Setter method for the COM property "IsRealTime"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(29)
  void setIsRealTime(
    boolean pVal);


  // Properties:
}
