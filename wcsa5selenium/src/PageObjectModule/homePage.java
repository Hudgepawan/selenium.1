package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	
	@FindBy(xpath="//div[text()='Time-Track']/../descendant ::img") private WebElement timeTrackModule;
	@FindBy(xpath="//div[text()='Tasks']/../descendant ::img") private WebElement TaskModule;
	@FindBy(xpath="//div[text()='Reports']/../descendant ::img") private WebElement reportsModule;
	@FindBy(xpath="//div[text()='Users']/../descendant ::img") private WebElement UsersModule;
	@FindBy(xpath="//div[text()='Work Schedule']/following-sibling ::img") private WebElement workScheduleModule;
	@FindBy(xpath="//div[text()='Settings']/following-siblin ::img") private WebElement settingModule;
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutModule;
	
	public homePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//getters method

	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}

	public WebElement getTaskModule() {
		return TaskModule;
	}

	public WebElement getReportsModule() {
		return reportsModule;
	}

	public WebElement getUsersModule() {
		return UsersModule;
	}

	public WebElement getWorkScheduleModule() {
		return workScheduleModule;
	}

	public WebElement getSettingModule() {
		return settingModule;
	}

	public WebElement getLogoutModule() {
		return logoutModule;
	}
	
//--------------------------------------------------------------------------------------------------------------------------------------------------	
	
	public void clickOntimeTrackModule()
	{
		timeTrackModule.click();
	}
	
	public void clickonTaskModule()
	{
		TaskModule.click();
	}
	 public void clickOnReportsModule() {
		 reportsModule.click();
	 }
	 public void ClickOnUsersModule()
	 {
		 UsersModule.click();
	 }
	 
	 public void ClickOnWorkScheduleModule()
	 {
		 workScheduleModule.click();
	 }
	 
	 public void ClickOnSettingModule()
	 {
		 settingModule.click();
	 }
	
	 public void ClickOnLogoutModule()
	 {
		 logoutModule.click();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
