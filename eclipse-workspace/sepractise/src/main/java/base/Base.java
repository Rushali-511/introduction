package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public Properties prop;
	public String browsername;
	public  WebDriver driver;
	public WebDriver Intializedriver () throws IOException
	{
		 prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\congif\\data.properties");
		prop.load(fis);
		 
		browsername=prop.getProperty("browser");
		if(browsername.contains("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			if(browsername.contains("headless"))
			{
				options.addArguments("headless");
			}
			 driver=new ChromeDriver(options);
				
		}
		
		if(browsername.contains("ie"))
		{
			
		}
		if(browsername.contains("firefox"))
		{
			
		}
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}


	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
		{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
		}
}


