package excel  ;

import com4j.*;

@IID("{00024460-0001-0000-C000-000000000046}")
public interface ISmartTag extends Com4jObject {
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
   * Getter method for the COM property "DownloadURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String getDownloadURL();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  java.lang.String getName();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  @DefaultMethod
  java.lang.String get_Default();


  /**
   * <p>
   * Getter method for the COM property "XML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(13)
  java.lang.String getXML();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(14)
  excel.Range getRange();


  /**
   */

  @VTID(15)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "SmartTagActions"
   * </p>
   * @return  Returns a value of type excel.SmartTagActions
   */

  @VTID(16)
  excel.SmartTagActions getSmartTagActions();


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type excel.CustomProperties
   */

  @VTID(17)
  excel.CustomProperties getProperties();


  // Properties:
}
