package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userPage {

	@FindBy(xpath="//input[@value='Create New User']") private WebElement CreateNewUserModule;
	@FindBy(xpath="//input[@name='username']") private WebElement UsernameModule;
	@FindBy(xpath="//input[@type='password']") private WebElement PasswordModule;
	@FindBy(xpath = "//input[@name='passwordTextRetype']") private WebElement RetypePasswordModule;
	@FindBy(xpath="//input[@name='firstName']") private WebElement FirstNameModule;
	@FindBy(xpath="//input[@name='lastName']") private WebElement LastNameModule;
	@FindBy(xpath="//input[@name='rightGranted[12]']") private WebElement ModifyTimeTrackModule;
	@FindBy(xpath="//input[@name='rightGranted[2]']") private WebElement ManageCustomer_projectModule;
	@FindBy(xpath="//input[@name='rightGranted[1]']") private WebElement GenerateReportsModule;
	@FindBy(xpath="//input[@name='rightGranted[5]']") private WebElement ManageUsersModule;
	@FindBy(xpath="//input[@name='rightGranted[7]']") private WebElement ManageBilingTypeModule;
	@FindBy(xpath="//input[@type='submit']") private WebElement createUserModule;
	@FindBy(xpath="/HTML/BODY/DIV/FORM/TABLE/TBODY/TR[4]/TD/INPUT[2]") private WebElement cancleButton;
	@FindBy(xpath="//a[text()='Sharma, Rohit (manager_01)']") private WebElement userList;
	@FindBy(xpath="//input[@value='Delete This User']") private WebElement DeleteTheUserModule;
	//--------------------------------------------------------------------------------------------------------------------------------------------------    
	//constructor
	public userPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------   

	//getters method

	public WebElement getCreateNewUserModule() {
		return CreateNewUserModule;
	}

	public WebElement getUsernameModule() {
		return UsernameModule;
	}

	public WebElement getPasswordModule() {
		return PasswordModule;
	}

	public WebElement getRetypePasswordModule() {
		return RetypePasswordModule;
	}

	public WebElement getFirstNameModule() {
		return FirstNameModule;
	}

	public WebElement getLastNameModule() {
		return LastNameModule;
	}

	public WebElement getModifyTimeTrackModule() {
		return ModifyTimeTrackModule;
	}

	public WebElement getManageCustomer_projectModule() {
		return ManageCustomer_projectModule;
	}

	public WebElement getGenerateReportsModule() {
		return GenerateReportsModule;
	}

	public WebElement getManageUsersModule() {
		return ManageUsersModule;
	}

	public WebElement getManageBilingTypeModule() {
		return ManageBilingTypeModule;
	}

	public WebElement getCreateUserModule() {
		return createUserModule;
	}

	public WebElement getCancleButton() {
		return cancleButton;
	}

	public void CreateNewManager(String Username,String Password,String FirstName,String LastName) throws InterruptedException
	{
		CreateNewUserModule.click();
		Thread.sleep(2000);

		UsernameModule.sendKeys(Username);
		PasswordModule.sendKeys(Password);
		RetypePasswordModule.sendKeys(Password);
		Thread.sleep(2000);

		FirstNameModule.sendKeys(FirstName);
		LastNameModule.sendKeys(LastName);
		Thread.sleep(1000);

		ModifyTimeTrackModule.click();
		ManageCustomer_projectModule.click();
		GenerateReportsModule.click();
		ManageUsersModule.click();
		ManageBilingTypeModule.click();
		createUserModule.click();
		Thread.sleep(1000);
		userList.click();
		DeleteTheUserModule.click();
	}
	public void deleteManager()
	{
		DeleteTheUserModule.click();
	}






}
