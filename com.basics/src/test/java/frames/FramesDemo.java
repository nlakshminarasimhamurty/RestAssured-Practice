package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {
	/*
	 * Test cases is Written For frames concept.
	 * 
	 * 
	 */

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://jqueryui.com";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {

		driver.get(URL);

		WebElement droppableBtn = driver.findElement(By.xpath("//a[text()='Droppable']"));

		Actions act = new Actions(driver);

		act.moveToElement(droppableBtn).click().build().perform();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		// driver.switchTo().frame("demo-frame");

		WebElement dragableElement = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement dropableElement = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(dragableElement, dropableElement).build().perform();

	}

}