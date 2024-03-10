package page_object_model;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterLinks {

	WebDriver driver;

	public FooterLinks(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	// footer links
	@FindBy(xpath = "(//a[@class=\"HlWMPX\"])[1]")
	private WebElement ContactUs;

	@FindBy(xpath = "//a[contains(text(),'Payments')]")
	private WebElement Payments;

	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement AboutUs;

	public WebElement getContactUs() {
		return ContactUs;
	}

	public WebElement getPayments() {
		return Payments;
	}

	public WebElement getAboutUs() {
		return AboutUs;
	}

}
