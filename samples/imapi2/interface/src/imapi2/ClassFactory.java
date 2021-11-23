package imapi2  ;

import com4j.*;
import imapi2common.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * Microsoft IMAPIv2 Disc Master
   */
  public static imapi2.IDiscMaster2 createMsftDiscMaster2() {
    return COM4J.createInstance( imapi2.IDiscMaster2.class, "{2735412E-7F64-5B0F-8F00-5D77AFBE261E}" );
  }

  /**
   * Microsoft IMAPIv2 Disc Recorder
   */
  public static imapi2.IDiscRecorder2 createMsftDiscRecorder2() {
    return COM4J.createInstance( imapi2.IDiscRecorder2.class, "{2735412D-7F64-5B0F-8F00-5D77AFBE261E}" );
  }

  /**
   * Microsoft IMAPIv2 CD Write Engine
   */
  public static imapi2.IWriteEngine2 createMsftWriteEngine2() {
    return COM4J.createInstance( imapi2.IWriteEngine2.class, "{2735412C-7F64-5B0F-8F00-5D77AFBE261E}" );
  }

  /**
   * Microsoft IMAPIv2 Media Erase/Blank
   */
  public static imapi2.IDiscFormat2Erase createMsftDiscFormat2Erase() {
    return COM4J.createInstance( imapi2.IDiscFormat2Erase.class, "{2735412B-7F64-5B0F-8F00-5D77AFBE261E}" );
  }

  /**
   * Microsoft IMAPIv2 Data Writer
   */
  public static imapi2.IDiscFormat2Data createMsftDiscFormat2Data() {
    return COM4J.createInstance( imapi2.IDiscFormat2Data.class, "{2735412A-7F64-5B0F-8F00-5D77AFBE261E}" );
  }

  /**
   * Microsoft IMAPIv2 Track-at-Once Audio CD Writer
   */
  public static imapi2.IDiscFormat2TrackAtOnce createMsftDiscFormat2TrackAtOnce() {
    return COM4J.createInstance( imapi2.IDiscFormat2TrackAtOnce.class, "{27354129-7F64-5B0F-8F00-5D77AFBE261E}" );
  }

  /**
   * Microsoft IMAPIv2 Disc-at-Once RAW CD Image Writer
   */
  public static imapi2.IDiscFormat2RawCD createMsftDiscFormat2RawCD() {
    return COM4J.createInstance( imapi2.IDiscFormat2RawCD.class, "{27354128-7F64-5B0F-8F00-5D77AFBE261E}" );
  }

  /**
   * Microsoft IMAPIv2 /dev/zero Stream 
   */
  public static imapi2common.IStream createMsftStreamZero() {
    return COM4J.createInstance( imapi2common.IStream.class, "{27354127-7F64-5B0F-8F00-5D77AFBE261E}" );
  }

  /**
   * Microsoft IMAPIv2 PRNG based Stream (LCG: 0x19660D, 0x3C6EF35F)
   */
  public static imapi2.IStreamPseudoRandomBased createMsftStreamPrng001() {
    return COM4J.createInstance( imapi2.IStreamPseudoRandomBased.class, "{27354126-7F64-5B0F-8F00-5D77AFBE261E}" );
  }

  /**
   * Microsoft IMAPIv2 concatenation stream
   */
  public static imapi2.IStreamConcatenate createMsftStreamConcatenate() {
    return COM4J.createInstance( imapi2.IStreamConcatenate.class, "{27354125-7F64-5B0F-8F00-5D77AFBE261E}" );
  }

  /**
   * Microsoft IMAPIv2 interleave stream
   */
  public static imapi2.IStreamInterleave createMsftStreamInterleave() {
    return COM4J.createInstance( imapi2.IStreamInterleave.class, "{27354124-7F64-5B0F-8F00-5D77AFBE261E}" );
  }

  /**
   * Microsoft IMAPIv2 RAW CD Image Creator
   */
  public static imapi2.IRawCDImageCreator createMsftRawCDImageCreator() {
    return COM4J.createInstance( imapi2.IRawCDImageCreator.class, "{25983561-9D65-49CE-B335-40630D901227}" );
  }
}
