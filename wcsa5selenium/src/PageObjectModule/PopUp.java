package PageObjectModule;

import java.sql.Driver;

public class PopUp extends BaseTest {
	
	public void HandlePopUp() {
		
		driver.switchTo().alert().dismiss();
		
	}
	


}
