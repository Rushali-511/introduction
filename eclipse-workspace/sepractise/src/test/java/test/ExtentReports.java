package test;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports {

	
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("user.dir") + "reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		exreport.
		
	}
}
