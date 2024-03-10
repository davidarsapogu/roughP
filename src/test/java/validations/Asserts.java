package validations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import dev.failsafe.internal.util.Assert;

public class Asserts {

	WebDriver driver;
	Actions act; 

	@BeforeClass
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

	}

	@BeforeMethod
	public void navigateBrowser() {
		driver.get("https://www.amazon.in/");
	}

	@Test
	public void login() {

		act = new Actions(driver);

		WebElement login = driver.findElement(By.xpath("//a[@id='nav-link-accountList"));

		act.moveToElement(login).build().perform();

		driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();

		driver.findElement(By.xpath("//label[@class='a-form-label']")).sendKeys("david.arshapogu@gmai.com");

		driver.findElement(By.xpath("//input[@id='continue']")).click();

		driver.findElement(By.xpath("//input[@class='a-form-label']")).sendKeys("SarahEric@1823");

		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));

		// assert.assertEquals(false, false)

	}

}
