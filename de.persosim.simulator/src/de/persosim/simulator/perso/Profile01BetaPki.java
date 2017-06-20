package de.persosim.simulator.perso;

import de.persosim.simulator.cardobjects.MasterFile;
import de.persosim.simulator.cardobjects.TrustPointCardObject;
import de.persosim.simulator.cardobjects.TrustPointIdentifier;
import de.persosim.simulator.crypto.certificates.CardVerifiableCertificate;
import de.persosim.simulator.exception.AccessDeniedException;
import de.persosim.simulator.exception.CertificateNotParseableException;
import de.persosim.simulator.protocols.ta.TerminalType;
import de.persosim.simulator.tlv.ConstructedTlvDataObject;
import de.persosim.simulator.utils.HexString;

public class Profile01BetaPki extends Profile01 {
	
	@Override
	protected void addTaTrustPoints(MasterFile mf) throws CertificateNotParseableException, AccessDeniedException {
		// certificates
		byte[] cvcaAtData = HexString
				.toByteArray("7F218201E27F4E82019A5F290100420E44454245544165494430303030327F4982011D060A04007F000702020202038120A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E537782207D5A0975FC2C3057EEF67530417AFFE7FB8055C126DC5C6CE94A4B44F330B5D9832026DC5C6CE94A4B44F330B5D9BBD77CBF958416295CF7E1CE6BCCDC18FF8C07B68441048BD2AEB9CB7E57CB2C4B482FFC81B7AFB9DE27E1E3BD23C23A4453BD9ACE3262547EF835C3DAC4FD97F8461A14611DC9C27745132DED8E545C1D54C72F0469978520A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A78641041D47DCFD87B269026623506F97213D8EA23CD9168E2225ED63F3F3CBD8BECEDBA3B0434F071C3629A0299930CB10D52ECB7C03C96C8A7934BE54EF5994AF244F8701015F200E44454245544165494430303030327F4C12060904007F0007030102025305FC0F13FFFF5F25060105000901075F2406010800090107652A7317060A04007F00070301020201530955555500000000FFFF730F060A04007F000703010202025301F35F3740619C7990898A8D8261596A4CF61982FA068D626C31D961433B5B546B1D2FA6AE078A35CC55594D7DA20788038FE0C9B843A2C97481DBAD15F42FF4E97CAD31EA");

		ConstructedTlvDataObject cvcaAtTlv = new ConstructedTlvDataObject(cvcaAtData);

		// TA trustpoints
		TrustPointCardObject trustPointAt = new TrustPointCardObject(new TrustPointIdentifier(TerminalType.AT),
				new CardVerifiableCertificate(cvcaAtTlv));
		mf.addChild(trustPointAt);
	}
	
	@Override
	public void setPersoDataContainer() {
		super.setPersoDataContainer();
		persoDataContainer.setEfCardAccess("3181C13012060A04007F0007020204020202010202010D300D060804007F00070202020201023012060A04007F00070202030202020102020129301C060904007F000702020302300C060704007F0007010202010D020129303E060804007F000702020831323012060A04007F0007020203020202010202012D301C060904007F000702020302300C060704007F0007010202010D02012D302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6C");
		persoDataContainer.setEfCardSecurity("3082078906092A864886F70D010702A082077A30820776020103310F300D0609608648016503040202050030820188060804007F0007030201A082017A04820176318201723012060A04007F0007020204020202010202010D300D060804007F00070202020201023017060A04007F0007020205020330090201010201010101003019060904007F000702020502300C060704007F0007010202010D3017060A04007F0007020205020330090201010201020101FF3012060A04007F00070202030202020102020129301C060904007F000702020302300C060704007F0007010202010D0201293062060904007F0007020201023052300C060704007F0007010202010D0342000419D4B7447788B0E1993DB35500999627E739A4E5E35F02D8FB07D6122E76567F17758D7A3AA6943EF23E5E2909B3E8B31BFAA4544C2CBF1FB487F31FF239C8F8020129303E060804007F000702020831323012060A04007F0007020203020202010202012D301C060904007F000702020302300C060704007F0007010202010D02012D302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6CA08204963082049230820419A003020102020113300A06082A8648CE3D040303304B310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369311F301D06035504030C16426574612D5465737420637363612D6765726D616E79301E170D3137303631393133323635305A170D3238303131393233353935395A3078310B300906035504061302444531253023060355040A0C1C736563756E6574205365637572697479204E6574776F726B73204147310B30090603550405130230313135303306035504030C2C424554412D5445535420446F63756D656E74205369676E6572204964656E7469747920446F63756D656E7473308201B53082014D06072A8648CE3D020130820140020101303C06072A8648CE3D01010231008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC53306404307BC382C63D8C150C3C72080ACE05AFA0C2BEA28E4FB22787139165EFBA91F90F8AA5814A503AD4EB04A8C7DD22CE2826043004A8C7DD22CE28268B39B55416F0447C2FB77DE107DCD2A62E880EA53EEB62D57CB4390295DBC9943AB78696FA504C110461041D1C64F068CF45FFA2A63A81B7C13F6B8847A3E77EF14FE3DB7FCAFE0CBD10E8E826E03436D646AAEF87B2E247D4AF1E8ABE1D7520F9C2A45CB1EB8E95CFD55262B70B29FEEC5864E19C054FF99129280E4646217791811142820341263C53150231008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B31F166E6CAC0425A7CF3AB6AF6B7FC3103B883202E9046565020101036200041D119D95788B0B612A1C00191E98A7F7561A3040B7D463A5072EDE7F19B8A25467E8E02A56260661CCD03C1F363660C025BBD1C919B7FF72FF8CF002D43781DAC15D250A984ED1A0C65E712B52140BA1B9F60E7B048CE719B712C8347DCD32C6A38201613082015D301F0603551D230418301680140505B94759D1B61AF2F17CAF0DF878D39D9987AB301D0603551D0E041604146B3A25D22A77D12B24043871A00A04897D041D5C300E0603551D0F0101FF040403020780302B0603551D1004243022800F32303137303631393133323635305A810F32303138303131393233353935395A30160603551D20040F300D300B060904007F00070301010130210603551D11041A301882066273692E6465A40E300C310A300806035504070C014430510603551D12044A30488118637363612D6765726D616E79406273692E62756E642E6465861C68747470733A2F2F7777772E6273692E62756E642E64652F63736361A40E300C310A300806035504070C01443019060767810801010602040E300C02010031071301411302494430350603551D1F042E302C302AA028A0268624687474703A2F2F7777772E6273692E62756E642E64652F626574615F637363615F63726C300A06082A8648CE3D04030303670030640230496ACA40F38933D7970249CBBC16771ABE0F9636B2A72699AEA83D191162D2FE1FBA2AE47892C1FEC14207F9FBAB0AC7023041EFDA4ACCCAB168912C160D4108702FE2994B8A2C198F3993C2BCD7CDE90EB3910B63FA14277CF9611273BC7811057331820138308201340201013050304B310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369311F301D06035504030C16426574612D5465737420637363612D6765726D616E79020113300D06096086480165030402020500A05A301706092A864886F70D010903310A060804007F0007030201303F06092A864886F70D01090431320430CE9B6528803584A477DC4976C0786B3081AFD8D8E3A4E870E5CB7546C8BFB4BEF88CBF8B6EB714AB37986E09D36CD7E8300A06082A8648CE3D040303046630640230211940F95DB9917E21CA47A9C824E140197B405B16901BCA6D77385522760B148789A5DA51E5AF3BFCB229ADD108EE05023026A5ED9824B8455001D37794FD4699A94AF48CC300767EE4D83DADB67EF2B91AFA3234CA6219DD3683F5EC888527990E");
		persoDataContainer.setEfChipSecurity("308209B606092A864886F70D010702A08209A7308209A3020103310F300D06096086480165030402020500308203B5060804007F0007030201A08203A7048203A33182039F3012060A04007F0007020204020202010202010D300D060804007F00070202020201023017060A04007F0007020205020330090201010201010101003019060904007F000702020502300C060704007F0007010202010D3017060A04007F0007020205020330090201010201020101FF3012060A04007F00070202030202020102020129301C060904007F000702020302300C060704007F0007010202010D0201293062060904007F0007020201023052300C060704007F0007010202010D0342000419D4B7447788B0E1993DB35500999627E739A4E5E35F02D8FB07D6122E76567F17758D7A3AA6943EF23E5E2909B3E8B31BFAA4544C2CBF1FB487F31FF239C8F80201293081A3060804007F00070202083181963012060A04007F0007020203020202010202012D301C060904007F000702020302300C060704007F0007010202010D02012D3062060904007F0007020201023052300C060704007F0007010202010D034200041AC6CAE884A6C2B8461404150F54CD1150B21E862A4E5F21CE34290C741104BD1BF31ED91E085D7C630E8B4D10A8AE22BBB2898B44B52EA0F4CDADCF57CFBA2502012D302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6C308201C3060804007F0007020207308201B5300B0609608648016503040204308201A43021020101041C2FF0247F59DD3C646E314F03ABB33EE91A586577EBDF48D3864EC34D3021020102041C37823963B71AF0BF5698D1FDC30DA2B7F9ECE57CFA4959BEE9D6D9943021020103041CA105E4EF19FEEC01DC64FBE1AECBEBC2A492DE78C89D439A8C301E853021020104041CAD81D20DBD4F5687FDB05E5037EC267609FDE28C6036FDBDF2C8B4333021020105041CA90F28EB7A0FA0DE83ABF3293D14E0838B9C85FC7277CBB97737A32B3021020106041C712B8550E49A13C64DCED4457E9A0F5A85DC26CD6A321596723005D63021020107041C42A8FA36B60887ED022CD3B6ECC255220FBE8CB3F607E416601FCAA63021020108041C6446E0A909967462B5C1117634F8A1B557EF74BE3F606C1E94EFAE433021020109041C635D1017F4ABC656B9FDDDD7E0FBB1E992B7686E89485E6AB51B638B302102010D041C04DB93544A64BC1245B10AAB266386F08F8E89F72E1DB178C172624D3021020111041CF0CBFF6A779EDF9D354EC73AF2297DA08389D5AE492F6F6B36C040143021020112041C57CE396CA707B96FA37C580F693230E4D4AEBB97293F0909489D95CBA08204963082049230820419A003020102020113300A06082A8648CE3D040303304B310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369311F301D06035504030C16426574612D5465737420637363612D6765726D616E79301E170D3137303631393133323635305A170D3238303131393233353935395A3078310B300906035504061302444531253023060355040A0C1C736563756E6574205365637572697479204E6574776F726B73204147310B30090603550405130230313135303306035504030C2C424554412D5445535420446F63756D656E74205369676E6572204964656E7469747920446F63756D656E7473308201B53082014D06072A8648CE3D020130820140020101303C06072A8648CE3D01010231008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC53306404307BC382C63D8C150C3C72080ACE05AFA0C2BEA28E4FB22787139165EFBA91F90F8AA5814A503AD4EB04A8C7DD22CE2826043004A8C7DD22CE28268B39B55416F0447C2FB77DE107DCD2A62E880EA53EEB62D57CB4390295DBC9943AB78696FA504C110461041D1C64F068CF45FFA2A63A81B7C13F6B8847A3E77EF14FE3DB7FCAFE0CBD10E8E826E03436D646AAEF87B2E247D4AF1E8ABE1D7520F9C2A45CB1EB8E95CFD55262B70B29FEEC5864E19C054FF99129280E4646217791811142820341263C53150231008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B31F166E6CAC0425A7CF3AB6AF6B7FC3103B883202E9046565020101036200041D119D95788B0B612A1C00191E98A7F7561A3040B7D463A5072EDE7F19B8A25467E8E02A56260661CCD03C1F363660C025BBD1C919B7FF72FF8CF002D43781DAC15D250A984ED1A0C65E712B52140BA1B9F60E7B048CE719B712C8347DCD32C6A38201613082015D301F0603551D230418301680140505B94759D1B61AF2F17CAF0DF878D39D9987AB301D0603551D0E041604146B3A25D22A77D12B24043871A00A04897D041D5C300E0603551D0F0101FF040403020780302B0603551D1004243022800F32303137303631393133323635305A810F32303138303131393233353935395A30160603551D20040F300D300B060904007F00070301010130210603551D11041A301882066273692E6465A40E300C310A300806035504070C014430510603551D12044A30488118637363612D6765726D616E79406273692E62756E642E6465861C68747470733A2F2F7777772E6273692E62756E642E64652F63736361A40E300C310A300806035504070C01443019060767810801010602040E300C02010031071301411302494430350603551D1F042E302C302AA028A0268624687474703A2F2F7777772E6273692E62756E642E64652F626574615F637363615F63726C300A06082A8648CE3D04030303670030640230496ACA40F38933D7970249CBBC16771ABE0F9636B2A72699AEA83D191162D2FE1FBA2AE47892C1FEC14207F9FBAB0AC7023041EFDA4ACCCAB168912C160D4108702FE2994B8A2C198F3993C2BCD7CDE90EB3910B63FA14277CF9611273BC7811057331820138308201340201013050304B310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369311F301D06035504030C16426574612D5465737420637363612D6765726D616E79020113300D06096086480165030402020500A05A301706092A864886F70D010903310A060804007F0007030201303F06092A864886F70D01090431320430255259DAACA9C9F45E9609E545960263D4E7B2942115E4E2DFCF1D4C0E9FC51C9C1B53327404ED97605A1F25D14F5DA5300A06082A8648CE3D040303046630640230798E93527B9AF7AF9FBF2888F44D9EC6BC9BE0E28CB328F4759CADF1225659F703578742BD51B5BB59FB927B1EF7C60C0230430158F601F7C48F52B0BD31DBFE978783EE7B3F7C726A83C9D93387FE453C83085FADAA16137338AA73197930FA0A7F");
	}

}