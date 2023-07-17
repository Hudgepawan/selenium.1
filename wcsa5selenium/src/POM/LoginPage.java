package POM;   //Page Object Model

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	  
	//it is a web element repository
	
	
	@FindBy(xpath="//*[@name='username']") private WebElement usnTB;
	@FindBy(xpath= "//*[@name='pwd']") private WebElement passTB;
	@FindBy(xpath ="//*[@id='loginButton']") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(partialLinkText="Actimind Inc.") private WebElement actiMindLink;
	
	//initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization
	
	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPassTB() {
		return passTB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getCheckBox() {
		return checkBox;
	}


	public WebElement getActiMindLink() {
		return actiMindLink;
	}
	
	
	//operational method
	
	public void validLoginMethod(String validUsername,String validPassword)
	{
		usnTB.sendKeys(validUsername);
		passTB.sendKeys(validPassword);
		loginButton.click();
	}
	public void invalidLoginMethod(String invalidUsername,String invalidPassword) throws InterruptedException {
		
		usnTB.sendKeys(invalidUsername);
		usnTB.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(1000);
		usnTB.clear();
		
	}
	
	}


