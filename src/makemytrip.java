import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class makemytrip {
	
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.navigate().refresh();
		//driver.switchTo().frame("notification-frame-~2514309a3");
		Thread.sleep(1000);
		//.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		
		
		
		
	//	driver.switchTo().parentFrame();
		  WebElement origin = driver.findElement(By.xpath("(//input[@class='fsw_inputField lineHeight36 latoBlack font30'])[1]"));
		  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		  wait.until(ExpectedConditions.visibilityOf(origin));
		origin.sendKeys("mum");
		Thread.sleep(2000);
		origin.sendKeys(Keys.ARROW_DOWN);
		origin.sendKeys(Keys.ARROW_DOWN);
		
		origin.sendKeys(Keys.ARROW_DOWN);
		origin.sendKeys(Keys.ARROW_DOWN);
		origin.sendKeys(Keys.ARROW_DOWN);
		origin.sendKeys(Keys.ARROW_DOWN);
		origin.sendKeys(Keys.ARROW_DOWN);
//		origin.click();
//		Thread.sleep(2000);
//		origin.sendKeys("chen");
//		Thread.sleep(1000);
//		origin.sendKeys(Keys.ARROW_DOWN.ENTER);
//		
//		WebElement des = driver.findElement(By.xpath("//input[contains(@class,'required_field cityPadLeft ac_input dest_ac')]"));
//		
//		  Thread.sleep(1000);
//			des.click();
//			Thread.sleep(1000);
//			des.sendKeys("goa");
//			Thread.sleep(1000);
//			des.sendKeys(Keys.DOWN.ENTER);
	        
	

	}

}
