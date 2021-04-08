import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gridtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/31633/aus-vs-ind-1st-odi-india-tour-of-australia-2020-21");
		WebElement cdriver=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int sum=0;
		int count=cdriver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		System.out.println(count);
		for( int i=0;i<count-2;i++)
		{
			System.out.println(cdriver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String value=cdriver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueinteger=  Integer.parseInt(value);
			sum=sum+valueinteger;	
		}
            String finalv=cdriver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div" )).getText();
            int finalvalue=Integer.parseInt(finalv);
            sum=sum+finalvalue;
            
            String total=cdriver.findElement(By.xpath("//div[text()='Total'] /following-sibling::div" )).getText();
            int totalvalue=Integer.parseInt(total);
            
            if(sum==totalvalue) 
            	System.out.print("success");
            else
            	System.out.print("failed");	
            	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
	}

}
