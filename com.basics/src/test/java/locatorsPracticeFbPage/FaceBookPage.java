package locatorsPracticeFbPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookPage {

	/*
	 * Test cases is Written For Locators Practice
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://www.facebook.com";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws InterruptedException {

		driver.get(URL);

		// For ID

		driver.findElement(By.id("email")).sendKeys("Naveen");
		// For Name

		driver.findElement(By.name("pass")).sendKeys("kumar");

		// For CSS Selector

		driver.findElement(By.cssSelector("input[name='sex'][value='2']")).click();

		Thread.sleep(3000);

		// For PartialLink text

		driver.findElement(By.partialLinkText("Forgotten ")).click();

	}

}
