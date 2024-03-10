package facebook;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import jdk.internal.org.jline.utils.Log;

public class Home_TestCases extends BaseTest_FB {
	@Test
	public void homePage_Test001() {
		String testCaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentlogger = extent.startTest(testCaseId, "Test Started");
		
	
		String hompageText = homepageobj.getFbHelpsText().getText();
		String actualText = "Facebook helps you connect and share with the people in your life.";
		
		//extentlogger.log(LogStatus.INFO, "Validate Home Page part2");
		
		extentlogger.log(LogStatus.INFO, "Validate HOme Page Part1");
		Assert.assertEquals(hompageText, actualText);
		
		extentlogger.log(LogStatus.PASS, "TestCase Passed");

	}

	@Test
	public void homePage_Test002() {
		String testCaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentlogger = extent.startTest(testCaseId, "Test Started");

		String expectedText = homepageobj.createPageText.getText();
		String actualText = "Create a Page for a celebrity, brand or business.";
		
		extentlogger.log(LogStatus.INFO, "Validate HOme Page Part2");
		Assert.assertEquals(expectedText, actualText);
		
		extentlogger.log(LogStatus.PASS, "TestCase Passed");

//		if (expectedText.equals(actualText)) {
//
//			log.info("homePage_Test002 passed");
//			Assert.assertTrue(true);
//
//		}
//
//		else {
//
//			log.error("homePage_Test002 Failed");
//			Assert.assertTrue(false);
//
//		}
	}

}
