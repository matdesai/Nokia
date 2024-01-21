package logical;

public class withaut_lenght_rev {

	
	public static void main(String[] args) {
		
		
		String as="desai";
		
		
		String rev="";
		
		int count =0;
		
		char ar[]=as.toCharArray();
		
		for(char ll:ar) {
			
			count++;
		}
		
		for(int i=count-1; i>=0; i--) {
			
			rev = rev+as.charAt(i);
		}
		
		
		System.out.println(rev);
	}
	
}
