package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListeners is a interface which implements TestNg Listeners
public class Listeners implements ITestListener {

	
	@Override
    public void onStart(ITestContext context) {
//        System.out.println("Test Suite started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
//        System.out.println("Test Suite finished: " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
//        System.out.println("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("I successfully executed listeners Pass Code " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
//        System.out.println("Test failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
//        System.out.println("Test skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Not implemented in this example
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        // Not implemented in this example
    }

    public void onConfigurationSuccess(ITestResult result) {
        // Not implemented in this example
    }

    public void onConfigurationFailure(ITestResult result) {
        // Not implemented in this example
    }

    public void onConfigurationSkip(ITestResult result) {
        // Not implemented in this example
    }
}
