import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class Isomorphic_strings {

	/**
	 * @param args
	 */
	
	public static boolean is_isomorphic(String s, String t) {
		
		Map<Character,Character> map1 = new HashMap<Character,Character>();
		Map<Character,Character> map2 = new HashMap<Character,Character>();
		
		if(s.length() != t.length()) {return false;}
		
		for(int i=0;i<s.length();i++)
		{
			
			if(map1.containsKey(s.charAt(i))) 
			{
				if(map1.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
				
			}
			else if(map2.containsKey(t.charAt(i))) {
				
				return false;
			}
			
			
			map1.put(s.charAt(i), t.charAt(i));	
			map2.put(t.charAt(i),s.charAt(i));
		}
		
		
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "foo";
		String t = "toy";
	
		boolean value = is_isomorphic(s,t);
		System.out.println(value);
	}

}
