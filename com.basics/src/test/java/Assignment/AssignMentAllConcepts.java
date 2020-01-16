package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignMentAllConcepts {
	/*
	 * Test cases is Written For all Basic Concepts.
	 * 
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "http://www.qaclickacademy.com/practice.php";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		driver.get(URL);
		WebElement checkBox = driver.findElement(By.cssSelector("#checkBoxOption3"));
		String checkBoxValue = checkBox.getAttribute("value");
		checkBox.click();

		Select select = new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
		select.selectByValue(checkBoxValue);

		driver.findElement(By.cssSelector("#name")).sendKeys(checkBoxValue);

		driver.findElement(By.cssSelector("#alertbtn")).click();

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();

		if (alertText.contains(checkBoxValue)) {
			System.out.println("test case Pass");
			alert.dismiss();
		} else {
			System.out.println("Failed");
		}

	}

}
