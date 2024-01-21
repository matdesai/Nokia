package Practice_logical;

public class missing_no {
	
	public static void main(String[] args) {
		
		 
		int []ar = {1,2,4,5,6};
		
		int sum1=0;
		
		for(int i=0; i<ar.length-1; i++) { // 1+2+4+5=12
			
			sum1= sum1+ar[i];
		}
		
		System.out.println();
		int sum2 = 0;
		for(int j=1; j<=ar.length; j++) {
			
			sum2=sum2+j;    ///1+2=3+3=6+4=10+5=15
			//System.out.println(j);
		}
		
		System.out.println(sum2-sum1);

	
	}
	
	
}








//1
//1+2=3
//3+4=7
//7+5=12