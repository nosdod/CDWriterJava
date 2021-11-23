package imapi2fs  ;

import com4j.*;

/**
 * A continuous LBA range
 */
@IID("{B507CA25-2204-11DD-966A-001AA01BBC58}")
public interface IBlockRange extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The first LBA in the range.
   * </p>
   * <p>
   * Getter method for the COM property "StartLba"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(256) //= 0x100. The runtime will prefer the VTID if present
  @VTID(7)
  int getStartLba();


  /**
   * <p>
   * The last LBA in the range.
   * </p>
   * <p>
   * Getter method for the COM property "EndLba"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(257) //= 0x101. The runtime will prefer the VTID if present
  @VTID(8)
  int getEndLba();


  // Properties:
}
