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

public class Super_Two extends Base_Test {

	@Test (groups = {"Fashion"})
	public void methodD() throws InterruptedException {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirt");
		Thread.sleep(1000);

	}

	@Test (groups = {"Fashion"})
	public void methodE() throws InterruptedException {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pant");
		Thread.sleep(1000);

	}

}
