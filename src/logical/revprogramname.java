package logical;

public class revprogramname {

	
	
	public static void main(String[] args) {
		
		String name="my name is matin";
		
	 String ar[]=name.split(" ");
		for(int i=0; i<=ar.length; i++) {
			
			String ss = ar[i];
			
			String rev="";
			
			
			for(int j=ss.length(); j>=0; j--) {
				
				rev=rev+ss.charAt(j);
				
				
			}
			    System.out.print(rev+" ");
		}
		
		
	}
}
