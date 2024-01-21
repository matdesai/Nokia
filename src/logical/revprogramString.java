package logical;

public class revprogramString {

	
	public static void main(String[] args) {
		
		String name ="may name is matin";
		
		String ar[]= name.split(" ");
		
		for(int i=0; i<=ar.length-1; i++) {
			
			String name1=ar[i];
			
			String rev="";
			
			for(int j=name1.length()-1; j>=0; j--) {
				
				rev=rev+name1.charAt(j);
				
			}
			if(i%2==0) {
				
				System.out.print(rev+" ");
			}
			else {
				
				System.out.print(name1+" ");
			}
		}
	}
}
