
public class permutation {

	
	public static void main(String[] args) {
		
		int n=10;
		int r=7;
		
		int no=1;
		
		for(int i=n-1; i>1; i--) 
		{
			
			no=no*i;
		
		}
		
		System.out.println(no);
		int fac=n-r;
	
		for(int  j=fac-1; j>1; j--)
		{
			
			fac=fac*j;
		}
		System.out.println(fac);
		System.out.println(no/fac);
	}
}
