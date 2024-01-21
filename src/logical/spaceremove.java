package logical;

public class spaceremove {
	
	
	public static void main(String[] args) {
		
		String input="tomorrow1 2 3";
	String count="";
	
	String ff="";
		
		for(int i=0; i<=input.length()-1; i++) {
			
			
			char jj = input.charAt(i);
			if(jj==' '||jj+(i+2)==' ') {
				
				count=count+"@";
				
				System.out.print(count);
				
			}
			
		
		else {
			
			System.out.print(jj);
			
		}
	}
	}

}
