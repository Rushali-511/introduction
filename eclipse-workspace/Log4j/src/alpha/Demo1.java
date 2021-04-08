package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.*;


public class Demo1 {
	private static Logger log =LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		log.info("Now proceeding to amazon");
		driver.get("https://www.amazon.com/");
		log.error("Now highlighting accounts");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")));
		log.debug("Now highlighting accounts");
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
	}

}
