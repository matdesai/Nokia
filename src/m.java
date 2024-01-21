
public class m {
	
	  public static void main(String[] args) {

		String name="msdnc       smdnfjks           sdkmvn";
		int count =0;
		for(int i=0; i<=name.length()-1; i++) {
			
			char ch = name.charAt(i);
			
			
			if(ch==' ') {
				
				count++;
			}
		}
		
		System.out.println(count);
		  
	  }
}
