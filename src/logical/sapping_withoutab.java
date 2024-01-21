package logical;

public class sapping_withoutab {
	
	
	
	public static void main(String[] args) {
		
		String m1="matin";
		String m2 ="laptop";
		
		
		m1= m1+m2;
		m2=(m1.substring(0,m1.length()-m2.length()));
		
		m1=m1.substring(m2.length());
		System.out.println(m1);
		System.out.println(m2);
	}

}
