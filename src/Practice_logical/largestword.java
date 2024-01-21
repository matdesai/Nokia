package Practice_logical;

public class largestword {
	
	public static void main(String[] args) {
		
		
		String name="my name idfghfg";
		
		String[] ar = name.split(" ");
		
		int longestindex=0;
		
		String longestWord="";
		for(int i=0; i<=ar.length-1; i++) {
			//                         0
			if(ar[i].length()>longestindex) {
				
				longestWord=ar[i];
				longestindex=ar[i].length();
			}
			
			
			
		}
		
		System.out.println(longestWord);
		System.out.println(longestindex);
	}

}
