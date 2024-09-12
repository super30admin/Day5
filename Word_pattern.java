// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

class Word_pattern {
	public boolean wordPattern(String pattern, String str) {
		// HashMap is created as key as Character and Value as String
		HashMap<Character, String> hmap = new HashMap<>();
		// Split function is used in order to get an array of words
		String ind_str[] = str.split(" ");
		// edge case is checked
		if (pattern.length() != ind_str.length) {
			return false;
		}
		/*
		 * We traverse through the entire length of the pattern and see if the character
		 * matches to that particular word
		 */
		for (int i = 0; i < pattern.length(); i++) {
			if (!hmap.containsKey(pattern.charAt(i))) {
				if (hmap.containsValue(ind_str[i])) {
					return false;
				}
				hmap.put(pattern.charAt(i), ind_str[i]);
			} else {
				if (!hmap.get(pattern.charAt(i)).equals(ind_str[i])) {
					return false;
				}
			}
		}
		return true;
	}
}