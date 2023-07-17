package PageObjectModule;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class invalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib fl = new Flib();
		int rc = fl.getLastRowCount(EXCEL_PATH, "invalidcred");

		loginPage lp = new loginPage(driver);

		for(int i=0;i<rc;i++)
		{
			lp.invalidLogin(fl.readExcelData(EXCEL_PATH, "invalidcred", i,0),fl.readExcelData(EXCEL_PATH,"invalidcred",i, 1));

		}



	}

}
