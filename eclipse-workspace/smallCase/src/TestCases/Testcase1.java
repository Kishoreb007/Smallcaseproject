package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageClass.Amazon;
import PageClass.flipkart;

public class Testcase1 {

	@Test
	public void start() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\ACCENTURE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		flipkart s = new flipkart(driver);
		Amazon a = new Amazon(driver);
		s.flipkartsearch("https://www.flipkart.com/");

		a.amazonsearch("https://www.amazon.in/");

	}
}
