package Practice_logical;

public class reversStatment {
	
	
	public static void main(String[] args) {

		
		String statment ="i am going to kolhapur";
		
String name[]= statment.split(" ");
	
for(int i=0; i<=name.length-1;i++)
{

String name1= name[i];
		
String rev ="";
  
for(int j=name1.length()-1; j>=0; j--) {
	  
rev=rev+name1.charAt(j);
	  
  }
if(i%2!=0) {
	
	System.out.print(name1+" ");
	
}
else {
	
	
	System.out.print(rev+" ");
}
	  
	  
	  
  
		
		
		
		
		
		
	}


	}
	
}
