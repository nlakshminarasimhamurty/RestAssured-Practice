package dropDownBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestionDropDown {
	/*
	 * Test cases is Written For AutoSuggestive drop down automation.
	 * 
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://www.makemytrip.com";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {

		driver.get(URL);

		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Ban");

		List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),'Ban')]"));
		for (int i = 0; i <elements.size(); i++) {
			System.out.println(elements.get(i).getText());
			if (elements.get(i).getText().contains("Pune")) {
				elements.get(i).click();
			}
		}

	}

}
