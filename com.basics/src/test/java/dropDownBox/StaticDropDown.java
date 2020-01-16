package dropDownBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	/*
	 * Test cases is Written For static drop down automation.
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

		WebElement currencyBtn = driver.findElement(By.cssSelector("[id$='mainContent_DropDownListCurrency']"));

		Select select = new Select(currencyBtn);

		List<WebElement> elements = select.getOptions();

		/*
		 * for (WebElement element : elements) { System.out.println(element.getText());
		 * if (element.getText().equalsIgnoreCase("aed")) { element.click(); break; } }
		 */

		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
			if (elements.get(i).getText().equalsIgnoreCase("aed")) {
				elements.get(i).click();
				break;
			}
		}

	}

}
