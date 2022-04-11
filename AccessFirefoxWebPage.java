package Package_A;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AccessFirefoxWebPage {

	/*
	 * public static String driverPath =
	 * "/Users/jithus/Neethu/workspace/geckodriver"; public static WebDriver driver;
	 * 
	 * public static void main(String[] args) {
	 * 
	 * System.setProperty("webdriver.gecko.driver", driverPath); driver = new
	 * FirefoxDriver(); driver.get("https:\\www.facebook.com");
	 */

	public static String driverPath = "/Users/jithus/Neethu/workspace/chromedriver";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		Select listboxs = new Select(driver.findElement(By.name("employees_c")));
		listboxs.selectByIndex(6);

		// listboxs.selectByValue("level4");
		listboxs.selectByVisibleText("251 - 500 employees");

	}

}
