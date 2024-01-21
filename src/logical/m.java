package logical;

import java.util.Arrays;
import java.util.TreeSet;

public class m {
	
	public static void main(String[] args) {

	String name ="tomorrow";
	String rev ="";
	
	
	
	for(int i=0; i<=name.length()-1; i++) {
		
		if(name.charAt(i)=='o') {
			
			rev=rev+'@';
			
			System.out.print(rev+" ");
		}
		
		else {
			
			System.out.print(name.charAt(i));
		}
	}
		
		
	}

}
