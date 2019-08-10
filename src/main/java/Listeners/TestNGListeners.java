package Listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	
	public WebDriver driver;
	
	//Class Constructor
	public TestNGListeners(WebDriver driver) {
		this.driver = driver;
	}
	

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
   
	public void onTestSuccess(ITestResult result) {
		System.out.println("Listener - Test Passed!" + result.getName());
		driver.getCurrentUrl();
		
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Listener - Test Failed!" + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Listener - Test Failed!" + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Listener - Test Failed!" + result.getName());

	}

	public void onStart(ITestContext context) {
		System.out.println("Listener - Test Failed!" + context.getName());

	}

	public void onFinish(ITestContext context) {
		System.out.println("Listener - Test suite finished!" + context.getName());
		
	}

}
