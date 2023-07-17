package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrlMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.google.com/");
		String  currentUrl =  driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}

}
