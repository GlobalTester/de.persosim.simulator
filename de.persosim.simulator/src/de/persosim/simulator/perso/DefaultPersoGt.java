package de.persosim.simulator.perso;

import de.persosim.simulator.cardobjects.MasterFile;
import de.persosim.simulator.cardobjects.TrustPointCardObject;
import de.persosim.simulator.cardobjects.TrustPointIdentifier;
import de.persosim.simulator.crypto.certificates.CardVerifiableCertificate;
import de.persosim.simulator.exception.AccessDeniedException;
import de.persosim.simulator.exception.CertificateNotParseableException;
import de.persosim.simulator.protocols.ta.TerminalType;
import de.persosim.simulator.tlv.ConstructedTlvDataObject;

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

	@Override
	public void setPersoDataContainer() {
		super.setPersoDataContainer();
		persoDataContainer.setEfCardAccess("3181C13012060A04007F0007020204020202010202010D300D060804007F00070202020201023012060A04007F00070202030202020102020129301C060904007F000702020302300C060704007F0007010202010D020129303E060804007F000702020831323012060A04007F0007020203020202010202012D301C060904007F000702020302300C060704007F0007010202010D02012D302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6C");
		persoDataContainer.setEfCardSecurity("308205CA06092A864886F70D010702A08205BB308205B7020103310F300D0609608648016503040201050030820188060804007F0007030201A082017A04820176318201723012060A04007F0007020204020202010202010D300D060804007F00070202020201023017060A04007F0007020205020330090201010201010101003019060904007F000702020502300C060704007F0007010202010D3017060A04007F0007020205020330090201010201020101FF3012060A04007F00070202030202020102020129301C060904007F000702020302300C060704007F0007010202010D0201293062060904007F0007020201023052300C060704007F0007010202010D0342000419D4B7447788B0E1993DB35500999627E739A4E5E35F02D8FB07D6122E76567F17758D7A3AA6943EF23E5E2909B3E8B31BFAA4544C2CBF1FB487F31FF239C8F8020129303E060804007F000702020831323012060A04007F0007020203020202010202012D301C060904007F000702020302300C060704007F0007010202010D02012D302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6CA08202EB308202E73082028DA003020102020601588C187EC1300A06082A8648CE3D0403023062310B300906035504061302444531253023060355040A0C1C736563756E6574205365637572697479204E6574776F726B7320414731173015060355040B0C0E436F756E747279205369676E65723113301106035504030C0A736563756E6574206373301E170D3136313132323132353234355A170D3137313131373132353234355A3063310B300906035504061302444531253023060355040A0C1C736563756E6574205365637572697479204E6574776F726B7320414731183016060355040B0C0F446F63756D656E74205369676E65723113301106035504030C0A736563756E6574206473308201333081EC06072A8648CE3D02013081E0020101302C06072A8648CE3D0101022100A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5377304404207D5A0975FC2C3057EEF67530417AFFE7FB8055C126DC5C6CE94A4B44F330B5D9042026DC5C6CE94A4B44F330B5D9BBD77CBF958416295CF7E1CE6BCCDC18FF8C07B60441048BD2AEB9CB7E57CB2C4B482FFC81B7AFB9DE27E1E3BD23C23A4453BD9ACE3262547EF835C3DAC4FD97F8461A14611DC9C27745132DED8E545C1D54C72F046997022100A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A7020101034200045F6411CA64ED6F59C42524A41AEE4BB21F152A3ADC63436CEE59F4460E46108F611DC9054054B8B4B650D0363875A9BC3939EB77705EB41826370CF22F71398EA3523050301F0603551D23041830168014C695AD08C6E77BEF48432B4B075ECAE66E4793E8301D0603551D0E041604146EB2EE2415E3C533CB846227345A52AA8820CCB8300E0603551D0F0101FF040403020780300A06082A8648CE3D0403020348003045022055C69EF8C986A7A18666B42CD08822C99AC55BDA73CDD3A653D0F3A24F7630C00221009C5B9E2587F3713F3844FB1391EF64CC4948779529B8F453EDB9898DF93B62D63182012430820120020101306C3062310B300906035504061302444531253023060355040A0C1C736563756E6574205365637572697479204E6574776F726B7320414731173015060355040B0C0E436F756E747279205369676E65723113301106035504030C0A736563756E6574206373020601588C187EC1300D06096086480165030402010500A04A301706092A864886F70D010903310A060804007F0007030201302F06092A864886F70D010904312204200AC859D6AB5A85B98050527C67E1D5B36EA3726F528A993313B7DFFE969E771D300A06082A8648CE3D0403020446304402206E234B547755E4B7E632BD68FD4BA06ABE2BAE86ABED660E6E1DA09ABD5A35480220594352AEFDE12F4E25F42006F0DDCD520CC83E24E05C57B07FCEE84D6BF84DEB");
		persoDataContainer.setEfChipSecurity("308207F706092A864886F70D010702A08207E8308207E4020103310F300D06096086480165030402010500308203B5060804007F0007030201A08203A7048203A33182039F3012060A04007F0007020204020202010202010D300D060804007F00070202020201023017060A04007F0007020205020330090201010201010101003019060904007F000702020502300C060704007F0007010202010D3017060A04007F0007020205020330090201010201020101FF3012060A04007F00070202030202020102020129301C060904007F000702020302300C060704007F0007010202010D0201293062060904007F0007020201023052300C060704007F0007010202010D0342000419D4B7447788B0E1993DB35500999627E739A4E5E35F02D8FB07D6122E76567F17758D7A3AA6943EF23E5E2909B3E8B31BFAA4544C2CBF1FB487F31FF239C8F80201293081A3060804007F00070202083181963012060A04007F0007020203020202010202012D301C060904007F000702020302300C060704007F0007010202010D02012D3062060904007F0007020201023052300C060704007F0007010202010D034200041AC6CAE884A6C2B8461404150F54CD1150B21E862A4E5F21CE34290C741104BD1BF31ED91E085D7C630E8B4D10A8AE22BBB2898B44B52EA0F4CDADCF57CFBA2502012D302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6C308201C3060804007F0007020207308201B5300B0609608648016503040204308201A43021020101041C2FF0247F59DD3C646E314F03ABB33EE91A586577EBDF48D3864EC34D3021020102041C37823963B71AF0BF5698D1FDC30DA2B7F9ECE57CFA4959BEE9D6D9943021020103041CA105E4EF19FEEC01DC64FBE1AECBEBC2A492DE78C89D439A8C301E853021020104041CAD81D20DBD4F5687FDB05E5037EC267609FDE28C6036FDBDF2C8B4333021020105041CA90F28EB7A0FA0DE83ABF3293D14E0838B9C85FC7277CBB97737A32B3021020106041C712B8550E49A13C64DCED4457E9A0F5A85DC26CD6A321596723005D63021020107041C42A8FA36B60887ED022CD3B6ECC255220FBE8CB3F607E416601FCAA63021020108041C6446E0A909967462B5C1117634F8A1B557EF74BE3F606C1E94EFAE433021020109041C635D1017F4ABC656B9FDDDD7E0FBB1E992B7686E89485E6AB51B638B302102010D041C04DB93544A64BC1245B10AAB266386F08F8E89F72E1DB178C172624D3021020111041CF0CBFF6A779EDF9D354EC73AF2297DA08389D5AE492F6F6B36C040143021020112041C57CE396CA707B96FA37C580F693230E4D4AEBB97293F0909489D95CBA08202EB308202E73082028DA003020102020601588C187EC1300A06082A8648CE3D0403023062310B300906035504061302444531253023060355040A0C1C736563756E6574205365637572697479204E6574776F726B7320414731173015060355040B0C0E436F756E747279205369676E65723113301106035504030C0A736563756E6574206373301E170D3136313132323132353234355A170D3137313131373132353234355A3063310B300906035504061302444531253023060355040A0C1C736563756E6574205365637572697479204E6574776F726B7320414731183016060355040B0C0F446F63756D656E74205369676E65723113301106035504030C0A736563756E6574206473308201333081EC06072A8648CE3D02013081E0020101302C06072A8648CE3D0101022100A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5377304404207D5A0975FC2C3057EEF67530417AFFE7FB8055C126DC5C6CE94A4B44F330B5D9042026DC5C6CE94A4B44F330B5D9BBD77CBF958416295CF7E1CE6BCCDC18FF8C07B60441048BD2AEB9CB7E57CB2C4B482FFC81B7AFB9DE27E1E3BD23C23A4453BD9ACE3262547EF835C3DAC4FD97F8461A14611DC9C27745132DED8E545C1D54C72F046997022100A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A7020101034200045F6411CA64ED6F59C42524A41AEE4BB21F152A3ADC63436CEE59F4460E46108F611DC9054054B8B4B650D0363875A9BC3939EB77705EB41826370CF22F71398EA3523050301F0603551D23041830168014C695AD08C6E77BEF48432B4B075ECAE66E4793E8301D0603551D0E041604146EB2EE2415E3C533CB846227345A52AA8820CCB8300E0603551D0F0101FF040403020780300A06082A8648CE3D0403020348003045022055C69EF8C986A7A18666B42CD08822C99AC55BDA73CDD3A653D0F3A24F7630C00221009C5B9E2587F3713F3844FB1391EF64CC4948779529B8F453EDB9898DF93B62D63182012430820120020101306C3062310B300906035504061302444531253023060355040A0C1C736563756E6574205365637572697479204E6574776F726B7320414731173015060355040B0C0E436F756E747279205369676E65723113301106035504030C0A736563756E6574206373020601588C187EC1300D06096086480165030402010500A04A301706092A864886F70D010903310A060804007F0007030201302F06092A864886F70D010904312204207A16F703A75B1EA18D2F7764742262092A7E7FDB25915DF24F50631CF3D74B8D300A06082A8648CE3D0403020446304402205CA9A7F70FF35CC15349043BDAF8F4FB490B78E32A261D3450125C587473CFE60220715EEF1BD6457400B852219F96776B8111FB0ED2EC7E81E7780B720C9A3C9ED8");
	}
	
	@Override
	protected void addTaTrustPoints(MasterFile mf) throws CertificateNotParseableException, AccessDeniedException {
		
		TrustPointCardObject trustPointIs = new TrustPointCardObject(new TrustPointIdentifier(TerminalType.IS),
				createRootCertIs());
		mf.addChild(trustPointIs);

		TrustPointCardObject trustPointAt = new TrustPointCardObject(new TrustPointIdentifier(TerminalType.AT),
				createRootCertAt());
		mf.addChild(trustPointAt);

		TrustPointCardObject trustPointSt = new TrustPointCardObject(new TrustPointIdentifier(TerminalType.ST),
				createRootCertSt());
		mf.addChild(trustPointSt);
	}

	protected CardVerifiableCertificate createRootCertIs() throws CertificateNotParseableException {
			return createCertificate("personalization/gtCertificates/CFG.DFLT.EAC.IS/CVCA_Cert_01.cvcert");
	}

	protected CardVerifiableCertificate createRootCertAt() throws CertificateNotParseableException {
			return createCertificate("personalization/gtCertificates/CFG.DFLT.EAC.AT/CVCA_Cert_01.cvcert");
	}

	protected CardVerifiableCertificate createRootCertSt() throws CertificateNotParseableException {
			return createCertificate("personalization/gtCertificates/CFG.DFLT.EAC.ST/CVCA_Cert_01.cvcert");
	}
	
	protected static CardVerifiableCertificate createCertificate(String certPath)
			throws CertificateNotParseableException {
				String id = "de.persosim.simulator";
		String absolutePath = PersonalizationFileHelper.getFileFromPseudoBundle(id, id, certPath).getAbsolutePath();

		byte[] certData = PersonalizationFileHelper.readFromFile(absolutePath);

		ConstructedTlvDataObject certTlv = new ConstructedTlvDataObject(certData);
		
		return new CardVerifiableCertificate(certTlv);
	}
}
