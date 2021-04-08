package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test got started ");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test got passed ");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test got failed ");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		;
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("start ");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("finfish ");
		
	}
	
	

}
