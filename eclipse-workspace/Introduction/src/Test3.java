import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//*[@ -ngcontent-bnm-c18 routerlinkactive = 'current']/following-sibling::[li3]")).click();
		//driver.findElement(By.xpath("//div[@ class='gb_je gb_i gb_Hg gb_xg']/div[2]/a")).click();
		//driver.findElement(By.xpath("//div[@ id='realbox-input-wrapper']/div/input")).sendKeys("emaill");
		//driver.findElement(By.xpath("//div[@ class='ntp-contents']/div[7]/div")).click();
		//driver.findElement(By.xpath("//div[@ class='gb_Rc']/div/div/div/svg")).click();
		//driver.findElement(By.xpath("//div[@ class='gb_4e gb_Hg gb_i']/div/div/a")).click();
		
		
	}

}
