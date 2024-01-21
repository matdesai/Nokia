package logical;

public class sapping_with_substring
{
	
	
	public static void main(String[] args) {
		
		String str1="matin";
		String str2="nisha";
		
	
		str1=str1+str2;  //matinnisha
        str2=str1.substring(0,str1.length()-str2.length());// matinnisha-nisha=matin
		str1=str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
