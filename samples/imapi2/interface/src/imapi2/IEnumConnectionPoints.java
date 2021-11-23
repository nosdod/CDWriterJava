package imapi2  ;

import com4j.*;

@IID("{B196B285-BAB4-101A-B69C-00AA00341D07}")
public interface IEnumConnectionPoints extends Com4jObject {
  // Methods:
  /**
   * @param cConnections Mandatory int parameter.
   * @param ppCP Mandatory Holder<imapi2.IConnectionPoint> parameter.
   * @param pcFetched Mandatory Holder<Integer> parameter.
   */

  @VTID(3)
  void remoteNext(
    int cConnections,
    Holder<imapi2.IConnectionPoint> ppCP,
    Holder<Integer> pcFetched);


  /**
   * @param cConnections Mandatory int parameter.
   */

  @VTID(4)
  void skip(
    int cConnections);


  /**
   */

  @VTID(5)
  void reset();


  /**
   * @return  Returns a value of type imapi2.IEnumConnectionPoints
   */

  @VTID(6)
  imapi2.IEnumConnectionPoints clone();


  // Properties:
}
