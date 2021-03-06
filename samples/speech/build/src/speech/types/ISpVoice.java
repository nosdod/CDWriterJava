package speech.types  ;

import com4j.*;

/**
 * ISpVoice Interface
 */
@IID("{6C44DF74-72B9-4992-A1EC-EF996E0422D4}")
public interface ISpVoice extends speech.types.ISpEventSource {
  // Methods:
  /**
   * @param pUnkOutput Mandatory com4j.Com4jObject parameter.
   * @param fAllowFormatChanges Mandatory int parameter.
   */

  @VTID(13)
  void setOutput(
    com4j.Com4jObject pUnkOutput,
    int fAllowFormatChanges);


  /**
   * @return  Returns a value of type speech.types.ISpObjectToken
   */

  @VTID(14)
  speech.types.ISpObjectToken getOutputObjectToken();


  /**
   * @return  Returns a value of type speech.types.ISpStreamFormat
   */

  @VTID(15)
  speech.types.ISpStreamFormat getOutputStream();


  /**
   */

  @VTID(16)
  void pause();


  /**
   */

  @VTID(17)
  void resume();


  /**
   * @param pToken Mandatory speech.types.ISpObjectToken parameter.
   */

  @VTID(18)
  void setVoice(
    speech.types.ISpObjectToken pToken);


  /**
   * @return  Returns a value of type speech.types.ISpObjectToken
   */

  @VTID(19)
  speech.types.ISpObjectToken getVoice();


  /**
   * @param pwcs Mandatory java.lang.String parameter.
   * @param dwFlags Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(20)
  int speak(
    @MarshalAs(NativeType.Unicode) java.lang.String pwcs,
    int dwFlags);


  /**
   * @param pStream Mandatory speech.types.IStream parameter.
   * @param dwFlags Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(21)
  int speakStream(
    speech.types.IStream pStream,
    int dwFlags);


    /**
     * @param pItemType Mandatory java.lang.String parameter.
     * @param lNumItems Mandatory int parameter.
     * @return  Returns a value of type int
     */

    @VTID(23)
    int skip(
      @MarshalAs(NativeType.Unicode) java.lang.String pItemType,
      int lNumItems);


    /**
     * @param ePriority Mandatory speech.types.SPVPRIORITY parameter.
     */

    @VTID(24)
    void setPriority(
      speech.types.SPVPRIORITY ePriority);


    /**
     * @return  Returns a value of type speech.types.SPVPRIORITY
     */

    @VTID(25)
    speech.types.SPVPRIORITY getPriority();


    /**
     * @param eBoundary Mandatory speech.types.SPEVENTENUM parameter.
     */

    @VTID(26)
    void setAlertBoundary(
      speech.types.SPEVENTENUM eBoundary);


    /**
     * @return  Returns a value of type speech.types.SPEVENTENUM
     */

    @VTID(27)
    speech.types.SPEVENTENUM getAlertBoundary();


    /**
     * @param rateAdjust Mandatory int parameter.
     */

    @VTID(28)
    void setRate(
      int rateAdjust);


    /**
     * @return  Returns a value of type int
     */

    @VTID(29)
    int getRate();


    /**
     * @param usVolume Mandatory short parameter.
     */

    @VTID(30)
    void setVolume(
      short usVolume);


    /**
     * @return  Returns a value of type short
     */

    @VTID(31)
    short getVolume();


    /**
     * @param msTimeout Mandatory int parameter.
     */

    @VTID(32)
    void waitUntilDone(
      int msTimeout);


    /**
     * @param msTimeout Mandatory int parameter.
     */

    @VTID(33)
    void setSyncSpeakTimeout(
      int msTimeout);


    /**
     * @return  Returns a value of type int
     */

    @VTID(34)
    int getSyncSpeakTimeout();


    /**
     */

    @VTID(35)
    void speakCompleteEvent();


    /**
     * @param pszTypeOfUI Mandatory java.lang.String parameter.
     * @param pvExtraData Mandatory java.nio.Buffer parameter.
     * @param cbExtraData Mandatory int parameter.
     * @return  Returns a value of type int
     */

    @VTID(36)
    int isUISupported(
      @MarshalAs(NativeType.Unicode) java.lang.String pszTypeOfUI,
      java.nio.Buffer pvExtraData,
      int cbExtraData);


    /**
     * @param hWndParent Mandatory int parameter.
     * @param pszTitle Mandatory java.lang.String parameter.
     * @param pszTypeOfUI Mandatory java.lang.String parameter.
     * @param pvExtraData Mandatory java.nio.Buffer parameter.
     * @param cbExtraData Mandatory int parameter.
     */

    @VTID(37)
    void displayUI(
      int hWndParent,
      @MarshalAs(NativeType.Unicode) java.lang.String pszTitle,
      @MarshalAs(NativeType.Unicode) java.lang.String pszTypeOfUI,
      java.nio.Buffer pvExtraData,
      int cbExtraData);


    // Properties:
  }
