package logical;

import java.util.Scanner;

public class logicalscanner {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("enter no =");
		
		String rev="";
		
		String k = scan.nextLine();
		
		for(int i=k.length()-1; i>=0; i--) {
			
			char ch = k.charAt(i);
			rev=rev+ch;
			
		}
		
		System.out.println(rev);
	
		
	}
}
