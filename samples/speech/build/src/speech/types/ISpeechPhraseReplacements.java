package speech.types  ;

import com4j.*;

/**
 * ISpeechPhraseReplacements Interface
 */
@IID("{38BC662F-2257-4525-959E-2069D2596C05}")
public interface ISpeechPhraseReplacements extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Count
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int count();


  /**
   * <p>
   * Item
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type speech.types.ISpeechPhraseReplacement
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  speech.types.ISpeechPhraseReplacement item(
    int index);


  /**
   * <p>
   * Enumerates the tokens
   * </p>
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
