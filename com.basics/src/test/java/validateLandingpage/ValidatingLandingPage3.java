package validateLandingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingLandingPage3 {

	/*
	 * Test cases is Written to validate we are landing on correct page or not , By
	 * using constant Element.
	 * 
	 */
	static WebDriver driver;
	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://www.google.com";

	public static void main(String[] args) {

		// Launch The Browser

		driver = new FirefoxDriver();

		// Enter the URL

		driver.get(URL);

		// Verify Weather we have been landing to the correct page or not

		WebElement signInBtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		if (signInBtn.isDisplayed()) {
			System.out.println("Landing to the Valid URL");
		} else {
			System.out.println("landing is improper");
		}

	}
}
