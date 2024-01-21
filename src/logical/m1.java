package logical;

public class m1 {
	
	public static void main(String[] args) {
		

	String name="matin desai";
	
	String[] lo = name.split(" ");
	for(int i=0; i<=lo.length; i++) {
		
		
		
		String ll=lo[i];
		
		String rev="";
		
		for(int j=ll.length()-1; j>=0; j--) {
			
			rev=rev+ll.charAt(j);
		}
		
		if(i%2==1) {
			
			System.out.print(rev+" ");
		}
		else {
			
			System.out.print(ll+" ");
		}
	}
	
		
	}

}
