package Package_A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessChromeWebPage {
	public static String driverPath = "/Users/jithus/Neethu/workspace/chromedriver";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		
		
		/*WebElement emailElement = driver.findElement(By.name("email"));
		//WebElement emailElement = driver.findElement(By.xpath("input[@type ='text']"));
		emailElement.sendKeys("neethu@gmail.com");
		
		
		WebElement passElement = driver.findElement(By.xpath("//input[@id='pass']"));
		passElement.sendKeys("pass123");
		
		WebElement loginElement = driver.findElement(By.name("login"));
		loginElement.click();
		
		//WebElement forgotPassLinkElement = driver.findElement(By.linkText("Forgot password?"));
		//forgotPassLinkElement.click();
		
		WebElement forgotPassParLinkElement = driver.findElement(By.partialLinkText("pass"));
		forgotPassParLinkElement.click();*/
		
		WebElement emailElement = driver.findElement(By.xpath("//input[@placeholder = 'Email or phone number']"));
		emailElement.sendKeys("neethu@gmail.com");
		
		WebElement passElement = driver.findElement(By.xpath("//*[@type = 'password']"));
		passElement.sendKeys("pass123");
	
		
		
		
		
		
		

	}

}
