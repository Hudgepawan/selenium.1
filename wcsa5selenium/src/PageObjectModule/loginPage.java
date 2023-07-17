package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	@FindBy(xpath="//*[@name='username']") private WebElement usnTB;
	@FindBy(xpath="//*[@name='pwd']") private WebElement pass;
	@FindBy(xpath="//*[@id='keepLoggedInCheckBox']") private WebElement CheckBox;
	@FindBy(xpath="//*[@id='loginButton']") private WebElement loginCheckBox;
	
	public loginPage(WebDriver driver)
	{
	    PageFactory.initElements(driver,this);	
	}

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}

	public WebElement getLoginCheckBox() {
		return loginCheckBox;
	}
	
	public void validLogin(String validUsername,String validPassword)
	{
		usnTB.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginCheckBox.click();
	}
	
	public void invalidLogin(String invalidUsername,String invalidPassword)
	{
		usnTB.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginCheckBox.click();
		
		
	}
	
	
	

}
