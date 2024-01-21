package logical;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class list_Box {

	
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//span[contains(@role,'button')]")).click();
		Thread.sleep(3000);
		List<WebElement> dd = driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
		Actions act = new Actions(driver);
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("shoes");
	driver.findElement(By.xpath(""));
	
	}
}


