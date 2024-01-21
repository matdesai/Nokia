import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calender3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/index.en-gb.html?aid=2311236;label=en-in-booking-desktop-CmH43mrsjzqEEFQPgVycoAS652796016141:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-65526620:lp1007783:li:dec:dm;ws=&gad_source=1&gclid=CjwKCAiAyp-sBhBSEiwAWWzTnqyyi7IU6F2fdH3Mp2IGxNWCZ0MWvZgd0YsW_Y_OmeJ4TLqy1aFKDhoCKY0QAvD_BwE");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
	   	driver.navigate().refresh();
		//driver.findElement(By.xpath(""))
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[21]/div/div/div/div[1]/div[1]/div/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"b2indexPage\\\"]/div[21]/div/div/div/div[1]/div[1]/div/button")));
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]")).click();
		//String cheakmonth="June 2024";
		//String dateval="15";
		//Thread.sleep(2000);
	
//		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("window.scrollBy(0,300)");
//		Thread.sleep(1000);
		
		
		
		
		driver.findElement(By.xpath("(//button[@class='ebbedaf8ac ab26a5d2bd e33c97ff6b'])[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='ebbedaf8ac ab26a5d2bd e33c97ff6b'])[1]")));
	
String monthtext = driver.findElement(By.xpath("(//h3[@class='e1eebb6a1e ee7ec6b631'])[1]")).getText();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[@class='e1eebb6a1e ee7ec6b631'])[1]")));

System.out.println(monthtext);
		
		
	}

}
