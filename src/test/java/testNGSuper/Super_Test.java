package testNGSuper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class Super_Test extends Base_Test {


	@Test (dependsOnMethods = "methodC") //(groups = {"Electronics"})
	public void methodA() throws InterruptedException {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		Thread.sleep(1000);

	}

	@Test //(groups = {"Electronics"})
	public void methodB() throws InterruptedException {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Head Phones");
		Thread.sleep(1000);

	}
	
	@Test //(groups = {"Electronics"})
	public void methodC() throws InterruptedException {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Charger");
		Thread.sleep(1000);
	}

}
