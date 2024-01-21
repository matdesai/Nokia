package Practice_logical;

public class amstrong {
	
	
	public static void main(String[] args) {
		
int amstrong=153;

int sum=0;

for(int i=amstrong; i>0; i=i/10 ) {
	
	int f=i%10;
	
	sum=sum+(f*f*f);
}

if(amstrong==sum) {
	
	System.out.println("yes");
}
	}

}
