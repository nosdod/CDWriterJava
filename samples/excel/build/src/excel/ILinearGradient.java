package excel  ;

import com4j.*;

@IID("{000244AF-0001-0000-C000-000000000046}")
public interface ILinearGradient extends Com4jObject {
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
   * Getter method for the COM property "ColorStops"
   * </p>
   * @return  Returns a value of type excel.ColorStops
   */

  @VTID(10)
  excel.ColorStops getColorStops();


  /**
   * <p>
   * Getter method for the COM property "Degree"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(11)
  double getDegree();


  /**
   * <p>
   * Setter method for the COM property "Degree"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(12)
  void setDegree(
    double rhs);


  // Properties:
}
