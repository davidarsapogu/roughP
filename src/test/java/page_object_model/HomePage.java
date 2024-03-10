package page_object_model;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement SearchBox;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement Login;

	@FindBy(xpath = "//a[contains(text(),'Cart')]")
	private WebElement Cart;

	@FindBy(xpath = "//a[contains(text(),'Become a Seller')]")
	private WebElement BecomeSeller;

	public WebElement getSearchBox() {
		return SearchBox;
	}

	public void setSearchBox(String name) {
		this.SearchBox.sendKeys(name);

	}	

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getCart() {
		return Cart;
	}

	public WebElement getBecomeSeller() {
		return BecomeSeller;
	}

}
