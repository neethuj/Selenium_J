package Package_A;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {
	
	
	public static String driverPath = "/Users/jithus/Neethu/workspace/chromedriver";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println(mainWindowHandle);
		
		WebDriverWait waits = new WebDriverWait(driver,20);
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		
		while(iterator.hasNext()){
			String childWindow = iterator.next();
			if(!mainWindowHandle.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				waits.until(ExpectedConditions.visibilityOfElementLocated(By.id("sampleHeading")));
				WebElement text = driver.findElement(By.id("sampleHeading"));
				System.out.println(text.getText());

			}
		}
}
}
