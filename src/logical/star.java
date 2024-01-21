package logical;

public class star {
	
	
	//*
	//**
	//***
	//**
	//*
	
	
	public static void main(String[] args) {
		
		
		int star=1;
		int space=0;
		
		for(int i=1; i<=11; i++) {
			
			for(int j=1; j<=space; j++) {
				
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				
				System.out.print("*");
			
		
			}
			
		
			if(i<6) {
				
				star=star+2;
			}
			
			else {
				
				star=star-2;
			}
			System.out.println();
		}
		
		
		
	}

}
