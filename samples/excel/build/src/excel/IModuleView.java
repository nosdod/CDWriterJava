package excel  ;

import com4j.*;

@IID("{00024489-0001-0000-C000-000000000046}")
public interface IModuleView extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "Sheet"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getSheet();


  // Properties:
}
