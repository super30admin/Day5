/*
TC - O(n) length of s
SC  - O(n)
It ran successfully
Approach - we are using 2 hashmaps. One stores values of s->t and other t->s
And then we can check if the value matches from the map value, else return false
 */


import java.util.*;

/**
 * Isomorphic : Isomorphic
 *
 * @author : Kavya Mandaliya (kmandali@cisco.com)
 * @version : 1.0 (Oct 31, 2024)
 * @since : 1.0 (Oct 31, 2024)
 */

public class Isomorphic {
	public static boolean isIsomorphic(String s, String t) {
		if(s == null || t == null || s.length() != t.length()) return false;
		Map<Character, Character> sMap = new HashMap<>();
		Map<Character, Character> tMap = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(sMap.containsKey(s.charAt(i))) {
				if(sMap.get(s.charAt(i)) != t.charAt(i)) { return false;}
			}
			else{
				sMap.put(s.charAt(i), t.charAt(i));
			}
			if(tMap.containsKey(t.charAt(i))) {
			if (s.charAt(i) != tMap.get(t.charAt(i))) {
					return false;
				}
			}else{
				tMap.put(t.charAt(i), s.charAt(i));
			}
		}
		return true;
	}
	public static void main(String[] args){
		System.out.println(isIsomorphic("aba", "ded"));
		System.out.println(isIsomorphic("aba", "def"));
		System.out.println(isIsomorphic("aba", ""));
	}
	
}
