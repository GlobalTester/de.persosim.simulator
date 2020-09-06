package de.persosim.simulator.perso;

import de.persosim.simulator.cardobjects.DedicatedFile;
import de.persosim.simulator.crypto.CryptoUtil;
import de.persosim.simulator.utils.HexString;

/**
 * @author slutters
 *
 */
public class Profile05 extends AbstractProfile {
	
	@Override
	public void setPersoDataContainer() {
		persoDataContainer = PersonalizationDataContainer.getDefaultContainer();
		persoDataContainer.setDg4PlainData("AĞÇA");
		persoDataContainer.setDg5PlainData("ÖZM̂EN");
		persoDataContainer.setDg8PlainData("1989    ");
		persoDataContainer.setDg9PlainData("DESSAU-ROẞLAU");
		persoDataContainer.setDg10PlainData("");
		persoDataContainer.setDg17StreetPlainData("GROẞENHAINER STR. 133/135");
		persoDataContainer.setDg17CityPlainData("DRESDEN");
		persoDataContainer.setDg17CountryPlainData("D");
		persoDataContainer.setDg17ZipPlainData("01129");
		persoDataContainer.setDg18PlainData("02761406120000");
		persoDataContainer.setEfCardAccess("3181C13012060A04007F0007020204020202010202010D300D060804007F00070202020201023012060A04007F00070202030202020102020129301C060904007F000702020302300C060704007F0007010202010D020129303E060804007F000702020831323012060A04007F0007020203020202010202012D301C060904007F000702020302300C060704007F0007010202010D02012D302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6C");
		persoDataContainer.setEfCardSecurity("308209B006092A864886F70D010702A08209A13082099D020103310F300D060960864801650304020305003082039A060804007F0007030201A082038C04820388318203843012060A04007F0007020204020202010202010D300D060804007F00070202020201023017060A04007F0007020205020330090201010201010101003021060904007F000702020502301406072A8648CE3D020106092B24030302080101073017060A04007F0007020205020330090201010201020101FF3012060A04007F00070202030202020102020129301C060904007F000702020302300C060704007F0007010202010D0201293062060904007F0007020201023052300C060704007F0007010202010D0342000419D4B7447788B0E1993DB35500999627E739A4E5E35F02D8FB07D6122E76567F17758D7A3AA6943EF23E5E2909B3E8B31BFAA4544C2CBF1FB487F31FF239C8F80201293081A3060804007F00070202083181963012060A04007F0007020203020202010202012D301C060904007F000702020302300C060704007F0007010202010D02012D3062060904007F0007020201023052300C060704007F0007010202010D0342000458597F17D0CBA7D87367C74A2CEC20BDE2C3A48691CA46E9251F32714FF6C797837E409E64E32DB4F300103E2213BB7DFC272BF145BF3288179F853DF58B5EFF02012D302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6C308201A0060804007F000702020730820192300B0609608648016503040204308201813021020101041C2FF0247F59DD3C646E314F03ABB33EE91A586577EBDF48D3864EC34D3021020102041C37823963B71AF0BF5698D1FDC30DA2B7F9ECE57CFA4959BEE9D6D9943021020103041CE8B2A171DC1290A765F124AAFE33061C08C918A1069DFF5CAF4C62B53021020104041CE4B784862991DCF6E1EE9960322B7E7443ABE9DE829F3CA1376DB2FA3021020105041C70A01A0EF1E8F6184ECE91481AB8F020C4AA54BAF75AD3BD83D14E303021020106041C712B8550E49A13C64DCED4457E9A0F5A85DC26CD6A321596723005D63021020107041C42A8FA36B60887ED022CD3B6ECC255220FBE8CB3F607E416601FCAA63021020108041C3AF467653B535348AC6046B5E12E47D8D2A908D5713432EFAC566E243021020109041C4A57751D1BA58A775EAFF286C51BCCDD9496E2A061CB4BDC93C44F243021020111041C0873BDAACEE8EC93C189F9B6395AA86A81B888E8ED3C23E5E27DC8303021020112041C4D1A2D906205B80EF197AFFA6CB0AF58EE03EC78E374B2C842E97C7EA082049F3082049B308203FEA003020102020204D5300A06082A8648CE3D0403043046310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369311A301806035504030C115445535420637363612D6765726D616E79301E170D3230303132313036333630345A170D3330303832313233353935395A305C310B3009060355040613024445310C300A060355040A0C03425349310D300B06035504051304303039393130302E06035504030C275445535420446F63756D656E74205369676E6572204964656E7469747920446F63756D656E7473308201B53082014D06072A8648CE3D020130820140020101303C06072A8648CE3D01010231008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC53306404307BC382C63D8C150C3C72080ACE05AFA0C2BEA28E4FB22787139165EFBA91F90F8AA5814A503AD4EB04A8C7DD22CE2826043004A8C7DD22CE28268B39B55416F0447C2FB77DE107DCD2A62E880EA53EEB62D57CB4390295DBC9943AB78696FA504C110461041D1C64F068CF45FFA2A63A81B7C13F6B8847A3E77EF14FE3DB7FCAFE0CBD10E8E826E03436D646AAEF87B2E247D4AF1E8ABE1D7520F9C2A45CB1EB8E95CFD55262B70B29FEEC5864E19C054FF99129280E4646217791811142820341263C53150231008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B31F166E6CAC0425A7CF3AB6AF6B7FC3103B883202E90465650201010362000401B434B9555974F51934687C520DAE338032F5046999E1595D85B89A4CBDB90888B8DCAB2D6588CF73E8E43DB78AB40A0FDB710D971F1C0205B9243E1F769A9E0681C01D1B298C4D7DE7F3F7E6CE9F16657907B79328BEC8166F5FC035E26EE3A382016630820162301F0603551D23041830168014539DB1872AAC9193D76392EE80D9E5996CF99B3B301D0603551D0E0416041472571E58FC52EAD9641412875C615E8090508CFA300E0603551D0F0101FF040403020780302B0603551D1004243022800F32303230303132313036333630345A810F32303230303832313233353935395A30160603551D20040F300D300B060904007F00070301010130260603551D11041F301D820B6273692E62756E642E6465A40E300C310A300806035504070C014430510603551D12044A30488118637363612D6765726D616E79406273692E62756E642E6465861C68747470733A2F2F7777772E6273692E62756E642E64652F63736361A40E300C310A300806035504070C01443019060767810801010602040E300C02010031071301411302494430350603551D1F042E302C302AA028A0268624687474703A2F2F7777772E6273692E62756E642E64652F746573745F637363615F63726C300A06082A8648CE3D04030403818A00308186024100A348C5E7948535C9ECB5043D62FA1F56F16886AF76C434C870D988D345175FD51E60A89C0E9D06A94D35078853397D7C8403E32053DF6BDFC16CC1B3A5E7D1CB0241008506DC6ACA4F202B4BDF7957263010886D38D4991D101374F6A7B8F4BC1CE51CB278E9F8851951F6AF0ABA7D4773F42762FD8F840A01F2D526CC80682DCA08103182014430820140020101304C3046310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369311A301806035504030C115445535420637363612D6765726D616E79020204D5300D06096086480165030402030500A06A301706092A864886F70D010903310A060804007F0007030201304F06092A864886F70D010904314204400FF6C4478B1154DD9FD6C597F7FD316CB042D6C676DA166941ED5F523DE3F5F4237362B9960D34E2CE322B6D8CFD341CDC31CB44E0663AB9833E4DCE5CFF2BA3300A06082A8648CE3D0403040466306402301F1CFE30ADFD43A696BD53A7A80F5EC52F8091FCAE3FED2A911558C3EFFA0D14B1F4BC5DF8C67796D9F4FD3F0533C3B802302138AD79077F3C64427902AA20B47BD0F474416623919FBA9F9FD170082D2AB64C4D5077F6F14169A64BAB277695D5CD");
		persoDataContainer.setEfChipSecurity("308207A706092A864886F70D010702A082079830820794020103310F300D0609608648016503040203050030820190060804007F0007030201A08201820482017E3182017A3012060A04007F0007020204020202010202010D300D060804007F00070202020201023017060A04007F0007020205020330090201010201010101003021060904007F000702020502301406072A8648CE3D020106092B24030302080101073017060A04007F0007020205020330090201010201020101FF3012060A04007F00070202030202020102020129301C060904007F000702020302300C060704007F0007010202010D0201293062060904007F0007020201023052300C060704007F0007010202010D0342000419D4B7447788B0E1993DB35500999627E739A4E5E35F02D8FB07D6122E76567F17758D7A3AA6943EF23E5E2909B3E8B31BFAA4544C2CBF1FB487F31FF239C8F8020129303E060804007F000702020831323012060A04007F0007020203020202010202012D301C060904007F000702020302300C060704007F0007010202010D02012D302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6CA082049F3082049B308203FEA003020102020204D5300A06082A8648CE3D0403043046310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369311A301806035504030C115445535420637363612D6765726D616E79301E170D3230303132313036333630345A170D3330303832313233353935395A305C310B3009060355040613024445310C300A060355040A0C03425349310D300B06035504051304303039393130302E06035504030C275445535420446F63756D656E74205369676E6572204964656E7469747920446F63756D656E7473308201B53082014D06072A8648CE3D020130820140020101303C06072A8648CE3D01010231008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC53306404307BC382C63D8C150C3C72080ACE05AFA0C2BEA28E4FB22787139165EFBA91F90F8AA5814A503AD4EB04A8C7DD22CE2826043004A8C7DD22CE28268B39B55416F0447C2FB77DE107DCD2A62E880EA53EEB62D57CB4390295DBC9943AB78696FA504C110461041D1C64F068CF45FFA2A63A81B7C13F6B8847A3E77EF14FE3DB7FCAFE0CBD10E8E826E03436D646AAEF87B2E247D4AF1E8ABE1D7520F9C2A45CB1EB8E95CFD55262B70B29FEEC5864E19C054FF99129280E4646217791811142820341263C53150231008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B31F166E6CAC0425A7CF3AB6AF6B7FC3103B883202E90465650201010362000401B434B9555974F51934687C520DAE338032F5046999E1595D85B89A4CBDB90888B8DCAB2D6588CF73E8E43DB78AB40A0FDB710D971F1C0205B9243E1F769A9E0681C01D1B298C4D7DE7F3F7E6CE9F16657907B79328BEC8166F5FC035E26EE3A382016630820162301F0603551D23041830168014539DB1872AAC9193D76392EE80D9E5996CF99B3B301D0603551D0E0416041472571E58FC52EAD9641412875C615E8090508CFA300E0603551D0F0101FF040403020780302B0603551D1004243022800F32303230303132313036333630345A810F32303230303832313233353935395A30160603551D20040F300D300B060904007F00070301010130260603551D11041F301D820B6273692E62756E642E6465A40E300C310A300806035504070C014430510603551D12044A30488118637363612D6765726D616E79406273692E62756E642E6465861C68747470733A2F2F7777772E6273692E62756E642E64652F63736361A40E300C310A300806035504070C01443019060767810801010602040E300C02010031071301411302494430350603551D1F042E302C302AA028A0268624687474703A2F2F7777772E6273692E62756E642E64652F746573745F637363615F63726C300A06082A8648CE3D04030403818A00308186024100A348C5E7948535C9ECB5043D62FA1F56F16886AF76C434C870D988D345175FD51E60A89C0E9D06A94D35078853397D7C8403E32053DF6BDFC16CC1B3A5E7D1CB0241008506DC6ACA4F202B4BDF7957263010886D38D4991D101374F6A7B8F4BC1CE51CB278E9F8851951F6AF0ABA7D4773F42762FD8F840A01F2D526CC80682DCA08103182014530820141020101304C3046310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369311A301806035504030C115445535420637363612D6765726D616E79020204D5300D06096086480165030402030500A06A301706092A864886F70D010903310A060804007F0007030201304F06092A864886F70D0109043142044064C378E9D347491D8BCEFD9BA004B301644A8601CABF3ECA478D531D9B5C7CE2E0169FAF3C1ABDE266914DBAFD560812BD07882AE049018C9B19600596632033300A06082A8648CE3D040304046730650231008B9182A9BA49ACC3E432D5AFBA2A512F6B4E389FEEFA85F858E94A917A4D9B3E3A6FAA27497BB6EEADA7D82F5D120361023006F42B94178E56BEA454BDEE441D9C739CA3703577A25AEEC79B1F3DFF72FC67DFBEECC98489B6CA27C50F04F119AB03");
		
		String documentNumber = "000000005";
		String sex = "F";
		String mrzLine3 = "OEZMEN<<AGCA<<<<<<<<<<<<<<<<<<";
		String mrz = persoDataContainer.createMrzFromDgs(documentNumber, sex, mrzLine3);
		
		persoDataContainer.setMrz(mrz);
		persoDataContainer.setEpassDg1PlainData(mrz);
		
		// unprivileged CA key
		persoDataContainer.addCaKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("0419D4B7447788B0E1993DB35500999627E739A4E5E35F02D8FB07D6122E76567F17758D7A3AA6943EF23E5E2909B3E8B31BFAA4544C2CBF1FB487F31FF239C8F8"),
				HexString.toByteArray("A07EB62E891DAA84643E0AFCC1AF006891B669B8F51E379477DBEAB8C987A610")),
				41, false);
		
		// privileged CA key
		persoDataContainer.addCaKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("0458597F17D0CBA7D87367C74A2CEC20BDE2C3A48691CA46E9251F32714FF6C797837E409E64E32DB4F300103E2213BB7DFC272BF145BF3288179F853DF58B5EFF"),
				HexString.toByteArray("999BEFF963FB29349046083727F196AB6BF86ACBDE08401851C150DE7C61948C")),
				45, true);

		// individual RI key - 1st sector public/private key pair (Sperrmerkmal)
		persoDataContainer.addRiKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("0487C928D3F6668934B395CF697A652F7CE4A2DEDA82F8051741192D6B6F3E3E8D5CCBAC25AC67738E140BBEAB4E6D618682B767AD74991173D27ABC94A273796C"),
				HexString.toByteArray("79E8733420F99BDB155B949E64884E9D4A20050BC444E17F0B8AD5BB14E46D46")),
				1, false);

		// individual RI key - 2nd sector public/private key pair (Pseudonym)
		persoDataContainer.addRiKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("04A43667A0685BBD9DD473DCDD54464F5B4F039A31A6A47C32EA44B8A2EE045DC91812B26CC2AC6BFF21D6DF9D17A4D297C09C18329839AB4EC901BB28895D53EB"),
				HexString.toByteArray("166795E4D1D3ED8DF2CA5EE7C7899FED3FC01D6FCDC771F4E05C4B9693C4FC83")),
				2, true);
	}
	
	@Override
	protected void addEidDg13(DedicatedFile eIdAppl) {
		// do not create DG
	}
	
}
