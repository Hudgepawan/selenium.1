package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		
		//launch the browser & webApplication
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		//perform invalid login
		//go into the login page
		
		LoginPage lp = new LoginPage(driver);
		
		//read the data from excel file
		
		flib fl = new flib();
		int rc = fl.getLastRowCount(EXCEL_PATH, "invalidcred");
		
		for(int i=1;i<=rc;i++)
		{
			lp.invalidLoginMethod(fl.readExcelData(EXCEL_PATH,"invalidcred", i, 0),fl.readExcelData(EXCEL_PATH,"invalidcred", i, 1));
		}

	}

}
