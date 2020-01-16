package locatorsPracticeFbPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegularExpressionXpathAndCSS {
	/*
	 * Test cases is Written For Regular Expression fox path and CSS.
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://www.rediff.com";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		driver.get(URL);
		
		//using contains functions
		//driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		//using ends with function
		//driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		// using starts with function
		
		//driver.findElement(By.cssSelector("a[title^='Sign in']")).click();
		
		// using Xpath with contains opertaion
		
		//driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();

		// using starts with function in Xpath
		
		driver.findElement(By.xpath("//a[starts-with(@title,'Already')]")).click();
		
		// using Ends With function
		
		//driver.findElement(By.xpath("//a[ends-with(@title,'Sign in')]")).click();

		
		
	}

}
