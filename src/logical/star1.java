package logical;

public class star1 {
	
	public static void main(String[] args) {
		
		
		int star=7;
		
		int space=0;
		
		for(int i=1; i<=7; i++) {
			
			for(int j=1; j<=space; j++) {
				
				System.out.print(" ");
			}
			
			for(int j=1; j<=star; j++) {
				
				System.out.print("*");
			}
			
			if(i<4) {
				
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












