import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gridtable2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/31633/aus-vs-ind-1st-odi-india-tour-of-australia-2020-21");
		WebElement cdriver=driver.findElement(By.xpath("//body/div[1]/div[2]/div[4]/div[2]/div[3]/div[1]"));
		int sum=0;
		int count=cdriver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i=0; i<count-2;i++)
		{
			System.out.println(cdriver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String value=cdriver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int fvalue=Integer.parseInt(value);
			sum=sum+fvalue;
			
		}
		 String esvalue=cdriver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText();
		 int evalue=Integer.parseInt(esvalue);
		 sum=sum+evalue;
		 
		 String tsvalue=cdriver.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText();
		 int tvalue=Integer.parseInt(esvalue);
		 if(sum==tvalue)
			 System.out.println("success");
		 else
			 System.out.println("failure");
			 
		 
		 

	}

}
