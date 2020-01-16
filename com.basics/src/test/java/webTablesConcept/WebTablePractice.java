package webTablesConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTablePractice {

	static {
		System.setProperty("webdriver.gecko.driver", ".//DriverExcutables\\geckodriver.exe");
	}
	static final String URL = "https://www.cricbuzz.com/live-cricket-scorecard/21972/kent-vs-gloucs-south-group-t20-blast-2019";
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		driver.get(URL);

		List<WebElement> runsScoredByIndividiual = driver.findElements(By.xpath(
				"(//div[@id='innings_2']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']"));
		int totalScore = 0;
		WebElement extraRun = driver.findElement(By.xpath(
				"(//div[@id='innings_2']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']"));
		for (int i = 0; i < runsScoredByIndividiual.size(); i++) {
			System.out.println(runsScoredByIndividiual.get(i).getText());
			totalScore = Integer.parseInt(runsScoredByIndividiual.get(i).getText()) + totalScore;

		}
		System.out.println(extraRun.getText());
		totalScore = totalScore + Integer.parseInt(extraRun.getText());
		System.out.println(totalScore);
	}

}
