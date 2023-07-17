package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		
		Point NewsElement = driver.findElement(By.xpath("//h2[.='News']")).getLocation();
		int xaxis = NewsElement.getX();
		int yaxis = NewsElement.getY();
		
		System.out.println("x axis of webelement:"+xaxis +" y axis of webelement:"+yaxis);
		
		

	}

}
