package logical;

public class reversno {
	
	
	
	public static void main(String[] args) {
		
		int no=123654;
		int count=0;

		
		for(int i=no; i>0; i=i/10 ) {
			
			int sp=i%10;
			
			count=count*10+sp;
		}
		
		System.out.println(count);
	}
	
}
//public static void main(String[] args) {
//	
//	
//int no=123456;
//int rev=0;
//
//for(int i=no; i>0; i=i/10) {
//	
//	int rem=i%10;
//	rev=rev*10+rem;
//	
//}
//System.out.println(rev);
//}}
