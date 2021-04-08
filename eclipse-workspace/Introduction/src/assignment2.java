import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		driver.findElement(By.xpath("//select[@id='Adults'] //option[@value='4']")).click();
		driver.findElement(By.xpath("//select[@id='Childrens'] //option[@value='5']")).click();
		driver.findElement(By.xpath("//select[@id='Infants'] //option[@value='0']")).click();
		driver.findElement(By.xpath("//input[@id='DepartDate']"));
		//driver.findElement(By.xpath("//a[@id='ui-state-default.ui-state-highlight.ui-state-active']")).click();
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
			
		
	
		
		
		
		
	}

}
