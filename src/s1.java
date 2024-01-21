import java.util.HashMap;
import java.util.Set;

public class s1 {
	
	public static void main(String[] args) {
		
		String name="twinkleew";

		HashMap<Character,Integer> mp=new HashMap();

		for(int i=0; i<=name.length()-1; i++)
		{ char s1=name.charAt(i);

		if(mp.containsKey(s1))
		{

		mp.put(s1,mp.get(s1)+1);
		}
		else{

		mp.put(s1, 1);
		}}
		Set<Character> Allkey=mp.keySet();

		for(Character key:Allkey)
		{
			
			if(mp.get(key)>1) {
				
				System.out.println(key+"= "+mp.get(key));
			}
		}
	}

}
