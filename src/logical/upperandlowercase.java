package logical;

public class upperandlowercase {
	
	
	public static void main(String[] args) {
		
		String name="MaTin";
		String rev="";
//		for(int i=0; i<=name.charAt(i)-1; i++) {
//			
//			char ch = name.charAt(i);
//			

		String n = name.replaceAll(name.toUpperCase(), name.toLowerCase());

		System.out.println(n);
	}

}
