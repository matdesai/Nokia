package Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class sample1 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> mm = new ArrayList<String>();
		
		mm.add("kolhapur");
		mm.add("matin");
		mm.add("lappi");
		mm.add(null);
		mm.add(null);
		mm.add("matin");
		
		
		for( Object kk:mm) {
			
			System.out.println(kk);
		}
		
	}

}
