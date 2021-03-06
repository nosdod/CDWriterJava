package wmi  ;

import com4j.*;

/**
 * A connection to a Namespace
 */
@IID("{D2F68443-85DC-427E-91D8-366554CC754C}")
public interface ISWbemServicesEx extends wmi.ISWbemServices {
  // Methods:
  /**
   * <p>
   * Save the Object to this Namespace
   * </p>
   * @param objWbemObject Mandatory wmi.ISWbemObjectEx parameter.
   * @param iFlags Optional parameter. Default value is 0
   * @param objWbemNamedValueSet Optional parameter. Default value is unprintable.
   * @return  Returns a value of type wmi.ISWbemObjectPath
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(26)
  wmi.ISWbemObjectPath put(
    wmi.ISWbemObjectEx objWbemObject,
    @Optional @DefaultValue("0") int iFlags,
    @Optional @MarshalAs(NativeType.Dispatch) com4j.Com4jObject objWbemNamedValueSet);


  /**
   * <p>
   * Save the Object to this Namespace asynchronously
   * </p>
   * @param objWbemSink Mandatory wmi.ISWbemSink parameter.
   * @param objWbemObject Mandatory wmi.ISWbemObjectEx parameter.
   * @param iFlags Optional parameter. Default value is 0
   * @param objWbemNamedValueSet Optional parameter. Default value is unprintable.
   * @param objWbemAsyncContext Optional parameter. Default value is unprintable.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(27)
  void putAsync(
    wmi.ISWbemSink objWbemSink,
    wmi.ISWbemObjectEx objWbemObject,
    @Optional @DefaultValue("0") int iFlags,
    @Optional @MarshalAs(NativeType.Dispatch) com4j.Com4jObject objWbemNamedValueSet,
    @Optional @MarshalAs(NativeType.Dispatch) com4j.Com4jObject objWbemAsyncContext);


  // Properties:
}
