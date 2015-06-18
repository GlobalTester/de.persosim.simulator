package de.persosim.simulator.perso;

import de.persosim.simulator.cardobjects.TrustPointCardObject;
import de.persosim.simulator.cardobjects.TrustPointIdentifier;
import de.persosim.simulator.crypto.certificates.CardVerifiableCertificate;
import de.persosim.simulator.exception.AccessDeniedException;
import de.persosim.simulator.exception.CertificateNotParseableException;
import de.persosim.simulator.protocols.ta.TerminalType;
import de.persosim.simulator.tlv.ConstructedTlvDataObject;
import de.persosim.simulator.tlv.TlvConstants;
import de.persosim.simulator.tlv.TlvDataObject;
import de.persosim.simulator.tlv.TlvDataObjectContainer;
import de.persosim.simulator.utils.HexString;

/**
 * Standard personalization with same defaults used within the test PKI but with
 * trustpoints based on keys provided.
 * <p/>
 * This personalization is intended to be as close to the currently available
 * nPA as possible. During development the closest already supported
 * configuration is used.
 * 
 * @author amay
 * 
 */
public class DefaultPersoGt extends Profile01 {

	public DefaultPersoGt() throws AccessDeniedException {
		super();
	}

	@Override
	protected void addTaTrustPoints() throws CertificateNotParseableException {
		// certificates
		byte[] cvcaIsData = HexString
				.toByteArray("7F218201B07F4E8201685F290100420D444549534356434130303030317F4982011D060A04007F000702020202038120A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E537782207D5A0975FC2C3057EEF67530417AFFE7FB8055C126DC5C6CE94A4B44F330B5D9832026DC5C6CE94A4B44F330B5D9BBD77CBF958416295CF7E1CE6BCCDC18FF8C07B68441048BD2AEB9CB7E57CB2C4B482FFC81B7AFB9DE27E1E3BD23C23A4453BD9ACE3262547EF835C3DAC4FD97F8461A14611DC9C27745132DED8E545C1D54C72F0469978520A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A78641045889BF5306189ABB7FA3AD0E922443F9C60162E8215053B72812663E5D798EE05097C4DFAC7470701A5B644AAEAFE1E50BA1D0ED5769151EC476C154BB4A56848701015F200D444549534356434130303030317F4C0E060904007F0007030102015301E35F25060104000500055F24060105000500055F37400A589134205376E20EFF49E108560F1CB47C7D221E96E51FF3C6F4EAF1F6CCC000A5E34ED8E3F6E05253DA09B0D68FF5DFB5BD586782B987453C655FBEE8EC59");
		byte[] cvcaAtData = HexString
				.toByteArray("7F218201B47F4E82016C5F290100420D444541544356434130303030317F4982011D060A04007F000702020202038120A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E537782207D5A0975FC2C3057EEF67530417AFFE7FB8055C126DC5C6CE94A4B44F330B5D9832026DC5C6CE94A4B44F330B5D9BBD77CBF958416295CF7E1CE6BCCDC18FF8C07B68441048BD2AEB9CB7E57CB2C4B482FFC81B7AFB9DE27E1E3BD23C23A4453BD9ACE3262547EF835C3DAC4FD97F8461A14611DC9C27745132DED8E545C1D54C72F0469978520A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A78641048F96F5F09FA2A07893AAE77405F1D7E229D3C403AB6008AD1CA4C5608C92C99C666609606E48043203B5B05584D280B6975486BD3179F26495F07490912655918701015F200D444541544356434130303030317F4C12060904007F0007030102025305FE1FFFFFFF5F25060104000500055F24060105000500055F37401FA423E03BA18714E98272477C86B77EFF4716DB490B427C34B212876CE063EA95CEF3BB6F8059A506B9DC194638278DDB81AE25E0592C43B9995B460486FE17");
		byte[] cvcaStData = HexString
				.toByteArray("7F218201B07F4E8201685F290100420D444553544356434130303030317F4982011D060A04007F000702020202038120A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E537782207D5A0975FC2C3057EEF67530417AFFE7FB8055C126DC5C6CE94A4B44F330B5D9832026DC5C6CE94A4B44F330B5D9BBD77CBF958416295CF7E1CE6BCCDC18FF8C07B68441048BD2AEB9CB7E57CB2C4B482FFC81B7AFB9DE27E1E3BD23C23A4453BD9ACE3262547EF835C3DAC4FD97F8461A14611DC9C27745132DED8E545C1D54C72F0469978520A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A786410405AB6A1DDF4C611C1BB363A0BBC0E307EC1C03EA90CF4B7A51DC6798119D75173670D740FABA4E497EBBB01A20EA14D5A423FE7A43FB954A4A0173F2380364788701015F200D444553544356434130303030317F4C0E060904007F0007030102035301C35F25060104000500055F24060105000500055F37408C7551945DCF5B1BD8588859EACA6710B1CB690CEB28C3169F03B6CA76C75CF5A7FEA6DD16A60FCEFD1EB29A91C4471D6DC4161ECBFAE7ED4D1447C286A77F70");

		TlvDataObject cvcaIsTlv = ((ConstructedTlvDataObject) new TlvDataObjectContainer(
				cvcaIsData).getTlvDataObject(TlvConstants.TAG_7F21))
				.getTlvDataObject(TlvConstants.TAG_7F4E);
		TlvDataObject cvcaAtTlv = ((ConstructedTlvDataObject) new TlvDataObjectContainer(
				cvcaAtData).getTlvDataObject(TlvConstants.TAG_7F21))
				.getTlvDataObject(TlvConstants.TAG_7F4E);
		TlvDataObject cvcaStTlv = ((ConstructedTlvDataObject) new TlvDataObjectContainer(
				cvcaStData).getTlvDataObject(TlvConstants.TAG_7F21))
				.getTlvDataObject(TlvConstants.TAG_7F4E);

		// TA trustpoints
		TrustPointCardObject trustPointIs = new TrustPointCardObject(
				new TrustPointIdentifier(TerminalType.IS),
				new CardVerifiableCertificate(
						(ConstructedTlvDataObject) cvcaIsTlv));
		mf.addChild(trustPointIs);

		TrustPointCardObject trustPointAt = new TrustPointCardObject(
				new TrustPointIdentifier(TerminalType.AT),
				new CardVerifiableCertificate(
						(ConstructedTlvDataObject) cvcaAtTlv));
		mf.addChild(trustPointAt);

		TrustPointCardObject trustPointSt = new TrustPointCardObject(
				new TrustPointIdentifier(TerminalType.ST),
				new CardVerifiableCertificate(
						(ConstructedTlvDataObject) cvcaStTlv));
		mf.addChild(trustPointSt);
	}
}
