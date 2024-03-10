package facebook;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.util.EventListener;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.events.EventFiringDecorator;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.File;

import com.github.dockerjava.api.model.Driver;

import listener.Event_Listener;
import log4j.LogFile_Impl;
import page_object_model.HomePage;

public class BaseTest_FB {

	WebDriver driver;

	public Home_Page homepageobj;
	

	// public Logger log = LogManager.getLogger(LogFile_Impl.class.getName());

	// extent Reporting
	public static ExtentReports extent;
	public static ExtentTest extentlogger;

//	Properties prop;
//	FileInputStream fis;

	@BeforeTest
	public void testbefore() {
		extent = new ExtentReports(System.getProperty("user.dir") + "\\report.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\target\\extent-config.xml"));

	}

	@BeforeClass
	public void openBrowser() throws FileNotFoundException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//Hide Browser while running the test cases 
		//options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
		

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

//		// class file which we created in above step
		// Event_Listener ecapture = new Event_Listener();
//
//		// pass the driver to EventFiringWebDriver
//		EventFiringDecorator<WebDriver> eventHandler = new EventFiringDecorator<WebDriver>(driver);
//		
//
//		// pass ecapture tp eventHandler
//		eventHandler.register(ecapture);

		homepageobj = new Home_Page(driver);
		

//		prop = new Properties();
//		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
		
		
	}

	@BeforeMethod
	public void navigateBrowser() {
		driver.get("https://www.facebook.com/");

	}

	@AfterMethod
	public void afterMethod() {
		extent.endTest(extentlogger);
		extent.flush();
		

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
		

	}

	@AfterTest
	public void testAfter() {	
		extent.close();

	}
 

}
