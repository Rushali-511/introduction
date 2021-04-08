import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-jpg");
		driver.findElement(By.xpath("//span[contains(text(),'Choose File')]"));
		Runtime.getRuntime().exec("C:\\Users\\rushali rathore\\Desktop\\script.exe");
		
	}

}
