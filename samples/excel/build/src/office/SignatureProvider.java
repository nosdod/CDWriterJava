package office  ;

import com4j.*;

@IID("{000CD6A3-0000-0000-C000-000000000046}")
public interface SignatureProvider extends Com4jObject {
  // Methods:
  /**
   * @param siglnimg Mandatory office.SignatureLineImage parameter.
   * @param psigsetup Mandatory office.SignatureSetup parameter.
   * @param psiginfo Mandatory office.SignatureInfo parameter.
   * @param xmlDsigStream Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  Holder<com4j.stdole.IPictureDisp> generateSignatureLineImage(
    office.SignatureLineImage siglnimg,
    office.SignatureSetup psigsetup,
    office.SignatureInfo psiginfo,
    com4j.Com4jObject xmlDsigStream);


  /**
   * @param parentWindow Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory office.SignatureSetup parameter.
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  void showSignatureSetup(
    com4j.Com4jObject parentWindow,
    office.SignatureSetup psigsetup);


  /**
   * @param parentWindow Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory office.SignatureSetup parameter.
   * @param psiginfo Mandatory office.SignatureInfo parameter.
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  void showSigningCeremony(
    com4j.Com4jObject parentWindow,
    office.SignatureSetup psigsetup,
    office.SignatureInfo psiginfo);


  /**
   * @param queryContinue Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory office.SignatureSetup parameter.
   * @param psiginfo Mandatory office.SignatureInfo parameter.
   * @param xmlDsigStream Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  void signXmlDsig(
    com4j.Com4jObject queryContinue,
    office.SignatureSetup psigsetup,
    office.SignatureInfo psiginfo,
    com4j.Com4jObject xmlDsigStream);


  /**
   * @param parentWindow Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory office.SignatureSetup parameter.
   * @param psiginfo Mandatory office.SignatureInfo parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void notifySignatureAdded(
    com4j.Com4jObject parentWindow,
    office.SignatureSetup psigsetup,
    office.SignatureInfo psiginfo);


  /**
   * @param queryContinue Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory office.SignatureSetup parameter.
   * @param psiginfo Mandatory office.SignatureInfo parameter.
   * @param xmlDsigStream Mandatory com4j.Com4jObject parameter.
   * @param pcontverres Mandatory Holder<office.ContentVerificationResults> parameter.
   * @param pcertverres Mandatory Holder<office.CertificateVerificationResults> parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  void verifyXmlDsig(
    com4j.Com4jObject queryContinue,
    office.SignatureSetup psigsetup,
    office.SignatureInfo psiginfo,
    com4j.Com4jObject xmlDsigStream,
    Holder<office.ContentVerificationResults> pcontverres,
    Holder<office.CertificateVerificationResults> pcertverres);


  /**
   * @param parentWindow Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory office.SignatureSetup parameter.
   * @param psiginfo Mandatory office.SignatureInfo parameter.
   * @param xmlDsigStream Mandatory com4j.Com4jObject parameter.
   * @param pcontverres Mandatory Holder<office.ContentVerificationResults> parameter.
   * @param pcertverres Mandatory Holder<office.CertificateVerificationResults> parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  void showSignatureDetails(
    com4j.Com4jObject parentWindow,
    office.SignatureSetup psigsetup,
    office.SignatureInfo psiginfo,
    com4j.Com4jObject xmlDsigStream,
    Holder<office.ContentVerificationResults> pcontverres,
    Holder<office.CertificateVerificationResults> pcertverres);


  /**
   * @param sigprovdet Mandatory office.SignatureProviderDetail parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getProviderDetail(
    office.SignatureProviderDetail sigprovdet);


  /**
   * @param queryContinue Mandatory com4j.Com4jObject parameter.
   * @param stream Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type byte[]
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  byte[] hashStream(
    com4j.Com4jObject queryContinue,
    com4j.Com4jObject stream);


  // Properties:
}
