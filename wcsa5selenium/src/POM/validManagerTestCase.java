package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class validManagerTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {


		BaseTest bt = new BaseTest();
		bt.setUp();

		flib flib = new flib();

		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		UsersPage up = new UsersPage(driver);

		workLib wh = new workLib();

		//perform valid login

		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));

		//click on users module

		hp.clickOnusersModule();

		//create the manager

		up.createManager(flib.readExcelData(EXCEL_PATH,"managercred",1, 0),flib.readExcelData(EXCEL_PATH, "managercred",1,1),flib.readExcelData(EXCEL_PATH, "managercred", 1, 2),flib.readExcelData(EXCEL_PATH, "managercred", 1, 3));

		//delete user
		up.deleteManager();
		wh.handlePopup();

		Thread.sleep(2000);
		bt.tearDown();






	}

}
