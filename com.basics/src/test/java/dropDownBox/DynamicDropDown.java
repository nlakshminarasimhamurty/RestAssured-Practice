package dropDownBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropDown {
	/*
	 * Test cases is Written For Dynamic drop down automation.
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
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		for (int i = 1; i <= 4; i++) {
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		driver.findElement(By.cssSelector("input[id$='ddl_originStation1_CTXT']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='dropdownGroup1']//div//ul//li"));

		for (int i = 1; i <= elements.size(); i++) {
			if (elements.get(i).getText().equalsIgnoreCase("shirdi (SAG)")) {
				elements.get(i).click();
				break;
			}

		}
		// driver.findElement(By.cssSelector("input[id$='destinationStation1_CTXT']")).sendKeys("Banagalore");
	}

}
