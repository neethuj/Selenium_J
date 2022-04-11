package Package_A;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionsExamples {

		public static String driverPath = "/Users/jithus/Neethu/workspace/chromedriver";
		public static WebDriver driver;
		
		public static void main(String args[]) throws InterruptedException
		{
		
			System.setProperty("webdriver.chrome.driver", driverPath);
			
			driver = new ChromeDriver();
			try
			{
				driver.get("https://www.facebook.com");
				
			//	WebElement emailText = driver.findElement(By.id("email"));
				WebElement emailText = driver.findElement(By.className("nputtext _55r1 _6luy"));
				emailText.sendKeys("neethu@gmail.com");
				
			}catch(NoSuchElementException exe0){
				
				System.out.println("Object Not found");
				
			}catch(WebDriverException exe1)
			
			{
				System.out.println("WebDriver is unable to Initialize");
				
			}catch(Exception exe2)
			{
				exe2.getMessage();
			}finally
			{
				driver.close();
			}
			
			
			
	}
	}


