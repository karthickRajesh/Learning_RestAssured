package listeners;

import org.apache.logging.log4j.ThreadContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// Set test name in log context
		ThreadContext.put("testName", result.getMethod().getMethodName());
	}

	public void onTestSucess(ITestResult result) {
		ThreadContext.clearAll();
	}

	public void onTestFailure(ITestResult result) {
		ThreadContext.clearAll();
	}

}
