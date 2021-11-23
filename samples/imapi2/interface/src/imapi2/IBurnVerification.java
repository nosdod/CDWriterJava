package imapi2  ;

import com4j.*;

/**
 * An interface to control burn verification for a burning object
 */
@IID("{D2FFD834-958B-426D-8470-2A13879C6A91}")
public interface IBurnVerification extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The requested level of burn verification.
   * </p>
   * <p>
   * Setter method for the COM property "BurnVerificationLevel"
   * </p>
   * @param value Mandatory imapi2.IMAPI_BURN_VERIFICATION_LEVEL parameter.
   */

  @VTID(3)
  void setBurnVerificationLevel(
    imapi2.IMAPI_BURN_VERIFICATION_LEVEL value);


  /**
   * <p>
   * The requested level of burn verification.
   * </p>
   * <p>
   * Getter method for the COM property "BurnVerificationLevel"
   * </p>
   * @return  Returns a value of type imapi2.IMAPI_BURN_VERIFICATION_LEVEL
   */

  @VTID(4)
  imapi2.IMAPI_BURN_VERIFICATION_LEVEL getBurnVerificationLevel();


  // Properties:
}
