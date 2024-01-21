package Practice;

public class upperandLowerCase {
	
	public static void main(String[] args) {
		
		String name="matA*ind@/%$R";
		
		int uppercount=0;
		int lowercount=0;
		int specialcount=0;
		for(int i=0; i<=name.length()-1; i++) {
			char m = name.charAt(i);
			
			
			if(name.charAt(i)==Character.toUpperCase(m)) {
				
				uppercount++;
			}
			
			else if(name.charAt(i)==Character.toLowerCase(m)) {
				
				lowercount++;
			}
			
			else {
				
				specialcount++;
			}
		}
		
		
		
		System.out.println("upper case"+uppercount);
		
		System.out.println("lower case "+lowercount);
		System.out.println("special count "+specialcount);
	}

}
