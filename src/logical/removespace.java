package logical;

public class removespace {
	
	
	public static void main(String[] args) {
		
		
			String name="t o   m   orow";
			
			
			String rev="";
			
			for(int i=0; i<=name.length()-1; i++) {
				
				char ch = name.charAt(i);
				
				if(ch=='o') {
					
					rev=rev+"-";
					
					System.out.print(rev);
				}
				
				else {
					
					System.out.print(ch);
				}
			}
			
			
			
		
	}

}
