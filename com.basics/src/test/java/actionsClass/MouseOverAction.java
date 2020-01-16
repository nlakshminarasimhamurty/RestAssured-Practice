package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	/*
	 * Test cases is Written For Mouse Over Action.
	 * 
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://www.spicejet.com";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {

		driver.get(URL);

		WebElement SpecialBtn = driver.findElement(By.xpath("//li[@id='header-addons']//a[@id='highlight-addons']"));

		WebElement insideElement = driver.findElement(By.xpath("//a[text()='SpiceMax ']"));
		Actions at = new Actions(driver);
		at.moveToElement(SpecialBtn).click().click(insideElement).build().perform();
		
	}

}
