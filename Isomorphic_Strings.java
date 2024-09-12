// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

class Isomorphic_Strings {
	public boolean isIsomorphic(String s, String t) {
		// edge case is checked
		if (s.length() != t.length()) {
			return false;
		}
		// HashMap is created with both key and value as character
		HashMap<Character, Character> hmap = new HashMap<>();
		/*
		 * We Traverse till the length of first string and using HashMap we initialize
		 * the key to the s String and Value to the t String we compare character by
		 * character of both the strings if they match as present in the HashMap or not
		 */
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			char ch1 = t.charAt(i);
			if (hmap.containsKey(ch)) {
				if (hmap.get(ch) != ch1) {
					return false;
				}
			} else {
				if (hmap.containsValue(ch1)) {
					return false;
				}
				hmap.put(ch, ch1);
			}
		}
		return true;
	}
}