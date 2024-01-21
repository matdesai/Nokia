package Practice_logical;

public class count_no_of_vovels {
	
	
	public static void main(String[] args) {
		
		String name="My name is Matin";
		
		int count=0;
		for(int i=0; i<=name.length()-1; i++) {
			
			
			char ch=name.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				count++;
			}
		}
		
		System.out.println(count);
	}

}
