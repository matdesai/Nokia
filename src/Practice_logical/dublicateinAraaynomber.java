package Practice_logical;

public class dublicateinAraaynomber {
	
	public static void main(String[] args) {
		
		int ll []= {1,3,2,4,5,6,4};
		for(int i=0; i<=ll.length-1; i++) {
			
			for(int j=i+1 ; j<=ll.length-1; j++) {
				
				
				if(ll[i]==ll[j]) {
					
				System.out.println(ll[j]);	
				}
			}
			
		}
		
		
		
		
	}

}
