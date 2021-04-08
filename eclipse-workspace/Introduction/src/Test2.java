import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver.get("https://login.salesforce.com");
		//driver.findElement(By.id("username")).sendKeys("helloworld");
       // driver.findElement(By.name("pw")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("pass");
        //driver.findElement(By.cssSelector("div#username_container")).sendKeys("emialll");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("pass");
		//driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		//driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[3]/a")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
		
	}

}
