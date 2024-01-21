package Practice_logical;

public class couuntspace {
	
	
	public static void main(String[] args) {
		
		String name= "jdfbvvjkdf          efjviohfv";
		int count = 0;
		for(int i=0; i<=name.length()-1; i++) {
			
			char hh = name.charAt(i);
			
			if(hh==' ') {
				
				
				count++;
			}
		}
		System.out.println(count);
	}

}
