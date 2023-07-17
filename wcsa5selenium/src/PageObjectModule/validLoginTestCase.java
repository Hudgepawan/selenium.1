package PageObjectModule;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class validLoginTestCase extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		BaseTest bs = new BaseTest();
		bs.setUp();
		
		Flib fl = new Flib();
		loginPage lp = new loginPage(driver);
		
		lp.validLogin(fl.readPropertyFile(PROP_PATH, "Username"),fl.readPropertyFile(PROP_PATH, "Password"));
		

	}

}

