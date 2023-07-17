package HandlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrappedElementMethod {

	public static void main(String[] args) {
	  
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Ant/OneDrive/Desktop/wcsa5workspace/WebElement/Menu.html");
		WebElement dropdownElement = driver.findElement(By.id("menu"));
        Select sel=new Select(dropdownElement);
        WebElement allOption = sel.getWrappedElement();
        System.out.println(allOption.getText());
        
		
	}

}
