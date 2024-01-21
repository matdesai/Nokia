import java.util.HashMap;
import java.util.Set;

//import com.sun.tools.javac.util.Context.Key;

public class c {

	public static void main(String[] args) {
		
		//       0   1    2   3   4

	String name="matin";
	int gg=0;
	String rev="";
	char[] ll = name.toCharArray();
		
	
	for(char len:ll) {
		gg++;
		
	}
	
	for(int i=gg-1; i>=0;i--) {
		
		rev=rev+name.charAt(i);
	}
	
	System.out.println(rev);
	}
}
