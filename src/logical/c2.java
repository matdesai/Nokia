package logical;

public class c2 {
	
	
	public static void main(String[] args) {
		
		String name="my name is matin";
	
	  String[] ar = name.split(" ");	
		
		for(int i=0; i<=ar.length-1; i++) {
			
			String kj =ar[i];
			
			String qq ="";
			
			for(int j=kj.length()-1; j>=0; j--) {
				
				
				char gh = kj.charAt(j);
				qq=qq+kj.charAt(j);
			//String ww = qq+qq.charAt(i);
			}
			
			
			//String ww;
			System.out.print(qq);
		}
		
		
		
	}

}
