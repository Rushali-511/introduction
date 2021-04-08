import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignmentexplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait w = new WebDriverWait(driver,15);
		driver.findElement(By.xpath("//a[contains(text(), 'Click to load get data via Ajax!')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results'")));
		driver.findElement(By.xpath("//div[@id='results']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
		
	}

}
