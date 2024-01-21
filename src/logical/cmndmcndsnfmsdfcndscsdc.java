package logical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cmndmcndsnfmsdfcndscsdc {

	public static void main(String[] args) {
		
	//            0    1 
	String name="java langauge";
	
	
	String ar[]=name.split(" ");
	
	for(int i=0; i<=ar.length-1; i++) {

		String newname=ar[i];
		
		String rev="";
		
		for(int j=newname.length()-1 ; j>=0; j--) {
			
			rev=rev+newname.charAt(j);
		}
		
		
		if(i%2==1) {
			             System.out.print(rev+" ");
		}
		
		else {
			
			System.out.print(newname+" ");
			
			
			WebDriver mm = new ChromeDriver();
			
			mm.get("https://www.flipkart.com/");
			
			mm.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			
			
		}
	}
}}
