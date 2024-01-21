package Practice_logical;

public class pyramid {
	
	public static void main(String[] args) {
		
		int star=10;
		int space=10;
		
		
		for(int i=0; i<=11; i++) {
			
			for(int j=0; j<=space; j++) {
				
				System.out.print(" ");
			}
			
			for(int j=0; j<=star; j++) {
				
				System.out.print("*");
			}
			
		
			
			if(i<5) {
				
				star=star-2;
				space++;
			}
			
			else {
				
				star=star+2;
				space--;
			}
			
			System.out.println();
		}
		
		
	}

}
