import java.util.HashMap;

public class IsomorphicSoln {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Character> sMap = new HashMap();
		HashMap<Character, Character> tMap = new HashMap();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			char ch1 = t.charAt(i);
			if (sMap.containsKey(ch)) {
				if (ch1 != sMap.get(ch)) {
					return false;
				}
			} else {
				sMap.put(ch, ch1);
			}

			if (tMap.containsKey(ch1)) {
				if (ch != tMap.get(ch1)) {
					return false;
				}
			} else {
				tMap.put(ch1, ch);
			}
		}
		return true;
	}

}
