package de.persosim.simulator.perso;

/**
 * @author slutters
 *
 */
public class DefaultPersoTestPkiTemplate06 extends DefaultPersoTestPkiTemplate {
	
	@Override
	public void setPersoDataContainer() {
		persoDataContainer = new PersonalizationDataDefaultContainer();
		persoDataContainer.setDg4PlainData("Hans-G�nther");
		persoDataContainer.setDg5PlainData("von Drebenbusch-Dalgo�en");
		persoDataContainer.setDg6PlainData("Freiherr zu M�ckern-Windensberg");
		persoDataContainer.setDg7PlainData("Dr.eh.Dr.");
		persoDataContainer.setDg8PlainData("19460125");
		persoDataContainer.setDg9PlainData("BREMERHAVEN");
		persoDataContainer.setDg11PlainData("M");
		persoDataContainer.setDg13PlainData("Wei�");
		persoDataContainer.setDg17StreetPlainData("WEG NR. 12 8E");
		persoDataContainer.setDg17CityPlainData("HAMBURG");
		persoDataContainer.setDg17CountryPlainData("D");
		persoDataContainer.setDg17ZipPlainData("22043");
		persoDataContainer.setDg18PlainData("02760200000000");
		persoDataContainer.setDocumentNumber("000000006");
		persoDataContainer.setMrzLine3Of3("VONDREBENBUSCHDALGOSSEN<<HANS<");
	}

}
