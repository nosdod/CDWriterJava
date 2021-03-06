package speech.types  ;

import com4j.*;

/**
 * ISpeechRecognizer Interface
 */
@IID("{2D5F1C0C-BD75-4B08-9478-3B11FEA2586C}")
public interface ISpeechRecognizer extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Recognizer
   * </p>
   * <p>
   * Setter method for the COM property "Recognizer"
   * </p>
   * @param recognizer Mandatory speech.types.ISpeechObjectToken parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void recognizer(
    speech.types.ISpeechObjectToken recognizer);


  /**
   * <p>
   * Recognizer
   * </p>
   * <p>
   * Getter method for the COM property "Recognizer"
   * </p>
   * @return  Returns a value of type speech.types.ISpeechObjectToken
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  speech.types.ISpeechObjectToken recognizer();


  /**
   * <p>
   * AllowAudioInputFormatChangesOnNextSet
   * </p>
   * <p>
   * Setter method for the COM property "AllowAudioInputFormatChangesOnNextSet"
   * </p>
   * @param allow Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void allowAudioInputFormatChangesOnNextSet(
    boolean allow);


  /**
   * <p>
   * AllowAudioInputFormatChangesOnNextSet
   * </p>
   * <p>
   * Getter method for the COM property "AllowAudioInputFormatChangesOnNextSet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  boolean allowAudioInputFormatChangesOnNextSet();


  /**
   * <p>
   * AudioInput
   * </p>
   * <p>
   * Setter method for the COM property "AudioInput"
   * </p>
   * @param audioInput Optional parameter. Default value is 0
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void audioInput(
    @Optional @DefaultValue("0") speech.types.ISpeechObjectToken audioInput);


  /**
   * <p>
   * AudioInput
   * </p>
   * <p>
   * Getter method for the COM property "AudioInput"
   * </p>
   * @return  Returns a value of type speech.types.ISpeechObjectToken
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  speech.types.ISpeechObjectToken audioInput();


  /**
   * <p>
   * AudioInputStream
   * </p>
   * <p>
   * Setter method for the COM property "AudioInputStream"
   * </p>
   * @param audioInputStream Optional parameter. Default value is 0
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void audioInputStream(
    @Optional @DefaultValue("0") speech.types.ISpeechBaseStream audioInputStream);


  /**
   * <p>
   * AudioInputStream
   * </p>
   * <p>
   * Getter method for the COM property "AudioInputStream"
   * </p>
   * @return  Returns a value of type speech.types.ISpeechBaseStream
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  speech.types.ISpeechBaseStream audioInputStream();


  /**
   * <p>
   * IsShared
   * </p>
   * <p>
   * Getter method for the COM property "IsShared"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  boolean isShared();


  /**
   * <p>
   * State
   * </p>
   * <p>
   * Setter method for the COM property "State"
   * </p>
   * @param state Mandatory speech.types.SpeechRecognizerState parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  void state(
    speech.types.SpeechRecognizerState state);


  /**
   * <p>
   * State
   * </p>
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type speech.types.SpeechRecognizerState
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  speech.types.SpeechRecognizerState state();


  /**
   * <p>
   * Status
   * </p>
   * <p>
   * Getter method for the COM property "Status"
   * </p>
   * @return  Returns a value of type speech.types.ISpeechRecognizerStatus
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  speech.types.ISpeechRecognizerStatus status();


  /**
   * <p>
   * Profile
   * </p>
   * <p>
   * Setter method for the COM property "Profile"
   * </p>
   * @param profile Optional parameter. Default value is 0
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  void profile(
    @Optional @DefaultValue("0") speech.types.ISpeechObjectToken profile);


  /**
   * <p>
   * Profile
   * </p>
   * <p>
   * Getter method for the COM property "Profile"
   * </p>
   * @return  Returns a value of type speech.types.ISpeechObjectToken
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  speech.types.ISpeechObjectToken profile();


  /**
   * <p>
   * EmulateRecognition
   * </p>
   * @param textElements Mandatory java.lang.Object parameter.
   * @param elementDisplayAttributes Optional parameter. Default value is ""
   * @param languageId Optional parameter. Default value is 0
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  void emulateRecognition(
    @MarshalAs(NativeType.VARIANT) java.lang.Object textElements,
    @Optional @DefaultValue("") java.lang.Object elementDisplayAttributes,
    @Optional @DefaultValue("0") int languageId);


  /**
   * <p>
   * CreateRecoContext
   * </p>
   * @return  Returns a value of type speech.types.ISpeechRecoContext
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(22)
  speech.types.ISpeechRecoContext createRecoContext();


  /**
   * <p>
   * GetFormat
   * </p>
   * @param type Mandatory speech.types.SpeechFormatType parameter.
   * @return  Returns a value of type speech.types.ISpeechAudioFormat
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(23)
  speech.types.ISpeechAudioFormat getFormat(
    speech.types.SpeechFormatType type);


  /**
   * <p>
   * SetPropertyNumber
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @param value Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(24)
  boolean setPropertyNumber(
    java.lang.String name,
    int value);


  /**
   * <p>
   * GetPropertyNumber
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @param value Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(25)
  boolean getPropertyNumber(
    java.lang.String name,
    Holder<Integer> value);


  /**
   * <p>
   * SetPropertyString
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(26)
  boolean setPropertyString(
    java.lang.String name,
    java.lang.String value);


  /**
   * <p>
   * GetPropertyString
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @param value Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(27)
  boolean getPropertyString(
    java.lang.String name,
    Holder<java.lang.String> value);


  /**
   * <p>
   * IsUISupported
   * </p>
   * @param typeOfUI Mandatory java.lang.String parameter.
   * @param extraData Optional parameter. Default value is ""
   * @return  Returns a value of type boolean
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(28)
  boolean isUISupported(
    java.lang.String typeOfUI,
    @Optional @DefaultValue("") java.lang.Object extraData);


  /**
   * <p>
   * DisplayUI
   * </p>
   * @param hWndParent Mandatory int parameter.
   * @param title Mandatory java.lang.String parameter.
   * @param typeOfUI Mandatory java.lang.String parameter.
   * @param extraData Optional parameter. Default value is ""
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(29)
  void displayUI(
    int hWndParent,
    java.lang.String title,
    java.lang.String typeOfUI,
    @Optional @DefaultValue("") java.lang.Object extraData);


  /**
   * <p>
   * GetRecognizers
   * </p>
   * @param requiredAttributes Optional parameter. Default value is ""
   * @param optionalAttributes Optional parameter. Default value is ""
   * @return  Returns a value of type speech.types.ISpeechObjectTokens
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(30)
  speech.types.ISpeechObjectTokens getRecognizers(
    @Optional @DefaultValue("") java.lang.String requiredAttributes,
    @Optional @DefaultValue("") java.lang.String optionalAttributes);


  /**
   * <p>
   * GetAudioInputs
   * </p>
   * @param requiredAttributes Optional parameter. Default value is ""
   * @param optionalAttributes Optional parameter. Default value is ""
   * @return  Returns a value of type speech.types.ISpeechObjectTokens
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(31)
  speech.types.ISpeechObjectTokens getAudioInputs(
    @Optional @DefaultValue("") java.lang.String requiredAttributes,
    @Optional @DefaultValue("") java.lang.String optionalAttributes);


  /**
   * <p>
   * GetProfiles
   * </p>
   * @param requiredAttributes Optional parameter. Default value is ""
   * @param optionalAttributes Optional parameter. Default value is ""
   * @return  Returns a value of type speech.types.ISpeechObjectTokens
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(32)
  speech.types.ISpeechObjectTokens getProfiles(
    @Optional @DefaultValue("") java.lang.String requiredAttributes,
    @Optional @DefaultValue("") java.lang.String optionalAttributes);


  // Properties:
}
