package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkart {

	WebDriver driver;

	public flipkart(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@name='q']")
	public WebElement stextbox;

	@FindBy(xpath = "//*[@type='submit']")
	public WebElement searchbutton;

	@FindBy(xpath = "//*[@class='_3pLy-c row']/div[1]/descendant::div[1]")
	public WebElement item1;

	@FindBy(xpath = "//*[@class='_30jeq3 _16Jk6d']")
	public WebElement item1price;

	@FindBy(xpath = "//*[@class='_36yFo0']")
	public WebElement pincodetext;

	@FindBy(xpath = "//*[@class='hivXmn FoGye7']//span[1]")
	public WebElement pincodechange;

	@FindBy(xpath = "//*[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	public WebElement pincodech;

	@FindBy(xpath = "//*[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")
	public WebElement addcart;

	@FindBy(xpath = "//*[@class='_2KpZ6l _2doB4z']")
	public WebElement closepopup;

	public void waitTillPageLoad(int timeout) throws InterruptedException {
		Thread.sleep(timeout);
	}

	public void flipkartsearch(String URL) throws Exception {
		try {

			driver.get(URL);
			driver.manage().window().maximize();

			WebDriverWait wait = new WebDriverWait(driver, 50);
			closepopup.click();
			stextbox.sendKeys("vu tv");
			waitTillPageLoad(1000);
			searchbutton.click();
			waitTillPageLoad(1000);
			item1.click();
			waitTillPageLoad(1000);
			String flipkartprice = item1price.getText();
			int flipkartvalue = Integer.parseInt(flipkartprice);
			waitTillPageLoad(1000);
			System.out.println(flipkartvalue);
			waitTillPageLoad(1000);
			pincodetext.sendKeys("641042");
			waitTillPageLoad(1000);
			pincodechange.click();
			waitTillPageLoad(1000);
			addcart.click();
		} catch (Exception e) {
			throw e;
		}

	}

}
