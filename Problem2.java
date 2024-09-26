package Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*Given two strings s and t, determine if they are isomorphic.
 *  Two strings are isomorphic if the characters in s can be replaced to get t.
 *   All occurrences of a character must be replaced with another character while
 *    preserving the order of characters. No two characters may map to the same
 *     character but a character may map to itself.
Example 1: Input: s = "egg", t = "add" Output: true
Example 2: Input: s = "foo", t = "bar" Output: false
Example 3: Input: s = "paper", t = "title" Output: true
 Note: You may assume both s and t have the same length.*/

/*
 * Complexity
 * Time :O(n) n= string s length
 * Space : O(n)
*/
public class Problem2 {
	
	public static boolean isIsomorphic(String s, String t) {
		if(s.length()==0 || s==null)
			return true;
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		Set<Character> set= new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				if(map.get(s.charAt(i))!=(t.charAt(i))) {
					return false;
				}
			}else {
				if(set.contains(t.charAt(i))) return false;
				map.put(s.charAt(i),t.charAt(i));
				set.add(t.charAt(i));
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		String s = "egg", t = "add";
		//String s = "aa", t = "ad";
		boolean res = isIsomorphic(s,t);
		System.out.println(res);
	}
}
