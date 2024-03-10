package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import facebook.BaseTest_FB;

public class Listeners extends BaseTest_FB implements ITestListener {

	public void onStart(ITestContext context) {

		//log.info("Test context: " + context.getOutputDirectory());

	}

	public void onTestStart(ITestResult result) {

		//log.info("Test Started: " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {

		//log.info("Test Succefull: " + result.getName());

	}

	public void onTestFailure(ITestResult result) {

		//log.error("Test Failed: " + result.getName());

	}

	public void onTestSkipped(ITestResult result) {

		//log.info("Test Skipped: " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		//log.error("Test Success Percentage: " + result.getName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);

		//log.error("Test Failed With Timeout: " + result.getName());

	}

	public void onFinish(ITestContext context) {

		//log.info("This is On Finish Method: " + context.getPassedTests());
		//log.info("This is On Finish Method: " + context.getFailedTests());

	}

}
