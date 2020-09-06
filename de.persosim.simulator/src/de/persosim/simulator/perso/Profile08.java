package de.persosim.simulator.perso;

import de.persosim.simulator.cardobjects.DedicatedFile;
import de.persosim.simulator.crypto.CryptoUtil;
import de.persosim.simulator.utils.HexString;

/**
 * @author slutters
 *
 */
public class Profile08 extends AbstractProfile {
	
	@Override
	public void setPersoDataContainer() {
		persoDataContainer = PersonalizationDataContainer.getDefaultContainer();
		persoDataContainer.setDg4PlainData("KARL");
		persoDataContainer.setDg5PlainData("HILLEBRANDT");
		persoDataContainer.setDg6PlainData("GRAF V. LÝSKY");
		persoDataContainer.setDg7PlainData("DR.HC.");
		persoDataContainer.setDg8PlainData("19520617");
		persoDataContainer.setDg9PlainData("TRIER");
		persoDataContainer.setDg10PlainData("");
		persoDataContainer.setDg18PlainData("");
		persoDataContainer.setEfCardAccess("3181C13012060A04007F0007020204020202010202010D300D060804007F00070202020201023012060A04007F00070202030202020102020129301C060904007F000702020302300C060704007F0007010202010D020129303E060804007F000702020831323012060A04007F0007020203020202010202012D301C060904007F000702020302300C060704007F0007010202010D02012D302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6C");
		persoDataContainer.setEfCardSecurity("308209B006092A864886F70D010702A08209A13082099D020103310F300D060960864801650304020305003082039A060804007F0007030201A082038C04820388318203843012060A04007F0007020204020202010202010D300D060804007F00070202020201023017060A04007F0007020205020330090201010201010101003021060904007F000702020502301406072A8648CE3D020106092B24030302080101073017060A04007F0007020205020330090201010201020101FF3012060A04007F00070202030202020102020129301C060904007F000702020302300C060704007F0007010202010D0201293062060904007F0007020201023052300C060704007F0007010202010D0342000467DBFBD14C3291267FEFF537062570B96BE2274D7747D734BBDB5BFEAAD0976C3E47B929F42B1FCD583F80FB469225E29FE00AC6C95C24E956CB8E7031C19AC20201293081A3060804007F00070202083181963012060A04007F0007020203020202010202012D301C060904007F000702020302300C060704007F0007010202010D02012D3062060904007F0007020201023052300C060704007F0007010202010D0342000482ED7BDBBC67FF81507630E88819F3B001E47592D8B686D4C057FB8B75110D2E753F56C2F188337D1BCCA74CD12D7186E1AAD6D8A560DC90D56590BC373E558702012D302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6C308201A0060804007F000702020730820192300B0609608648016503040204308201813021020101041C2FF0247F59DD3C646E314F03ABB33EE91A586577EBDF48D3864EC34D3021020102041C37823963B71AF0BF5698D1FDC30DA2B7F9ECE57CFA4959BEE9D6D9943021020103041CE8B2A171DC1290A765F124AAFE33061C08C918A1069DFF5CAF4C62B53021020104041CBE76F4E545E2331C639A45F5A867DAA976C1D44046A6FABD21495B363021020105041C5E443C929B0720E64FB490290DADB57BA4419D1A7EDC2C719F1298A73021020106041CEF3303FCF83678AF2771D57E66A63C7FC2723E4293461921062B71633021020107041C874C679DFB7A537F54111CF727B2E167CDD2721AAFA2BFC37B7C3E0A3021020108041CFCDE79AE6A9F8817CF12CB46BE8ADD5C664C7EBF9049FC075C150D563021020109041C3D0CD1DF88C19785125B44C4CC93E89339B88826E87A04DCF4B9F7633021020111041C5136C1CF924686749AA0358EF331DFD00D3C24AD574C505CB41EE6983021020112041CB2A04D6EE2B222FF387237247E648912ADD8E731CE2E128029C5F6C0A082049F3082049B308203FEA003020102020204D5300A06082A8648CE3D0403043046310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369311A301806035504030C115445535420637363612D6765726D616E79301E170D3230303132313036333630345A170D3330303832313233353935395A305C310B3009060355040613024445310C300A060355040A0C03425349310D300B06035504051304303039393130302E06035504030C275445535420446F63756D656E74205369676E6572204964656E7469747920446F63756D656E7473308201B53082014D06072A8648CE3D020130820140020101303C06072A8648CE3D01010231008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC53306404307BC382C63D8C150C3C72080ACE05AFA0C2BEA28E4FB22787139165EFBA91F90F8AA5814A503AD4EB04A8C7DD22CE2826043004A8C7DD22CE28268B39B55416F0447C2FB77DE107DCD2A62E880EA53EEB62D57CB4390295DBC9943AB78696FA504C110461041D1C64F068CF45FFA2A63A81B7C13F6B8847A3E77EF14FE3DB7FCAFE0CBD10E8E826E03436D646AAEF87B2E247D4AF1E8ABE1D7520F9C2A45CB1EB8E95CFD55262B70B29FEEC5864E19C054FF99129280E4646217791811142820341263C53150231008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B31F166E6CAC0425A7CF3AB6AF6B7FC3103B883202E90465650201010362000401B434B9555974F51934687C520DAE338032F5046999E1595D85B89A4CBDB90888B8DCAB2D6588CF73E8E43DB78AB40A0FDB710D971F1C0205B9243E1F769A9E0681C01D1B298C4D7DE7F3F7E6CE9F16657907B79328BEC8166F5FC035E26EE3A382016630820162301F0603551D23041830168014539DB1872AAC9193D76392EE80D9E5996CF99B3B301D0603551D0E0416041472571E58FC52EAD9641412875C615E8090508CFA300E0603551D0F0101FF040403020780302B0603551D1004243022800F32303230303132313036333630345A810F32303230303832313233353935395A30160603551D20040F300D300B060904007F00070301010130260603551D11041F301D820B6273692E62756E642E6465A40E300C310A300806035504070C014430510603551D12044A30488118637363612D6765726D616E79406273692E62756E642E6465861C68747470733A2F2F7777772E6273692E62756E642E64652F63736361A40E300C310A300806035504070C01443019060767810801010602040E300C02010031071301411302494430350603551D1F042E302C302AA028A0268624687474703A2F2F7777772E6273692E62756E642E64652F746573745F637363615F63726C300A06082A8648CE3D04030403818A00308186024100A348C5E7948535C9ECB5043D62FA1F56F16886AF76C434C870D988D345175FD51E60A89C0E9D06A94D35078853397D7C8403E32053DF6BDFC16CC1B3A5E7D1CB0241008506DC6ACA4F202B4BDF7957263010886D38D4991D101374F6A7B8F4BC1CE51CB278E9F8851951F6AF0ABA7D4773F42762FD8F840A01F2D526CC80682DCA08103182014430820140020101304C3046310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369311A301806035504030C115445535420637363612D6765726D616E79020204D5300D06096086480165030402030500A06A301706092A864886F70D010903310A060804007F0007030201304F06092A864886F70D010904314204404443B91E6415DA5591BF3B5FFB708DC9A8C46B89D7E5FA61748ACFD28366D64A90A8D6FE92C19AE4FFB92274CD6430955A2CD242BFA884B46A7B7773C9386028300A06082A8648CE3D04030404663064023005BA26DEB36BA1D991DC03F805F4A82EA9106CAEFCA422B43CB4DF32E2D34345E7DD5B51941DD4BC4C6F337ACF98E84102305D113E7DAB0A8D4F06A5830B978B38D405FAEBFBFC47BD03C1D0F63AA1A369F3699630FDC16447ECBA54AC75665EA5D4");
		persoDataContainer.setEfChipSecurity("308207A606092A864886F70D010702A082079730820793020103310F300D0609608648016503040203050030820190060804007F0007030201A08201820482017E3182017A3012060A04007F0007020204020202010202010D300D060804007F00070202020201023017060A04007F0007020205020330090201010201010101003021060904007F000702020502301406072A8648CE3D020106092B24030302080101073017060A04007F0007020205020330090201010201020101FF3012060A04007F00070202030202020102020129301C060904007F000702020302300C060704007F0007010202010D0201293062060904007F0007020201023052300C060704007F0007010202010D0342000467DBFBD14C3291267FEFF537062570B96BE2274D7747D734BBDB5BFEAAD0976C3E47B929F42B1FCD583F80FB469225E29FE00AC6C95C24E956CB8E7031C19AC2020129303E060804007F000702020831323012060A04007F0007020203020202010202012D301C060904007F000702020302300C060704007F0007010202010D02012D302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6CA082049F3082049B308203FEA003020102020204D5300A06082A8648CE3D0403043046310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369311A301806035504030C115445535420637363612D6765726D616E79301E170D3230303132313036333630345A170D3330303832313233353935395A305C310B3009060355040613024445310C300A060355040A0C03425349310D300B06035504051304303039393130302E06035504030C275445535420446F63756D656E74205369676E6572204964656E7469747920446F63756D656E7473308201B53082014D06072A8648CE3D020130820140020101303C06072A8648CE3D01010231008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC53306404307BC382C63D8C150C3C72080ACE05AFA0C2BEA28E4FB22787139165EFBA91F90F8AA5814A503AD4EB04A8C7DD22CE2826043004A8C7DD22CE28268B39B55416F0447C2FB77DE107DCD2A62E880EA53EEB62D57CB4390295DBC9943AB78696FA504C110461041D1C64F068CF45FFA2A63A81B7C13F6B8847A3E77EF14FE3DB7FCAFE0CBD10E8E826E03436D646AAEF87B2E247D4AF1E8ABE1D7520F9C2A45CB1EB8E95CFD55262B70B29FEEC5864E19C054FF99129280E4646217791811142820341263C53150231008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B31F166E6CAC0425A7CF3AB6AF6B7FC3103B883202E90465650201010362000401B434B9555974F51934687C520DAE338032F5046999E1595D85B89A4CBDB90888B8DCAB2D6588CF73E8E43DB78AB40A0FDB710D971F1C0205B9243E1F769A9E0681C01D1B298C4D7DE7F3F7E6CE9F16657907B79328BEC8166F5FC035E26EE3A382016630820162301F0603551D23041830168014539DB1872AAC9193D76392EE80D9E5996CF99B3B301D0603551D0E0416041472571E58FC52EAD9641412875C615E8090508CFA300E0603551D0F0101FF040403020780302B0603551D1004243022800F32303230303132313036333630345A810F32303230303832313233353935395A30160603551D20040F300D300B060904007F00070301010130260603551D11041F301D820B6273692E62756E642E6465A40E300C310A300806035504070C014430510603551D12044A30488118637363612D6765726D616E79406273692E62756E642E6465861C68747470733A2F2F7777772E6273692E62756E642E64652F63736361A40E300C310A300806035504070C01443019060767810801010602040E300C02010031071301411302494430350603551D1F042E302C302AA028A0268624687474703A2F2F7777772E6273692E62756E642E64652F746573745F637363615F63726C300A06082A8648CE3D04030403818A00308186024100A348C5E7948535C9ECB5043D62FA1F56F16886AF76C434C870D988D345175FD51E60A89C0E9D06A94D35078853397D7C8403E32053DF6BDFC16CC1B3A5E7D1CB0241008506DC6ACA4F202B4BDF7957263010886D38D4991D101374F6A7B8F4BC1CE51CB278E9F8851951F6AF0ABA7D4773F42762FD8F840A01F2D526CC80682DCA08103182014430820140020101304C3046310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369311A301806035504030C115445535420637363612D6765726D616E79020204D5300D06096086480165030402030500A06A301706092A864886F70D010903310A060804007F0007030201304F06092A864886F70D010904314204409837C1589A1AB9D1AEFC18C10EF469545051CBD4484B047E6786E763F3DE2193C9EEDACFB2FFF3488D85823643D99272FABECF129940E383B2E6505B27CC27A9300A06082A8648CE3D04030404663064023041080D1BDABD970B4B7BC296FAC670E77F4801674A4B1947D4EFED492C93704387BA331E958B65887C46ED7C8A0460FB023038C0862E68F80741E720CE9DCADB6A7A7B8949BD88A58A3F6B82994D857299BB8EDDB290A739C16F593819ACEACE89E2");
		
		String documentNumber = "000000008";
		String sex = "M";
		String mrzLine3 = "GRAF<VON<LYSKY<<KARL<<<<<<<<<<";
		String mrz = persoDataContainer.createMrzFromDgs(documentNumber, sex, mrzLine3);
		
		persoDataContainer.setMrz(mrz);
		persoDataContainer.setEpassDg1PlainData(mrz);
		
		// unprivileged CA key
		persoDataContainer.addCaKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("0467DBFBD14C3291267FEFF537062570B96BE2274D7747D734BBDB5BFEAAD0976C3E47B929F42B1FCD583F80FB469225E29FE00AC6C95C24E956CB8E7031C19AC2"),
				HexString.toByteArray("8910074CF4749A916E5864654C768D57F57B6361F70A226DD1AEBED390BB066D")),
				41, false);
		
		// privileged CA key
		persoDataContainer.addCaKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("0482ED7BDBBC67FF81507630E88819F3B001E47592D8B686D4C057FB8B75110D2E753F56C2F188337D1BCCA74CD12D7186E1AAD6D8A560DC90D56590BC373E5587"),
				HexString.toByteArray("40055E46C67A76B7BF1A3026400D8C2D9BB243B883E0D150B517120A7651480C")),
				45, true);

		// individual RI key - 1st sector public/private key pair (Sperrmerkmal)
		persoDataContainer.addRiKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("041B87C8A8436BCFB5DB39678DA5EBF5AB3F1968064FB8B4DD67F338CC6C0D16D27959A43AD6378856B5C9D447E5DFAC4E98294DE9F5CA38DFD260E46F7273AF9F"),
				HexString.toByteArray("3C8150363A6BE522C86986852F0A1AACD174D61A26B161F773DFFCE587026CE3")),
				1, false);

		// individual RI key - 2nd sector public/private key pair (Pseudonym)
		persoDataContainer.addRiKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("0436BF5B162B709DA4BF7F3FFB2093E387388F3708AA637B7C3F02D6B4696594DC55B29CDD28412505EBA4E1172A7F8E3143FB8D86CC30403414ADED6A156A9EE8"),
				HexString.toByteArray("0098EE73D823E4D787DF7928E29C7AAC52C79A51D0538A4E2314D7343E996A3E6A")),
				2, true);
	}
		
	@Override
	protected void addEidDg13(DedicatedFile eIdAppl) {
		// do not create DG
	}
	
}
