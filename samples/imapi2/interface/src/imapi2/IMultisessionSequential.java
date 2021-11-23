package imapi2  ;

import com4j.*;

/**
 * Sequential multisession support interface
 */
@IID("{27354151-7F64-5B0F-8F00-5D77AFBE261E}")
public interface IMultisessionSequential extends imapi2.IMultisession {
  // Methods:
  /**
   * <p>
   * Is this the first data session on the media?
   * </p>
   * <p>
   * Getter method for the COM property "IsFirstDataSession"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(512) //= 0x200. The runtime will prefer the VTID if present
  @VTID(11)
  boolean getIsFirstDataSession();


  /**
   * <p>
   * The first sector in the previous session on the media.
   * </p>
   * <p>
   * Getter method for the COM property "StartAddressOfPreviousSession"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(513) //= 0x201. The runtime will prefer the VTID if present
  @VTID(12)
  int getStartAddressOfPreviousSession();


  /**
   * <p>
   * The last sector in the previous session on the media.
   * </p>
   * <p>
   * Getter method for the COM property "LastWrittenAddressOfPreviousSession"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(514) //= 0x202. The runtime will prefer the VTID if present
  @VTID(13)
  int getLastWrittenAddressOfPreviousSession();


  /**
   * <p>
   * Next writable address on the media (also used sectors).
   * </p>
   * <p>
   * Getter method for the COM property "NextWritableAddress"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(515) //= 0x203. The runtime will prefer the VTID if present
  @VTID(14)
  int getNextWritableAddress();


  /**
   * <p>
   * Free sectors available on the media.
   * </p>
   * <p>
   * Getter method for the COM property "FreeSectorsOnMedia"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(516) //= 0x204. The runtime will prefer the VTID if present
  @VTID(15)
  int getFreeSectorsOnMedia();


  // Properties:
}
