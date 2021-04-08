import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
driver.get("https://www.spicejet.com/");

driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.xpath("//a[@value='AMD']")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='ATQ']")).click();
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='ATQ']")).click();
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

{

System.out.println("its disabled");

Assert.assertTrue(true);

}

else

{

Assert.assertTrue(false);

}

driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult'] //option[@value='4']")).click();
driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency'] //option[@value='INR']")).click();
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();





	}

}
