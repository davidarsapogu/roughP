package facebook;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class Home_Page {
	
	WebDriver driver;
	
	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailBox;
	
	@FindBy(xpath = "//input[@class='inputtext _55r1 _6luy _9npi']")
	WebElement passwordBox;
	
	@FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[contains(text(),'Forgotten password?')]")
	WebElement forgotPassword;
	
	@FindBy(xpath = "//a[@id='u_0_0_uJ']")
	WebElement createNewAccount;
	
	@FindBy(xpath = "//h2[@class='_8eso']")
	WebElement fbHelpsText;
	
	@FindBy(xpath = "//img[@class='fb_logo _8ilh img']")
	WebElement fbLogoText;
	
	@FindBy(xpath = "//a[@class='_8esh']")
	WebElement createPage;
	
	@FindBy(xpath = "//div[@class='_58mk']")
	WebElement createPageText;
	

	public WebElement getEmailBox() {
		return emailBox;
	}

	public void setEmailBox(String value) {
		this.emailBox.sendKeys(value);
	}

	public WebElement getPasswordBox() {
		return passwordBox;
	}

	public void setPasswordBox(String value) {
		this.passwordBox.sendKeys(value);
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

	public WebElement getFbHelpsText() {
		return fbHelpsText;
	}

	public WebElement getFbLogoText() {
		return fbLogoText;
	}

	public WebElement getCreatePage() {
		return createPage;
	}
	
	
}
