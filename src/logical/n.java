package logical;

public class n {
	
	public static void main(String[] args) {
		


		String name="mat Desai";
		String[] pp = name.split(" ");
		for(int i=0; i<=pp.length-1; i++) {
			
			String str=pp[i];
			String rev="";
			
			for(int j=str.length()-1; j>=0; j--) {
				
				rev=rev+str.charAt(j);
			}

			
			if(i%2==0) {
				
				System.out.print(rev+" ");
			}
			else {
				
				System.out.print(str+" ");
			}
		}
		
		
	}

    }