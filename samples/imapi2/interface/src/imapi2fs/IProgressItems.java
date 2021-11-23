package imapi2fs  ;

import com4j.*;

/**
 * Progress item block mapping collection
 */
@IID("{2C941FD7-975B-59BE-A960-9A2A262853A5}")
public interface IProgressItems extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Get an enumerator for the collection
   * </p>
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Find the block mapping from the specified index
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type imapi2fs.IProgressItem
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  imapi2fs.IProgressItem getItem(
    int index);


  /**
   * <p>
   * Number of items in the collection
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  int getCount();


  /**
   * <p>
   * Find the block mapping from the specified block
   * </p>
   * @param block Mandatory int parameter.
   * @return  Returns a value of type imapi2fs.IProgressItem
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  imapi2fs.IProgressItem progressItemFromBlock(
    int block);


  /**
   * <p>
   * Find the block mapping from the specified item description
   * </p>
   * @param description Mandatory java.lang.String parameter.
   * @return  Returns a value of type imapi2fs.IProgressItem
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  imapi2fs.IProgressItem progressItemFromDescription(
    java.lang.String description);


  /**
   * <p>
   * Get a non-variant enumerator
   * </p>
   * <p>
   * Getter method for the COM property "EnumProgressItems"
   * </p>
   * @return  Returns a value of type imapi2fs.IEnumProgressItems
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  imapi2fs.IEnumProgressItems getEnumProgressItems();


  // Properties:
}
