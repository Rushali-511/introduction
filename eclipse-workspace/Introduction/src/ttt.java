import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Agile Project']"))).build().perform();
		//a.doubleClick(driver.findElement(By.xpath("//a[text()='Bank Project']"))).build().perform();
		a.clickAndHold(driver.findElement(By.xpath("//a[text()='Insurance Project']"))).build().perform();
		a.contextClick(driver.findElement(By.xpath("//a[text()='Security Project']"))).build().perform();
		
		

	}

}
