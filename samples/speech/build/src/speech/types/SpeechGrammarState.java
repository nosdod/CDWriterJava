package speech.types  ;

import com4j.*;

/**
 */
public enum SpeechGrammarState implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SGSEnabled(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  SGSDisabled(0),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  SGSExclusive(3),
  ;

  private final int value;
  SpeechGrammarState(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
