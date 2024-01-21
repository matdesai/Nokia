package logical;
import java.util.ArrayList;

public class start5any_arry {

	public static void main(String[] args)
	{
	
		int []ar= {1,4,5,6,54,34,23,59,2,3};

		System.out.println("== == == == ==  Element starting with 5 or 59 or 54 == ==   == === === ==  == ==");
	
	
	for(int num:ar)
		
	{
			String strnum=String.valueOf(num);
		if(strnum.contains("5")) {

			System.out.println(strnum);
		}

		
		else {

		}
		
		for(int num1:ar) {
			
			String strnum2 = String.valueOf(num1);
			
			if(strnum2.contains("6")) {
			
			
			}
		}
	
		}
//		for(int num1:ar)
//		{
//			String strnum=String.valueOf(num1);
//
//		String j = strnum.replace("5","");
//		
//		System.out.println(j);
//	}
		
		
}}