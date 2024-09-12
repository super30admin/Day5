import java.util.HashMap;

// time complexity is O(n) as we are iterating throigh the length of the string
// space complexity is O(1) as there can be the worst 26 alphabet
// this solution is passed on leetcode

public class IsomorphicStrings {

	public boolean isIsomorphic(String s, String t) {
		// edge:
		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Character> sHashMap = new HashMap<>();
		HashMap<Character, Character> tHashMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			char d = t.charAt(i);
			if (!sHashMap.containsKey(c)) {
				sHashMap.put(c, d);
			} else {
				if (sHashMap.get(c) != d)
					return false;
			}
			if (!tHashMap.containsKey(d)) {
				tHashMap.put(d, c);
			} else {
				if (tHashMap.get(d) != c) {
					return false;
				}
			}
		}
		return true;
	}

}
