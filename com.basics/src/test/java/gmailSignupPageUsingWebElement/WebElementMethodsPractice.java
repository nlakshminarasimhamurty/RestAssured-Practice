package gmailSignupPageUsingWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethodsPractice {
	/*
	 * Test cases is Written for create an account of gmail application
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://www.google.com";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws InterruptedException {

		// Enter URL

		driver.get("https://accounts.google.com/signup");

		// Find the Element
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Naveen");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Kumar p");
		driver.findElement(By.cssSelector("#username")).sendKeys("glnaveen06@gmail.com");
		driver.findElement(By.name("Passwd")).sendKeys("man1234567#123");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("man1234567#123");
		driver.findElement(By.xpath("//span[@class='JIzqne IMVfif']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}

}
