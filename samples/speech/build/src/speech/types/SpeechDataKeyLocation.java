package speech.types  ;

import com4j.*;

/**
 */
public enum SpeechDataKeyLocation implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  SDKLDefaultLocation(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SDKLCurrentUser(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SDKLLocalMachine(2),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  SDKLCurrentConfig(5),
  ;

  private final int value;
  SpeechDataKeyLocation(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
