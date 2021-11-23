package ppt  ;

import com4j.*;

@IID("{914934EA-5A91-11CF-8700-00AA0060263B}")
public interface AnimationPoints extends ppt.Collection {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(10)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ppt.AnimationPoint
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  ppt.AnimationPoint item(
    int index);


  /**
   * @param index Optional parameter. Default value is -1
   * @return  Returns a value of type ppt.AnimationPoint
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.AnimationPoint add(
    @Optional @DefaultValue("-1") int index);


  /**
   * <p>
   * Getter method for the COM property "Smooth"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoTriState smooth();


  /**
   * <p>
   * Setter method for the COM property "Smooth"
   * </p>
   * @param smooth Mandatory office.MsoTriState parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(15)
  void smooth(
    office.MsoTriState smooth);


  // Properties:
}
