// Time Complexity : O(N+K)log(K) // K is length of string and N is no. of strings
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.*;
public class GroupAnagramsSolution {
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) {
			return new ArrayList<>();
		}
		HashMap<String, List<String>> map = new HashMap<>();
		for (String s: strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = String.valueOf(charArray);
			if(!map.containsKey(sortedKey)) {
				map.put(sortedKey, new ArrayList<>());
			}
			map.get(sortedKey).add(s);
		}
		return new ArrayList<>(map.values());
	}	
}
