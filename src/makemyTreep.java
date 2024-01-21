import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemyTreep {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.navigate().refresh();
		driver.switchTo().frame("notification-frame-~2514309a3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")).click();
		
		
		
		
		driver.switchTo().parentFrame();
	}
}
