
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("rushalirathore511@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("Rushu@9340");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		driver.findElement(By.cssSelector("input#email.inputtext._55r1._6luy")).sendKeys("emialll");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("pass");
		//driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[3]/a")).click();
		System.out.println(driver.findElement(By.cssSelector("error.loginError")).getText());
		
		
		
	}

}
