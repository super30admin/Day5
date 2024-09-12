package nov22OOPs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Problem 11

// Source Link: https://leetcode.com/problems/group-anagrams/
// https://github.com/super30admin/Hashing-1

public class anagrams49 {

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0) {
			return new ArrayList();
		}
		Map<String, List> ans = new HashMap<String, List>();
		for (String s : strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if (!ans.containsKey(key)) {
				ans.put(key, new ArrayList());
			}
			ans.get(key).add(s);
		}

		return new ArrayList();
	}

}
