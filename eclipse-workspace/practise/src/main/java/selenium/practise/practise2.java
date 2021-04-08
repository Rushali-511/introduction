package selenium.practise;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class practise2 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		js.executeScript("document.getElementByxpath('//input[@class='_2IX_2- VJZDxU']').value='974877087'");
		js.executeScript("document.getElementByxpath('//input[@type='password']').value='kfbhefi'");
		//driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9340647992");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rushali@25");
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		js.executeScript("arguments[0].click()", loginbutton);
		js.executeScript("alert('ugricbutxu4rn');");
		js.executeScript("window.scrollBy(0,600");
		
		
		
		
		
		
		
	}
}
