package logical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver vv = new ChromeDriver();
		vv.get("https://www.flipkart.com/");
		
		vv.findElement(By.xpath("/html/body/div[3]/div/span"));
		
	}

}
