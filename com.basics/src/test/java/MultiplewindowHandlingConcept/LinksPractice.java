package MultiplewindowHandlingConcept;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksPractice {
	/*
	 * Test cases is Written For opening all links in new tab and Switching into all
	 * tabs using window handling concepts .
	 * 
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "http://www.qaclickacademy.com";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws InterruptedException {

		driver.get(URL);
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));

		Iterator<WebElement> iterator = AllLinks.iterator();
		int totalLinks = 0;
		while (iterator.hasNext()) {
			totalLinks++;
			System.out.println(iterator.next().getText());
		}
		System.out.println(totalLinks);

		// links in footer

		WebElement footer = driver.findElement(By.cssSelector("#prefooter"));

		List<WebElement> footerLinks = footer.findElements(By.tagName("a"));
		Iterator<WebElement> iterator2 = footerLinks.iterator();
		int footerLinksCount = 0;

		while (iterator2.hasNext()) {
			WebElement elment1 = iterator2.next();
			System.out.println(elment1.getText());
			String chord = Keys.chord(Keys.CONTROL, Keys.ENTER);
			elment1.sendKeys(chord);
			Thread.sleep(5000);
			// System.out.println(driver.switchTo().window(driver.getWindowHandle()).getTitle());

			footerLinksCount++;
		}

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator3 = windowHandles.iterator();
		while (iterator3.hasNext()) {
			System.out.println(driver.switchTo().window(iterator3.next()).getTitle());

		}

		System.out.println(footerLinksCount);

	}

}
