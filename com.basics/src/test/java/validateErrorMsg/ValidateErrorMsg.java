package validateErrorMsg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateErrorMsg {

	/*
	 * Test cases is Written For Validating Error Massage.
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://login.salesforce.com";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		driver.get(URL);
		driver.findElement(By.cssSelector("#username")).clear();
		driver.findElement(By.cssSelector("#username")).sendKeys("naveeen");
		driver.findElement(By.cssSelector("input[name='pw']")).clear();
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("pavan");
		driver.findElement(By.cssSelector("input[name='Login']")).click();

		if (driver.findElement(By.id("error")).isDisplayed()) {
			System.out.println(driver.findElement(By.id("error")).getText());
		} else {
			System.out.println("Erro not displayed");
		}

	}

}
