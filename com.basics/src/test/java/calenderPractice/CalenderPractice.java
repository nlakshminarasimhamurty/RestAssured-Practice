package calenderPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderPractice {
	/*
	 * Test cases is Written For all calender Practice.
	 * 
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://www.path2usa.com/travel-companions";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		driver.get(URL);
		driver.findElement(By.id("travel_date")).click();
		boolean month = driver.findElement(By.xpath("//th[contains(text(),'January 2020')]")).getText()
				.contains("January");
		while (!month) {
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'»')]"))
					.click();
		}
		List<WebElement> allDays = driver.findElements(By.xpath("//td[@class='day']"));
		for (int i = 0; i < allDays.size(); i++) {
			if (Integer.parseInt(allDays.get(i).getText()) == 14) {
				allDays.get(i).click();
				break;
			}
		}
	}

}
