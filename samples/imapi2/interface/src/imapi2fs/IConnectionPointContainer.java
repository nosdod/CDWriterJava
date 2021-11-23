package imapi2fs  ;

import com4j.*;

@IID("{B196B284-BAB4-101A-B69C-00AA00341D07}")
public interface IConnectionPointContainer extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type imapi2fs.IEnumConnectionPoints
   */

  @VTID(3)
  imapi2fs.IEnumConnectionPoints enumConnectionPoints();


  /**
   * @param riid Mandatory GUID parameter.
   * @return  Returns a value of type imapi2fs.IConnectionPoint
   */

  @VTID(4)
  imapi2fs.IConnectionPoint findConnectionPoint(
    GUID riid);


  // Properties:
}
