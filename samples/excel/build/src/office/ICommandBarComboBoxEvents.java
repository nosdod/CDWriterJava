package office  ;

import com4j.*;

@IID("{55F88896-7708-11D1-ACEB-006008961DA5}")
public interface ICommandBarComboBoxEvents extends Com4jObject {
  // Methods:
  /**
   * @param ctrl Mandatory office._CommandBarComboBox parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void change(
    office._CommandBarComboBox ctrl);


  // Properties:
}
