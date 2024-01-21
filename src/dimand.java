
public class dimand {
	
	
	public static void main(String[] args) {
		
		int star=1;
		int space=10;
		
		int no=65;
		for(int i=0; i<=11; i++) {
			
			for(int j=1; j<=space; j++) {
				
				System.out.print(" ");
			}
			
			for(int j=1; j<=star; j++) {
				
				System.out.print((char)no+++"  ");
			}
			
			if(i<5) {
				star=star+2;
				space--;
				
			}
			
			else {
				
				star=star-2;
				space++;
			}
			
			System.out.println();
		}
	}

}
