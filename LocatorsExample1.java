package Package_A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample1 {
	public static String driverPath = "/Users/jithus/Neethu/workspace/chromedriver";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://phptravels.org/index.php?rp=/login");

		WebElement email = driver.findElement(By.id("inputEmail"));
		email.sendKeys("neethu@gmail.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("pass123");

		WebElement rememberMe = driver.findElement(By.xpath("//input[@type='checkbox'and @name='rememberme']"));
		rememberMe.click();

		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();

		WebElement staticTexts = driver
				.findElement(By.xpath("//*[contains (text(), 'Please complete the captcha and try again')]"));
		System.out.println(staticTexts.getText());

		// WebElement captcha=
		// driver.findElement(By.classname("recaptcha-checkbox-borderAnimation"));
		// captcha.click();

		// WebElement captcha=
		// driver.findElement(By.xpath("//div[@role='presentation']"));
		// captcha.click();

		WebElement viewCart = driver.findElement(By.linkText("View Cart"));
		viewCart.click();

		WebElement register = driver.findElement(By.partialLinkText("Regi"));
		register.click();

		WebElement captureText = driver.findElement(By.xpath("//*[@id=\"main-body\"]/div/div/div[1]/div/h1/small"));
		System.out.println(captureText.getText());

		WebElement alreadyRegistered = driver.findElement(By.tagName("i"));
		alreadyRegistered.click();

		WebElement lostPassReset = driver.findElement(By.xpath("//a[@ menuitemname='Lost Password Reset']"));
		lostPassReset.click();

		Thread.sleep(5000);

		driver.close();

	}
}
