import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.Context.Key;

public class Yatra {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		Thread.sleep(1000);
		  WebElement origin = driver.findElement(By.xpath("//input[contains(@class,'required_field cityPadRight ac_input origin_ac')]"));
		  Thread.sleep(1000);
		origin.click();
		Thread.sleep(1000);
		origin.sendKeys("chen");
		Thread.sleep(1000);
		origin.sendKeys(Keys.DOWN.ENTER);
		
		WebElement des = driver.findElement(By.xpath("//input[contains(@class,'required_field cityPadLeft ac_input dest_ac')]"));
		
		  Thread.sleep(1000);
			des.click();
			Thread.sleep(1000);
			des.sendKeys("goa");
			Thread.sleep(1000);
			des.sendKeys(Keys.DOWN.ENTER);
			
			
//			driver.findElement(By.xpath("//input[@class='custom-date-input BE_flight_origin_date']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"01/01/2024\"]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	        
	}
}
