import java.util.HashMap;

public class Isomorphic {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length() || s == null || t == null)
			return false;

		HashMap<Character, Character> sMap = new HashMap<Character, Character>();
		HashMap<Character, Character> tMap = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			if (sMap.containsKey(sChar)) {
				if (sMap.get(sChar) != tChar)
					return false;
			} else {
				sMap.put(sChar, tChar);
			}
			if (tMap.containsKey(tChar)) {
				if (tMap.get(tChar) != sChar)
					return false;
			} else {
				tMap.put(tChar, sChar);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Isomorphic iso = new Isomorphic();
		System.out.println(iso.isIsomorphic("foo", "bar"));
	}
}
