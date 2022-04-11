package Package_A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {
	
		public static String driverPath = "/Users/jithus/Neethu/workspace/chromedriver";
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			
	        WebElement cusID = driver.findElement(By.name("cusid"));
	        cusID.sendKeys("ID-1");
	        
	        WebElement submit = driver.findElement(By.name("submit"));
	        submit.click();
	        
	        Alert alert1 = driver.switchTo().alert();
	        Thread.sleep(5000);
	        
	        
	        System.out.println(alert1.getText());
	        alert1.accept();
	        //alert.dismiss();
	        
	        Alert alert2 = driver.switchTo().alert();
            Thread.sleep(5000);
            System.out.println(alert2.getText());
            alert2.accept();
	        
	        
	        Thread.sleep(50000);
	        
			

}

}