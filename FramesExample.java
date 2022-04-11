package Package_A;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {
	

		public static String driverPath = "/Users/jithus/Neethu/workspace/chromedriver";
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.get("https://demoqa.com/frames");
			//driver.switchTo().frame("frame1");
			
			WebElement frame1 = driver.findElement(By.id("frame1"));
			driver.switchTo().frame("frame1");
			//String frameText = frame1.getText();
			//System.out.println(frameText);
			WebElement text = driver.findElement(By.id("sampleHeading"));
			System.out.println(text.getText());
			
			Thread.sleep(5000);
			
			
			
			
			driver.close();
}
}