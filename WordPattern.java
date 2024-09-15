package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

	public boolean wordPattern(String pattern, String str) {

		String[] t = str.split(" ");

		char[] s = pattern.toCharArray();
		if (t.length != s.length)
			return false;

		Map<Character, String> mapping = new HashMap<Character, String>(s.length);
		Set<String> usedKeys = new HashSet<String>(s.length);

		for (int i = 0; i < s.length; i++) {

			char sChar = s[i];
			String tChar = t[i];
			if (mapping.containsKey(sChar)) {
				String val = mapping.get(sChar);

				if (!tChar.equals(val))
					return false;
			} else {
				if (usedKeys.contains(tChar))
					return false;

				mapping.put(sChar, tChar);
				usedKeys.add(tChar);

			}

		}
		return true;
	}
}