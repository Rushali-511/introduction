package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import alpha.Demo1;

public class Demo {

	private static Logger log =LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		log.info("Now proceeding to jquery");
     driver.get("http://jqueryui.com/demos/droppable/");
   log.debug("Getting the frames count");
    System.out.println(driver.findElements(By.tagName("iframe")).size());
	}

}
