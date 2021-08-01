package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageClass.flipkart;

public class Amazon {

	WebDriver driver;

	public Amazon(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	public WebElement stextbox;

	@FindBy(xpath = "//*[@id='nav-search-submit-button']")
	public WebElement searchbutton;

	@FindBy(xpath = "(//*[@class='sg-row'][2]//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	public WebElement item1;

	@FindBy(xpath = "//*[@id='priceblock_ourprice']")
	public WebElement item1price;

	@FindBy(xpath = "//*[@class='_36yFo0']")
	public WebElement pincodetext;

	@FindBy(xpath = "//*[@id='add-to-cart-button']")
	public WebElement addcart;

	public void waitTillPageLoad(int timeout) throws InterruptedException {
		Thread.sleep(timeout);
	}

	public void amazonsearch(String URL) throws Exception {
		try {

			driver.get(URL);
			driver.manage().window().maximize();
			int flipkartvalue = 25000;
			WebDriverWait wait = new WebDriverWait(driver, 50);
			stextbox.sendKeys("vu tv");
			waitTillPageLoad(1000);
			searchbutton.click();
			waitTillPageLoad(1000);
			item1.click();
			waitTillPageLoad(1000);
			String amazonprice = item1price.getText();
			int amazonvalue = Integer.parseInt(amazonprice);
			System.out.println(amazonvalue);
			waitTillPageLoad(1000);
			addcart.click();

			if (flipkartvalue > amazonvalue) {
				System.out.println("Amazon is cheaper than Flipkart");
			} else
				System.out.println("Flipkart is cheaper than Amazon");

		} catch (Exception e) {
			throw e;
		}
	}
}
