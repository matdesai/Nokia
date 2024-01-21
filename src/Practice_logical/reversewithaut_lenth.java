package Practice_logical;

public class reversewithaut_lenth {

	
	public static void main(String[] args) {
		
		
		String name ="matin";
	
	String rev="";
		int count=0;
	char ar[]= name.toCharArray();
	
	for( char po:ar) {
		
		count++;
	}
	
	for(int i=count-1; i>=0;i--) 
	{
	
		rev=rev+name.charAt(i);
	}
System.out.println(rev);
	
	
	
	}
	
	
}
