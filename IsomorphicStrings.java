package Trees_Graphs;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	
	public static boolean helper(String s, String t) {
		
		if(s.length() != t.length())
		{
			return false;
		}
		
		Map<Character, Character> map = new HashMap<>();
		
		for(int i = 0 ; i<s.length() ; i++)
		{
			if(!map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), t.charAt(i));
				
			}
			else if(map.get(s.charAt(i)) == t.charAt(i))
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String s = "paper";
		String t = "title";
		System.out.println(helper(s,t));
	}
}
