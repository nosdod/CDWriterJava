package excel  ;

import com4j.*;

/**
 */
public enum XlConnectionType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xlConnectionTypeOLEDB(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  xlConnectionTypeODBC(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  xlConnectionTypeXMLMAP(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  xlConnectionTypeTEXT(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  xlConnectionTypeWEB(5),
  ;

  private final int value;
  XlConnectionType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
