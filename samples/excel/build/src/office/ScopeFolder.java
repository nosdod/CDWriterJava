package office  ;

import com4j.*;

@IID("{000C0368-0000-0000-C000-000000000046}")
public interface ScopeFolder extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  java.lang.String getName();


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String getPath();


  /**
   * <p>
   * Getter method for the COM property "ScopeFolders"
   * </p>
   * @return  Returns a value of type office.ScopeFolders
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  office.ScopeFolders getScopeFolders();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={office.ScopeFolders.class})
  office.ScopeFolder getScopeFolders(
    int index);

  /**
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  void addToSearchFolders();


  // Properties:
}
