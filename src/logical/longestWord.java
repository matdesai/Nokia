package logical;

public class longestWord {
	
	public static void main(String[] args) {
		
		String name="my xbsbsgngb name is apur";
		
		String ar[]=name.split(" ");
		
		String rev="";
		
		for(int i=0; i<=ar.length-1; i++) {
			String lov=ar[i];
			if(lov.length()>rev.length()) {
				
				rev=ar[i];
			}
		}
		
		System.out.println(rev);
	}

}
