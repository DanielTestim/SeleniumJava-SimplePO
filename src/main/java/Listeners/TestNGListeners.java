package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	
	
	public void onTestStart(ITestResult result) {
		System.out.println("Listener - onTestStart!" + " " + result.getName());	
	}
   
	public void onTestSuccess(ITestResult result) {
		System.out.println("Listener - onTestSuccess!" + " " + result.getName());	
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Listener - onTestFailure!"  + " " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Listener - onTestSkipped!" + " " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Listener - onTestFailedButWithinSuccessPercentage!" + " " +  result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println("Listener - onStart!" + " " + context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Listener - onFinish!" + " " + context.getName());	
	}

}
