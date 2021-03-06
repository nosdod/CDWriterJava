package word  ;

import com4j.*;

@IID("{00020914-0000-0000-C000-000000000046}")
public interface TablesOfContents extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(10)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type word.WdTocFormat
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdTocFormat format();


  /**
   * <p>
   * Setter method for the COM property "Format"
   * </p>
   * @param prop Mandatory word.WdTocFormat parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void format(
    word.WdTocFormat prop);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.TableOfContents
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(14)
  @DefaultMethod
  word.TableOfContents item(
    int index);


  /**
   * @param range Mandatory word.Range parameter.
   * @param useHeadingStyles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param upperHeadingLevel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lowerHeadingLevel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rightAlignPageNumbers Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includePageNumbers Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addedStyles Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.TableOfContents
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(15)
  word.TableOfContents addOld(
    word.Range range,
    @Optional java.lang.Object useHeadingStyles,
    @Optional java.lang.Object upperHeadingLevel,
    @Optional java.lang.Object lowerHeadingLevel,
    @Optional java.lang.Object useFields,
    @Optional java.lang.Object tableID,
    @Optional java.lang.Object rightAlignPageNumbers,
    @Optional java.lang.Object includePageNumbers,
    @Optional java.lang.Object addedStyles);


  /**
   * @param range Mandatory word.Range parameter.
   * @param entry Optional parameter. Default value is com4j.Variant.getMissing()
   * @param entryAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param level Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Field
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(16)
  word.Field markEntry(
    word.Range range,
    @Optional java.lang.Object entry,
    @Optional java.lang.Object entryAutoText,
    @Optional java.lang.Object tableID,
    @Optional java.lang.Object level);


  /**
   * @param range Mandatory word.Range parameter.
   * @param useHeadingStyles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param upperHeadingLevel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lowerHeadingLevel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rightAlignPageNumbers Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includePageNumbers Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addedStyles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useHyperlinks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hidePageNumbersInWeb Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.TableOfContents
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(17)
  word.TableOfContents add2000(
    word.Range range,
    @Optional java.lang.Object useHeadingStyles,
    @Optional java.lang.Object upperHeadingLevel,
    @Optional java.lang.Object lowerHeadingLevel,
    @Optional java.lang.Object useFields,
    @Optional java.lang.Object tableID,
    @Optional java.lang.Object rightAlignPageNumbers,
    @Optional java.lang.Object includePageNumbers,
    @Optional java.lang.Object addedStyles,
    @Optional java.lang.Object useHyperlinks,
    @Optional java.lang.Object hidePageNumbersInWeb);


  /**
   * @param range Mandatory word.Range parameter.
   * @param useHeadingStyles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param upperHeadingLevel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lowerHeadingLevel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rightAlignPageNumbers Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includePageNumbers Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addedStyles Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useHyperlinks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hidePageNumbersInWeb Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useOutlineLevels Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.TableOfContents
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(18)
  word.TableOfContents add(
    word.Range range,
    @Optional java.lang.Object useHeadingStyles,
    @Optional java.lang.Object upperHeadingLevel,
    @Optional java.lang.Object lowerHeadingLevel,
    @Optional java.lang.Object useFields,
    @Optional java.lang.Object tableID,
    @Optional java.lang.Object rightAlignPageNumbers,
    @Optional java.lang.Object includePageNumbers,
    @Optional java.lang.Object addedStyles,
    @Optional java.lang.Object useHyperlinks,
    @Optional java.lang.Object hidePageNumbersInWeb,
    @Optional java.lang.Object useOutlineLevels);


  // Properties:
}
