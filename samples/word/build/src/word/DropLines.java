package word  ;

import com4j.*;

@IID("{9F1DF642-3CCE-4D83-A770-D2634A05D278}")
public interface DropLines extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  void select();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type word.ChartBorder
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  word.ChartBorder border();


  /**
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type word.ChartFormat
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  word.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(14)
  int creator();


  // Properties:
}
