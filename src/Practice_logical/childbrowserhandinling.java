package Practice_logical;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserhandinling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		Thread.sleep(3000);
		
		
		Set<String> setvalue = driver.getWindowHandles();
		
		ArrayList<String> mainid = new ArrayList<String>(setvalue);
		
		
		System.out.println(mainid);
		
		
		driver.switchTo().window(mainid.get(1));// child window id
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='menu-item-text'])[22]")).click();
	}
}
