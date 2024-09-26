// Time Complexity : O(N) N is the length of teh string
// Space Complexity : O(N) N is the length of teh string
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
 * 1. Maintain a map of char/String as key and integer as value.
 * 2. for each char pattern and for each word as key store first occurrence index as integer value.
 * 3. check the value for char and string is equal or not. if not return false
 */

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		String sSplitArr[] = s.split(" ");

		if (sSplitArr.length != pattern.length())
			return false;

		Map<Object,Integer> map = new HashMap<>();

		for (Integer i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);

			if (!map.containsKey(c))
				map.put(c, i);

			if (!map.containsKey(sSplitArr[i]))
				map.put(sSplitArr[i], i);

			if (map.get(c) != map.get(sSplitArr[i]))
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(new WordPattern().wordPattern("abba", "dog dog dog dog"));
	}
}
