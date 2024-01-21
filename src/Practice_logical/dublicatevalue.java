package Practice_logical;

public class dublicatevalue {
	
	public static void main(String[] args) {
		
		int ar1[]= {1,2,3,4,5,6,6,7,1};
		
		for(int i=0; i<=ar1.length-1; i++) {
			
			for(int j=i+1; j<=ar1.length-1; j++) {
				    
				
				if(ar1[i]==ar1[j]) {
					
					System.out.println(ar1[i]);
				
				
				}
			}
		}
		
	}

}
