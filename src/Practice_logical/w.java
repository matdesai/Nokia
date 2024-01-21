package Practice_logical;

public class w {
	
	public static void main(String[] args) {
		   //         0   1   2   3
		String name="my name is matin";
		
		
      String ar[]= name.split(" ");
      
      for(int i=0; i<=ar.length-1; i++) {
    	  
    	  String name1=ar[i];
    	  
    	  String rev="";
    	  
    	  for(int j=name1.length()-1; j>=0; j--) {
    		  
    		  rev=rev+name1.charAt(j);
    	  }
      System.out.print(rev+" ");
//    	  if(i%2==1) {
//    		  
//    		  System.out.print(rev+" ");
//    	  }
//    	  else {
//    		  
//    		  System.out.print(name1+" ");
//    	  }
      }
	}

}
