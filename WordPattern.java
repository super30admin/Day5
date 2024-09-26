
import java.util.*;

//Time Complexity : O(N) for all operations 
//Space Complexity : O(1) for all operations
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


//Your code here along with comments explaining your approach

/*
HashMap works on principle of Hashing.We 
*/ 
public class WordPattern {

	public boolean wordPattern(String pattern, String str) {
		String arr[] = str.split("\\s");
		Map<Character, String> map1 = new HashMap<>();
		Map<String, Character> map2 = new HashMap<>();

		if (arr.length != pattern.length())
			return false;

		int size = pattern.length();

		for (int i = 0; i < size; i++) {
			String s = arr[i];
			char ch = pattern.charAt(i);

			if (!map1.containsKey(ch)) {
				map1.put(ch, s);
			} else {
				if (!map1.get(ch).equals(s))
					return false;
			}
			if (!map2.containsKey(s)) {
				map2.put(s, ch);
			} else {
				if (!map2.get(s).equals(ch))
					return false;
			}
		}
		return true;
	}
}
