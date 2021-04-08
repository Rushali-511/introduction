package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.*;

public class Demo {

	private static Logger log =LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		log.info("Now proceeding to amazon");
		driver.get("https://www.amazon.com/");
		log.error("Now highlighting accounts");
		driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']//span[@class='nav-icon nav-arrow nav-caret']"));
		log.error("clicing orders");
		driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']")).click();
		
		
	}

	
}
