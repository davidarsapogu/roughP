package paramtr_dependsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.github.dockerjava.api.model.Driver;

import testNGSuper.Base_Test;

public class ParametersDS extends Base_Test {


	@Test (groups = {"Electronics"})
	@Parameters({"TV", "Watch"})
	public void methodA(String name1, String name2) throws InterruptedException {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("name1");
		Thread.sleep(1000);

	}

	@Test (groups = {"Electronics"})
	@Parameters({"TV", "Watch"})
	public void methodB(String name1, String name2) throws InterruptedException {
		
		String vegName = name2;

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("name2");
		Thread.sleep(1000);

	}

}
