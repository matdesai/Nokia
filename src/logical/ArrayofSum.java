package logical;

public class ArrayofSum {

	
	public static void main(String[] args) {
		
//		int kk[]= {1,2,3,4,5,6,7};
//		int sum=0;
//		for(int i=0; i<=kk.length-1; i++)
//		{
//			
//			sum=sum+kk[i];
//		}
//		
//		System.out.println(sum);
		
		
		int no=123456;
		int rev=0;
		for(int i=no; i>0; i=i/10) {
			
		int mm =i%10;
		
		rev=rev*10+mm;
		}
		
		System.out.println(rev);
	}
}
