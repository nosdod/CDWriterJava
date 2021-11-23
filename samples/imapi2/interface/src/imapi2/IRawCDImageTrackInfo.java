package imapi2  ;

import com4j.*;

/**
 * CD Raw CD (Disc-at-Once) Per-Track Information
 */
@IID("{25983551-9D65-49CE-B335-40630D901227}")
public interface IRawCDImageTrackInfo extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The LBA of the first user sector in this track.
   * </p>
   * <p>
   * Getter method for the COM property "StartingLba"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(256) //= 0x100. The runtime will prefer the VTID if present
  @VTID(7)
  int getStartingLba();


  /**
   * <p>
   * The number of user sectors in this track.
   * </p>
   * <p>
   * Getter method for the COM property "SectorCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(257) //= 0x101. The runtime will prefer the VTID if present
  @VTID(8)
  int getSectorCount();


  /**
   * <p>
   * The track number assigned for this track.
   * </p>
   * <p>
   * Getter method for the COM property "TrackNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(258) //= 0x102. The runtime will prefer the VTID if present
  @VTID(9)
  int getTrackNumber();


  /**
   * <p>
   * The type of data being recorded on the current sector.
   * </p>
   * <p>
   * Getter method for the COM property "SectorType"
   * </p>
   * @return  Returns a value of type imapi2.IMAPI_CD_SECTOR_TYPE
   */

  @DISPID(259) //= 0x103. The runtime will prefer the VTID if present
  @VTID(10)
  imapi2.IMAPI_CD_SECTOR_TYPE getSectorType();


  /**
   * <p>
   * The International Standard Recording Code (ISRC) for this track.
   * </p>
   * <p>
   * Getter method for the COM property "ISRC"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(260) //= 0x104. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String getISRC();


  /**
   * <p>
   * The International Standard Recording Code (ISRC) for this track.
   * </p>
   * <p>
   * Setter method for the COM property "ISRC"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(260) //= 0x104. The runtime will prefer the VTID if present
  @VTID(12)
  void setISRC(
    java.lang.String value);


  /**
   * <p>
   * The digital audio copy setting for this track.
   * </p>
   * <p>
   * Getter method for the COM property "DigitalAudioCopySetting"
   * </p>
   * @return  Returns a value of type imapi2.IMAPI_CD_TRACK_DIGITAL_COPY_SETTING
   */

  @DISPID(261) //= 0x105. The runtime will prefer the VTID if present
  @VTID(13)
  imapi2.IMAPI_CD_TRACK_DIGITAL_COPY_SETTING getDigitalAudioCopySetting();


  /**
   * <p>
   * The digital audio copy setting for this track.
   * </p>
   * <p>
   * Setter method for the COM property "DigitalAudioCopySetting"
   * </p>
   * @param value Mandatory imapi2.IMAPI_CD_TRACK_DIGITAL_COPY_SETTING parameter.
   */

  @DISPID(261) //= 0x105. The runtime will prefer the VTID if present
  @VTID(14)
  void setDigitalAudioCopySetting(
    imapi2.IMAPI_CD_TRACK_DIGITAL_COPY_SETTING value);


  /**
   * <p>
   * The audio provided already has preemphasis applied (rare).
   * </p>
   * <p>
   * Getter method for the COM property "AudioHasPreemphasis"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(262) //= 0x106. The runtime will prefer the VTID if present
  @VTID(15)
  boolean getAudioHasPreemphasis();


  /**
   * <p>
   * The audio provided already has preemphasis applied (rare).
   * </p>
   * <p>
   * Setter method for the COM property "AudioHasPreemphasis"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(262) //= 0x106. The runtime will prefer the VTID if present
  @VTID(16)
  void setAudioHasPreemphasis(
    boolean value);


  /**
   * <p>
   * The list of current track-relative indexes within the CD track.
   * </p>
   * <p>
   * Getter method for the COM property "TrackIndexes"
   * </p>
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(263) //= 0x107. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.Object[] getTrackIndexes();


  /**
   * <p>
   * Add the specified LBA (relative to the start of the track) as an index.
   * </p>
   * @param lbaOffset Mandatory int parameter.
   */

  @DISPID(512) //= 0x200. The runtime will prefer the VTID if present
  @VTID(18)
  void addTrackIndex(
    int lbaOffset);


  /**
   * <p>
   * Removes the specified LBA (relative to the start of the track) as an index.
   * </p>
   * @param lbaOffset Mandatory int parameter.
   */

  @DISPID(513) //= 0x201. The runtime will prefer the VTID if present
  @VTID(19)
  void clearTrackIndex(
    int lbaOffset);


  // Properties:
}
