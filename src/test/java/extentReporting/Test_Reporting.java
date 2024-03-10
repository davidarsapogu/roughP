package extentReporting;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import facebook.BaseTest_FB;

public class Test_Reporting extends BaseTest_FB {

	
	@Test
	public void extentMethod() {
		String testCaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		
		extentlogger = extent.startTest(testCaseId, "test1 i am running");
		
		extentlogger.log(LogStatus.PASS, "text");
		extentlogger.log(LogStatus.FAIL, "text");
		extentlogger.log(LogStatus.INFO, "text");

	}
	



}
