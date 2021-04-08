import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver.get("https://www.easemytrip.com/flights.html");
		driver.findElement(By.id("FromSector_show")).click();
		driver.findElement(By.id("spn3")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='toautoFill'] //span[@id='spn4']")).click();
		//driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight ui-state-active")).click();
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@id=glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
	}

}

