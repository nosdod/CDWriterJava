package excel  ;

import com4j.*;

@IID("{000244C3-0001-0000-C000-000000000046}")
public interface ISlicerCaches extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int getCount();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.SlicerCache
   */

  @VTID(11)
  excel.SlicerCache getItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.SlicerCache
   */

  @VTID(12)
  @DefaultMethod
  excel.SlicerCache get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param source Mandatory java.lang.Object parameter.
   * @param sourceField Mandatory java.lang.Object parameter.
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel.SlicerCache
   */

  @VTID(14)
  excel.SlicerCache add(
    @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @MarshalAs(NativeType.VARIANT) java.lang.Object sourceField,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name);


  // Properties:
}
