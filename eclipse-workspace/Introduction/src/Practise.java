import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.cssSelector("a[href='reservation.php']")).click();
		driver.findElement(By.cssSelector("input[value='oneway']")).click();
		Select s=new Select(driver.findElement(By.cssSelector("select[name='passCount']")));
		s.selectByValue("3");
		
		Select s1=new Select(driver.findElement(By.cssSelector("select[name='fromPort']")));
		s1.selectByValue("London");
		
		Select s2=new Select(driver.findElement(By.cssSelector("select[name='fromMonth']")));
		s2.selectByVisibleText("August");
		Select s3=new Select(driver.findElement(By.cssSelector("select[name='fromDay']")));
		s3.selectByValue("18");
	
		driver.findElement(By.cssSelector("input[value='First']")).click();
		
		driver.findElement(By.cssSelector("input[name='findFlights']")).click();
		
		
		
		
		

	}

}
