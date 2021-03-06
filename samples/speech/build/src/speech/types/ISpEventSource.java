package speech.types  ;

import com4j.*;

/**
 * ISpEventSource Interface
 */
@IID("{BE7A9CCE-5F9E-11D2-960F-00C04F8EE628}")
public interface ISpEventSource extends speech.types.ISpNotifySource {
  // Methods:
  /**
   * @param ullEventInterest Mandatory long parameter.
   * @param ullQueuedInterest Mandatory long parameter.
   */

  @VTID(10)
  void setInterest(
    long ullEventInterest,
    long ullQueuedInterest);


    // Properties:
  }
