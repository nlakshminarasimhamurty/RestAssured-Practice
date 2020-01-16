package widowsConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {
	/*
	 * Test cases is Written For Mouse Over Action.
	 * 
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://accounts.google.com/";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> itr = handles.iterator();
		
		while(itr.hasNext()) {
			System.out.println(driver.getTitle());
			driver.switchTo().window(itr.next());
			driver.findElement(By.xpath("//a[text()='Sign in']")).click();

		}

	}

}
