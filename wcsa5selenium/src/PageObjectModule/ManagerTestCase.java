package PageObjectModule;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ManagerTestCase extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib fl = new Flib();
		
		loginPage lp = new loginPage(driver);
		homePage hp = new homePage(driver);
		userPage up = new userPage(driver);
		
		PopUp PU = new PopUp();
		
		lp.validLogin(fl.readPropertyFile(PROP_PATH, "Username"),fl.readPropertyFile(PROP_PATH, "Password"));
		
		hp.ClickOnUsersModule();
		
		up.CreateNewManager(fl.readExcelData(EXCEL_PATH, "managercred", 1, 0),fl.readExcelData(EXCEL_PATH, "managercred", 1, 1),fl.readExcelData(EXCEL_PATH,"managercred",1,2),fl.readExcelData(EXCEL_PATH,"managercred",1,3));
		Thread.sleep(2000);
		
		up.deleteManager();
		PU.HandlePopUp();
		bt.tearDown();

	}

}
