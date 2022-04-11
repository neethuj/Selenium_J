package Package_A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectorExample {
	public static String driverPath = "/Users/jithus/Neethu/workspace/chromedriver";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		
		Select countryName = new Select (driver.findElement(By.name("country")));
		//countryName.selectByIndex(5);
		//countryName.selectByValue("UNITED STATES");
		countryName.selectByVisibleText("STATES");
		
		Thread.sleep(5000);
		

}
}
