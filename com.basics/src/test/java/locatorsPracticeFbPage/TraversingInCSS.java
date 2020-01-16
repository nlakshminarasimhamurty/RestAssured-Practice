package locatorsPracticeFbPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TraversingInCSS {
	/*
	 * Test cases is Written For traversing parent to Child in CSS selector.
	 * 
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://www.google.co.in/";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		driver.get(URL);
		driver.findElement(
				By.cssSelector("div[jsname='RNNXgb']>div[class='SDkEP']>div[jsname='gLFyf']>input[name='q']"))
				.sendKeys("Naveen Bangalore");

	}

}
