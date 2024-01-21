import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d= new ChromeDriver();
		d.get("https://www.ixigo.com/?utm_source=Google_Search&utm_medium=paid_search_google&utm_campaign=Generic_Search_Desktop_Sept&gad_source=1&gclid=CjwKCAiAp5qsBhAPEiwAP0qeJvxVkAuKavqjl2C67wElSgw4qOwXdIySi4xKhnp1Z1FnURo4_-dMWxoCsm4QAvD_BwE");
		
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.navigate().refresh();
		Thread.sleep(6000);
		//d.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]/div[2]")).click();
		d.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[4]/div/div[1]/div/div")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[4]/div/div[1]/div/input")).click();
	//	(//table[@class='rd-days'])[1]
		String year="2023";
		String month="December";
		String date="28";
		
		Thread.sleep(1000);
		while(true) {
			
			
			String monthyear = d.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
	
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			if(mon.equals(month)&&yr.equalsIgnoreCase(year))
                 break;
                 
                 else {
                	 d.findElement(By.xpath("//button[@fdprocessedid='81j9i8']")).click();
                	 
                	 
                	 
                	 
                 }
			Thread.sleep(2000);
			
			List<WebElement> alldate = d.findElements(By.xpath("(//table[@class='rd-days'])[1]"));
			for(WebElement dt:alldate) {
				
				String dat=dt.getText();
				
				if(dat.equals(date)) {
					
					dt.click();
					break;
				}
			}
		}
		
	}

}
