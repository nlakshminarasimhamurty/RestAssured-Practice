package radioBtn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioBtn {
	/*
	 * Test cases is Written For AutoSuggestive drop down automation.
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
		List<WebElement> element = driver.findElements(By.xpath("//*[@id='discount-checkbox']//input"));

		for (int i = 1; i < element.size(); i++) {
			element.get(i).click();
			if (element.get(element.size()-1).isSelected()) {
				System.out.println("yes Selected");
			}
		}
	}

}
