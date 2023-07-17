package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {


	//store element of webPage

	@FindBy(xpath="//input[@value='Create New User']") private WebElement userListCreateNewUserButton;
	@FindBy(xpath="//*[@name='username']") private WebElement usnTB;
	@FindBy(xpath="//*[@name='passwordText']") private WebElement passTB;
	@FindBy(name="//input[@name='passwordTextRetype']") private WebElement retypePasswordTB;
	@FindBy(xpath="//*[@name='firstName']") private WebElement firstnameTB;
	@FindBy(xpath="//*[@name='lastName']") private WebElement lastnameTB;
	@FindBy(name="//input[@name='rightGranted[12]']") private WebElement modifyTimeTrackUserCheckBox;
	@FindBy(name="//input[@name='rightGranted[2]']") private WebElement manageCusto_ProjectCheckBox;
	@FindBy(name="//input[@name='rightGranted[1]']") private WebElement generateReportsCheckBox;
	@FindBy(name="//input[@name='rightGranted[5]']") private WebElement manageUserCheckBox;
	@FindBy(name="//input[@name='rightGranted[7]']") private WebElement manageBillingTypeCheckBox;
	@FindBy(xpath="//input[@type='submit']") private WebElement createUserButton;
	@FindBy(xpath="/HTML/BODY/DIV/FORM/TABLE/TBODY/TR[4]/TD/INPUT[2]") private WebElement cancleButton;
	@FindBy(xpath="//a[.='sharma, Rohit (sham)']") private WebElement userLink;
	@FindBy(xpath="//input[@value='Delete This User']") private WebElement deleteUserButton;

	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	//getters method

	public WebElement getUserListCreateNewUserButton() {
		return userListCreateNewUserButton;
	}

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getRetypePasswordTB() {
		return retypePasswordTB;
	}

	public WebElement getFirstnameTB() {
		return firstnameTB;
	}

	public WebElement getLastnameTB() {
		return lastnameTB;
	}

	public WebElement getModifyTimeTrackUserCheckBox() {
		return modifyTimeTrackUserCheckBox;
	}

	public WebElement getManageCusto_ProjectCheckBox() {
		return manageCusto_ProjectCheckBox;
	}

	public WebElement getGenerateReortsCheckBox() {
		return generateReportsCheckBox;
	}

	public WebElement getManageUserCheckBox() {
		return manageUserCheckBox;
	}

	public WebElement getManageBillingTypeCheckBox() {
		return manageBillingTypeCheckBox;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancleButton() {
		return cancleButton;
	}
	//---------------------------------------------------------------------------------------------------------------------------------	
	public void createManager(String username,String password,String fn,String ln) throws InterruptedException
	{
		userListCreateNewUserButton.click();
		Thread.sleep(1000);
		usnTB.sendKeys(username);
		passTB.sendKeys(password);
		Thread.sleep(1000);
		retypePasswordTB.sendKeys(password);
		firstnameTB.sendKeys(fn);
		lastnameTB.sendKeys(ln);
		Thread.sleep(1000);
		modifyTimeTrackUserCheckBox.click();
		manageCusto_ProjectCheckBox.click();
		generateReportsCheckBox.click();
		manageUserCheckBox.click();
		manageBillingTypeCheckBox.click();
		Thread.sleep(1000);
		createUserButton.click();	
	}
	public void deleteManager()
	{
		deleteUserButton.click();
	}	
}
