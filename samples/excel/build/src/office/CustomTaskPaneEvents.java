package office  ;

import com4j.*;

@IID("{8A64A872-FC6B-4D4A-926E-3A3689562C1C}")
public interface CustomTaskPaneEvents extends Com4jObject {
  // Methods:
  /**
   * @param customTaskPaneInst Mandatory office._CustomTaskPane parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void visibleStateChange(
    office._CustomTaskPane customTaskPaneInst);


  /**
   * @param customTaskPaneInst Mandatory office._CustomTaskPane parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void dockPositionStateChange(
    office._CustomTaskPane customTaskPaneInst);


  // Properties:
}
