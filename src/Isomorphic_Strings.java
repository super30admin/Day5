// Time Complexity : O(n): 
// Space Complexity : O(1):
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none


// Your code here along with comments explaining your approach
/* Having 2 hashmaps, and checking the correspondence of each character*/

import java.util.HashMap;

public class Isomorphic_Strings {
	public static boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length())
			return false;
		
		HashMap<Character, Character> map1 = new HashMap<>(26);	 		// length as 26, or 52 if capital letters included
		for(int i=0; i<s.length(); i++) {
			if(map1.get(s.charAt(i)) != null) {							// if first map doesn't contain any key and there is no correspondence return false, else put in to map
				if(map1.get(s.charAt(i)) != t.charAt(i))
					return false;
			}
			else
				map1.put(s.charAt(i), t.charAt(i));
			}
	
		HashMap<Character, Character> map2 = new HashMap<>(26);
		for(int i=0; i<t.length(); i++) {
			if(map2.get(t.charAt(i)) != null) {
				if(map2.get(t.charAt(i)) != s.charAt(i))
					return false;
			}
			else
				map2.put(t.charAt(i), s.charAt(i));
			}
		return true;
		}
	
	public static void main(String[] args) {
		String s = "paper";
		String t = "title";
		System.out.println(isIsomorphic(s,t));
	}
}
