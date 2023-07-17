package POM;  //Page Object Model

import java.io.IOException;

public class validLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		flib flib = new flib();
		
		// to call the webelEments of login page create the obj of loginPage class
		
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		
		
		
		
		

	}

}
