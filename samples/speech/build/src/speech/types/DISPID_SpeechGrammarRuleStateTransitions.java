package speech.types  ;

import com4j.*;

/**
 */
public enum DISPID_SpeechGrammarRuleStateTransitions implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  DISPID_SGRSTsCount(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DISPID_SGRSTsItem(0),
  /**
   * <p>
   * The value of this constant is -4
   * </p>
   */
  DISPID_SGRSTs_NewEnum(-4),
  ;

  private final int value;
  DISPID_SpeechGrammarRuleStateTransitions(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
