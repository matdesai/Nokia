import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calender {
	public static void main(String[] args) {
		
	
	WebDriver d= new ChromeDriver();
	

	d.get("https://www.amazon.in/s?k=iphone+15+pro+max&crid=OWA3LQFBKZIC&sprefix=iphone%2Caps%2C534&ref=nb_sb_ss_ts-doa-p_1_6");
	WebDriverWait f=new WebDriverWait(d, Duration.ofSeconds(20));
	f.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//span[contains(text(),'iPhone 15 Pro Max. Titanium')])[1]")));
String m = d.findElement(By.xpath("(//div[@class='puisg-row']//span[@class='a-size-base s-underline-text'])[1]")).getText();
System.out.println(m);
	
	}}
