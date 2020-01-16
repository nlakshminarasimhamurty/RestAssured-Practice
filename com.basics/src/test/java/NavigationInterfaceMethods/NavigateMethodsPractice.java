package NavigationInterfaceMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethodsPractice {

	/*
	 * Test cases is Written to perform actions on the browser using navigation
	 * interface methods.
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://www.google.com";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		// Enter URL

		driver.get(URL);

		// navigate to another URL

		driver.navigate().to("https://www.yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();

	}

}
