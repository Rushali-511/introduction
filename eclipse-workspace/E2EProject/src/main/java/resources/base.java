package resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class base {
	public Properties prop;
	static public WebDriver driver;
	public WebDriver InitializeDriver() throws IOException
	{
	prop=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	
	String browsername=prop.getProperty("browser");
	 
	if(browsername.contains("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		if(browsername.contains("headless"))
		{
			options.addArguments("headless");
		}
		driver =new ChromeDriver(options);
		
		
	}
	else if(browsername=="firefox")
	{
		
	}
	else if(browsername=="IE")
	{
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	
	
	public void getScreenShotPath() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src= (File) (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
		FileUtils.copyFile(src,new File("D:\\screenshot.png"));
}
}