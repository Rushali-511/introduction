import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javadom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		//System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		Thread.sleep(2000);
		
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTATION AIRPORT"))
		{
				i++;
				driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
				text=(String) js.executeScript(script);
				System.out.println(text);	
				if(i>8)
				{
					break;
				}
		}
			if(i>8)
				System.out.println("not found");
			else
				System.out.println("found");
		}	
	}


