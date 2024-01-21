package Practice_logical;

public class missingvalue {
	
	
	public static void main(String[] args) {
		
		
		int ar1[]= {1,2,3,4,6,7,8,9};
		int sum1=0;
		for(int i=0; i<ar1.length-1; i++) {
			
			sum1=sum1+ar1[i];
			
		}
		
		
		int sum2=0;
		
		
		for(int i=0; i<=ar1.length; i++) {
			
			
			sum2= sum2+i;
			
		}
		
		System.out.println(sum2-sum1);
	}

}
