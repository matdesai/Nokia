package logical;

public class Tommarow {
	
	public static void main(String[] args) {


		String name="tommorow";
		// out put=to@mmo@@ro@@@w
		int count =0;
		String rev="";
		for(int i=0; i<=name.length()-1; i++) {


			if(name.charAt(i)=='o') {
				
				rev =rev+'@';
				System.out.print(name.charAt(i));
				
				System.out.print(rev);
			}
			
			else {
				
				System.out.print(name.charAt(i));
			}
		}
	
	
	}

}
