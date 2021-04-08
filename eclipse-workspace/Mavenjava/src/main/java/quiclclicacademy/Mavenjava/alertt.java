package quiclclicacademy.Mavenjava;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertt {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String downloadPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://smallpdf.com/pdf-to-jpg");
		driver.findElement(By.xpath("//span[contains(text(),'Choose File')]")).click();
		System.out.println("nxugrit");
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\rushali rathore\\Desktop\\script.exe");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='kov65o-0 iPohUv'] //div[@class='sc-6ytb27-0 clQFqQ'][1]")));
		driver.findElement(By.xpath("//div[@class='kov65o-0 iPohUv'] //div[@class='sc-6ytb27-0 clQFqQ'][1]")).click();
		driver.findElement(By.xpath("//button[@class='sc-1mvwhop-0 hKtorq']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Download')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Download')]")).click();
		Thread.sleep(5000);
		File f=new File(downloadPath+"/converted.zip");
		if(f.exists())
		{
			f.delete();
			System.out.println("file is deleted");
			
		}
		
	}
}
