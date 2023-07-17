package HandlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptionMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("file:///C:/Users/Ant/OneDrive/Desktop/wcsa5workspace/WebElement/Menu1.html");
	  
	  //identify dropdown
	  WebElement dropdown = driver.findElement(By.id("menu"));
	  
	  //handle the dropdown
	  Select sel = new Select(dropdown);
	  
	  //select multiple options from dropdown
	  for(int i=0;i<5;i++)
	  {
		  Thread.sleep(2000);
		  sel.selectByIndex(i);
	  }
	  
	  //to read all selected option from dropdown
	  List<WebElement> allOption = sel.getAllSelectedOptions();
	  
	  //to read the list of webelement we use for loop
	  
	  for(WebElement op:allOption)
	  {
		  Thread.sleep(2000);
		  System.out.println(op.getText());
	  }
		  
	
	  
	}

}
