package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtenetReporterNG;
import resources.base;

public class Listeners extends base implements ITestListener {
	ExtentTest test;
	ExtentReports extent;
	ThreadLocal<ExtentTest> th=new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub\
		 extent=ExtenetReporterNG.getReportObject();
		 	
	test=extent.createTest(result.getMethod().getMethodName());
	th.set(test);
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	th.get().log(Status.PASS, "PASSED");
		
	}

	public void onTestFailure(ITestResult result) {
		WebDriver driver =null;
		String testMethodName =result.getMethod().getMethodName();
		th.get().fail(result.getThrowable());
		
		try {
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch(Exception e)
		{
			
		}
		
		//th.get().addScreenCaptureFromPath( getScreenShotPath(testMethodName,driver),result.getMethod().getMethodName());
		
		System.out.println("faileddd");
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		
	}

	

	
	
	
}
