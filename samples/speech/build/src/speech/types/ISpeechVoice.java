package speech.types  ;

import com4j.*;

/**
 * ISpeechVoice Interface
 */
@IID("{269316D8-57BD-11D2-9EEE-00C04F797396}")
public interface ISpeechVoice extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Status
   * </p>
   * <p>
   * Getter method for the COM property "Status"
   * </p>
   * @return  Returns a value of type speech.types.ISpeechVoiceStatus
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  speech.types.ISpeechVoiceStatus status();


  /**
   * <p>
   * Voice
   * </p>
   * <p>
   * Getter method for the COM property "Voice"
   * </p>
   * @return  Returns a value of type speech.types.ISpeechObjectToken
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  speech.types.ISpeechObjectToken voice();


  /**
   * <p>
   * Voice
   * </p>
   * <p>
   * Setter method for the COM property "Voice"
   * </p>
   * @param voice Mandatory speech.types.ISpeechObjectToken parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void voice(
    speech.types.ISpeechObjectToken voice);


  /**
   * <p>
   * Gets the audio output object
   * </p>
   * <p>
   * Getter method for the COM property "AudioOutput"
   * </p>
   * @return  Returns a value of type speech.types.ISpeechObjectToken
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  speech.types.ISpeechObjectToken audioOutput();


  /**
   * <p>
   * Gets the audio output object
   * </p>
   * <p>
   * Setter method for the COM property "AudioOutput"
   * </p>
   * @param audioOutput Mandatory speech.types.ISpeechObjectToken parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void audioOutput(
    speech.types.ISpeechObjectToken audioOutput);


  /**
   * <p>
   * Gets the audio output stream
   * </p>
   * <p>
   * Getter method for the COM property "AudioOutputStream"
   * </p>
   * @return  Returns a value of type speech.types.ISpeechBaseStream
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  speech.types.ISpeechBaseStream audioOutputStream();


  /**
   * <p>
   * Gets the audio output stream
   * </p>
   * <p>
   * Setter method for the COM property "AudioOutputStream"
   * </p>
   * @param audioOutputStream Mandatory speech.types.ISpeechBaseStream parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void audioOutputStream(
    speech.types.ISpeechBaseStream audioOutputStream);


  /**
   * <p>
   * Rate
   * </p>
   * <p>
   * Getter method for the COM property "Rate"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  int rate();


  /**
   * <p>
   * Rate
   * </p>
   * <p>
   * Setter method for the COM property "Rate"
   * </p>
   * @param rate Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void rate(
    int rate);


  /**
   * <p>
   * Volume
   * </p>
   * <p>
   * Getter method for the COM property "Volume"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  int volume();


  /**
   * <p>
   * Volume
   * </p>
   * <p>
   * Setter method for the COM property "Volume"
   * </p>
   * @param volume Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void volume(
    int volume);


  /**
   * <p>
   * AllowAudioOutputFormatChangesOnNextSet
   * </p>
   * <p>
   * Setter method for the COM property "AllowAudioOutputFormatChangesOnNextSet"
   * </p>
   * @param allow Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  void allowAudioOutputFormatChangesOnNextSet(
    boolean allow);


  /**
   * <p>
   * AllowAudioOutputFormatChangesOnNextSet
   * </p>
   * <p>
   * Getter method for the COM property "AllowAudioOutputFormatChangesOnNextSet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  boolean allowAudioOutputFormatChangesOnNextSet();


  /**
   * <p>
   * EventInterests
   * </p>
   * <p>
   * Getter method for the COM property "EventInterests"
   * </p>
   * @return  Returns a value of type speech.types.SpeechVoiceEvents
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  speech.types.SpeechVoiceEvents eventInterests();


  /**
   * <p>
   * EventInterests
   * </p>
   * <p>
   * Setter method for the COM property "EventInterests"
   * </p>
   * @param eventInterestFlags Mandatory speech.types.SpeechVoiceEvents parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void eventInterests(
    speech.types.SpeechVoiceEvents eventInterestFlags);


  /**
   * <p>
   * Priority
   * </p>
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param priority Mandatory speech.types.SpeechVoicePriority parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  void priority(
    speech.types.SpeechVoicePriority priority);


  /**
   * <p>
   * Priority
   * </p>
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type speech.types.SpeechVoicePriority
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  speech.types.SpeechVoicePriority priority();


  /**
   * <p>
   * AlertBoundary
   * </p>
   * <p>
   * Setter method for the COM property "AlertBoundary"
   * </p>
   * @param boundary Mandatory speech.types.SpeechVoiceEvents parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  void alertBoundary(
    speech.types.SpeechVoiceEvents boundary);


  /**
   * <p>
   * AlertBoundary
   * </p>
   * <p>
   * Getter method for the COM property "AlertBoundary"
   * </p>
   * @return  Returns a value of type speech.types.SpeechVoiceEvents
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  speech.types.SpeechVoiceEvents alertBoundary();


  /**
   * <p>
   * SyncSpeakTimeout
   * </p>
   * <p>
   * Setter method for the COM property "SynchronousSpeakTimeout"
   * </p>
   * @param msTimeout Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  void synchronousSpeakTimeout(
    int msTimeout);


  /**
   * <p>
   * SyncSpeakTimeout
   * </p>
   * <p>
   * Getter method for the COM property "SynchronousSpeakTimeout"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  int synchronousSpeakTimeout();


  /**
   * <p>
   * Speak
   * </p>
   * @param text Mandatory java.lang.String parameter.
   * @param flags Optional parameter. Default value is 0
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  int speak(
    java.lang.String text,
    @Optional @DefaultValue("0") speech.types.SpeechVoiceSpeakFlags flags);


  /**
   * <p>
   * SpeakStream
   * </p>
   * @param stream Mandatory speech.types.ISpeechBaseStream parameter.
   * @param flags Optional parameter. Default value is 0
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(29)
  int speakStream(
    speech.types.ISpeechBaseStream stream,
    @Optional @DefaultValue("0") speech.types.SpeechVoiceSpeakFlags flags);


  /**
   * <p>
   * Pauses the voices rendering.
   * </p>
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(30)
  void pause();


  /**
   * <p>
   * Resumes the voices rendering.
   * </p>
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(31)
  void resume();


  /**
   * <p>
   * Skips rendering the specified number of items.
   * </p>
   * @param type Mandatory java.lang.String parameter.
   * @param numItems Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(32)
  int skip(
    java.lang.String type,
    int numItems);


  /**
   * <p>
   * GetVoices
   * </p>
   * @param requiredAttributes Optional parameter. Default value is ""
   * @param optionalAttributes Optional parameter. Default value is ""
   * @return  Returns a value of type speech.types.ISpeechObjectTokens
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(33)
  speech.types.ISpeechObjectTokens getVoices(
    @Optional @DefaultValue("") java.lang.String requiredAttributes,
    @Optional @DefaultValue("") java.lang.String optionalAttributes);


  /**
   * <p>
   * GetAudioOutputs
   * </p>
   * @param requiredAttributes Optional parameter. Default value is ""
   * @param optionalAttributes Optional parameter. Default value is ""
   * @return  Returns a value of type speech.types.ISpeechObjectTokens
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(34)
  speech.types.ISpeechObjectTokens getAudioOutputs(
    @Optional @DefaultValue("") java.lang.String requiredAttributes,
    @Optional @DefaultValue("") java.lang.String optionalAttributes);


  /**
   * <p>
   * WaitUntilDone
   * </p>
   * @param msTimeout Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(35)
  boolean waitUntilDone(
    int msTimeout);


  /**
   * <p>
   * SpeakCompleteEvent
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(36)
  int speakCompleteEvent();


  /**
   * <p>
   * IsUISupported
   * </p>
   * @param typeOfUI Mandatory java.lang.String parameter.
   * @param extraData Optional parameter. Default value is ""
   * @return  Returns a value of type boolean
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(37)
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

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(38)
  void displayUI(
    int hWndParent,
    java.lang.String title,
    java.lang.String typeOfUI,
    @Optional @DefaultValue("") java.lang.Object extraData);


  // Properties:
}
