import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Framess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/index.cfm?CFID=385119&CFTOKEN=5f5a16cd45357f42-55374478-0D00-82E6-12BE065AA0EEC693&jsessionid=a6303b4527e9101e707d1d32431306677461");
driver.findElement(By.name("username")).sendKeys("Rushali");
driver.findElement(By.name("password")).sendKeys("Rushu@9340");
driver.findElement(By.cssSelector("input[value='Login']")).click();

 driver.switchTo().frame("mainpanel");
	   driver.findElement(By.cssSelector("input[name='search']")).sendKeys("company");
	   Select s=new Select(driver.findElement(By.name("search_target")));
	   s.selectByVisibleText("Web");
	   driver.findElement(By.cssSelector("input[type='image']")).click();
	   
		
		
		
		
		
	}

}
