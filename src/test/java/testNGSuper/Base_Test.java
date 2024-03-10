package testNGSuper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Network.UserAgent;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_object_model.FooterLinks;
import page_object_model.HomePage;

public class Base_Test {

	public WebDriver driver;
	Properties prop;
	FileInputStream fis;
	
	
	public HomePage homepageobj;
	public FooterLinks footobj;
	

	@BeforeClass(groups = { "Electroics", "Fashion" })
	public void beforeClass() throws IOException {

		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
		prop.load(fis);

		if (prop.getProperty("browser").equals("Chrome")) {

			driver = new ChromeDriver();
		}

		else if (prop.getProperty("browser").equals("Edge")) {

			driver = new EdgeDriver();
		}

		else if (prop.getProperty("browser").equals("Firefox")) {

			driver = new FirefoxDriver();
		}

		else {

			System.out.println("Browser Not Supported");
		}

		driver.manage().window().maximize();
		
		homepageobj = new HomePage(driver);
		footobj = new FooterLinks(driver);

	}

	@BeforeMethod(groups = { "Electroics", "Fashion" })
	public void beforeMethod() {
		driver.get(prop.getProperty("url"));
	}

	@AfterClass(groups = { "Electroics", "Fashion" })
	public void afterClass() {
		driver.quit();

	}
}
