package com.Aug2020.Strings;

//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this :
// logic behind this was bit tricky to formulate.

public class IsomorphicString {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (map.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			} else {

				if (map.containsValue(t.charAt(i))) {
					return false;
				}
				map.put(s.charAt(i), t.charAt(i));

			}
		}

		return true;
	}
}
