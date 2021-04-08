package resources;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtenetReporterNG {
	static ExtentReports extent;

	public static ExtentReports getReportObject()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("WEB AUTOMATION RESULTS");
		reporter.config().setDocumentTitle("Test rESULTS");
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "RahulShetty");
		return extent;
		
	}
}
