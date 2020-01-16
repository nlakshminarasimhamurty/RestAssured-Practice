package windowMaxminOperationRobotclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClassWindowsMaxMin {
	/*
	 * Test cases is Written how to maximize,minimize,pre-maximized state,close the
	 * Browser using Robot Class
	 * 
	 */
	static WebDriver driver;
	static Robot r;

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://www.google.com";

	public static void main(String[] args) {
		// launch the browser

		driver = new FirefoxDriver();

		// Enter the URl

		driver.get(URL);

		// key press events for pre-maximized state

		preMaximize();

		// key press events for maximized state

		maxiMize();

		// key press events for minimize state

		miniMize();

		// close the Browser

		driver.close();

	}

	public static void preMaximize() {
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_R);
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_R);
			Thread.sleep(3000);
		} catch (Exception e) {

		}

	}

	public static void maxiMize() {
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_X);
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_X);
			Thread.sleep(3000);
		} catch (Exception e) {

		}

	}

	public static void miniMize() {
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_N);
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_N);
			Thread.sleep(3000);
		} catch (Exception e) {

		}

	}

}
