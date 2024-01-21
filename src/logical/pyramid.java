package logical;

public class pyramid {
	
	public static void main(String[] args) {
		
		int star=1;
		int space=10;
		int char1=65;
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=space; j++) {
				
				System.out.print(" ");
			}
			
			for(int j=1; j<=star; j++) {
				
				System.out.print((char)char1+++" ");
			}
			
			System.out.println();
			
			star=star+1;
			space--;
		}
	}

}
