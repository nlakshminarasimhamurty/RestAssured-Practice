package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesAssignment {
	/*
	 * Test cases is Written For Nested Frames.
	 * 
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://the-internet.herokuapp.com/nested_frames";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {

		driver.get(URL);
		WebElement frameElement = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(frameElement);
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		// System.out.println(driver.findElement(By.xpath("//body[text()='BOTTOM']")).getText());

	}

}
