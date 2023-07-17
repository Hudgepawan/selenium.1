package PopUpHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class notificationPopUp {
	static WebDriver driver;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browserValue!!!");
		String browserValue = sc.next();

		if (browserValue.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			// handle notification pop up
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--disable-notifications");
			driver = new ChromeDriver(op);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.easemytrip.com/");
		} 
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			// handle notification pop up
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			driver = new FirefoxDriver(fo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.easemytrip.com/");

		}
		else if (browserValue.equalsIgnoreCase("Edge")) 
		{
			System.setProperty("webdriver.Edge.driver", "./drivers/Edgedriver.exe");
			// handle notification pop up
			EdgeOptions ed = new EdgeOptions();
			ed.addArguments("--disable-notifications");
			driver = new EdgeDriver(ed);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.easemytrip.com/");

		} 
		else 
		{
			System.out.println("Enter valid browserValue!!");

		}

	}

}
