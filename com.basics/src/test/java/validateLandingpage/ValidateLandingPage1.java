package validateLandingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateLandingPage1 {

	/*
	 * Test cases is Written to validate we are landing on correct page or not , By
	 * using getCurrentUrl.
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://www.google.com";

	public static void main(String[] args) {

		// Launch The Browser

		WebDriver driver = new FirefoxDriver();

		// Enter the URL

		driver.get(URL);

		// Verify Weather we have been landing to the correct page or not

		String currentUrl = driver.getCurrentUrl();

		if (currentUrl.contains(URL)) {
			System.out.println("Landing to the Valid URL");
		} else {
			System.out.println("landing is improper");
		}

	}

}
