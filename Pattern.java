// Time Complexity : O(n)  n=number of characters in pattern string
// Space Complexity :o(2n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public static boolean wordPattern(String pattern, String s) {
		Map<Character, String> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		char[] sArr = pattern.toCharArray();
		int length = sArr.length;
		String[] tArr = s.split(" ");
		if (length == tArr.length) {
			for (int i = 0; i < length; i++) {
				if (map.containsKey(sArr[i])) {
					if (!(map.get(sArr[i]).equals(tArr[i]))) {
						return false;
					}

				} else {
					if (list.contains(tArr[i])) {
						return false;
					} else {
						map.put(sArr[i], tArr[i]);
						list.add(tArr[i]);
					}
				}

			}

		} else {
			return false;
		}

		return true;

	}

	public static void main(String args[]) {
		System.out.print(wordPattern("abba", "dog cat cat dog"));
	}

}