import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class booking {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/index.en-gb.html?aid=2311236;label=en-in-booking-desktop-CmH43mrsjzqEEFQPgVycoAS652796016141:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-65526620:lp1007783:li:dec:dm;ws=&gad_source=1&gclid=CjwKCAiAyp-sBhBSEiwAWWzTnqyyi7IU6F2fdH3Mp2IGxNWCZ0MWvZgd0YsW_Y_OmeJ4TLqy1aFKDhoCKY0QAvD_BwE");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   	driver.navigate().refresh();
		//driver.findElement(By.xpath(""))
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[21]/div/div/div/div[1]/div[1]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]")).click();
		String cheakmonth="June 2024";
		String dateval="15";
		Thread.sleep(3000);
	
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		while(true) {
			
			String month=driver.findElement(By.xpath("(//h3[@class='e1eebb6a1e ee7ec6b631'])[1]")).getText();
			if(month.equals(cheakmonth)) 
			{break;
				
			}
			
			else {
				
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button[2]/span/span/svg")).click();
				}
			List<WebElement> ele = driver.findElements(By.xpath("//td[@class='b80d5adb18']"));
			Thread.sleep(1000);
			for(WebElement element:ele) {
				
				String date=element.getText();
				
				if(date.equals(dateval)) {
					
					element.click();
					break;
				}
				
				
			}
		}
		
		
		
		
	}
}
