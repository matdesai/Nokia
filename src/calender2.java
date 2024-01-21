import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.farecompare.com/flights/Jet_Airways-9W/airline.html?ux=rdc2f&utm_source=google&utm_medium=cpc&utm_campaign=pmax_flights&utm_term=&gclid=Cj0KCQiAy9msBhD0ARIsANbk0A_s7mX9Ex3CxCklz-km0kV1Owk2JDmGtWw9K66QHZ_yFECRXiWDZV8aAkevEALw_wcB");
		Thread.sleep(2000);
	//	driver.findElement(By.cssSelector("span[id='salePopupCloseBtn']")).click();
		
		driver.findElement(By.xpath("//input[@id='depart-date']")).click();
		Thread.sleep(4000);

		
		List<WebElement> wb = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@aria-disabled='false']"));
		
	//	String month=""

	
//	if()
	}

}
