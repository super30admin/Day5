import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Sorting each word results in a common string across the anagrams. Use it as a key to store in HashMap.
 * Complexity: O(n)
 */
public class GroupAnagrams {
	static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		for(int i=0; i<strs.length; i++) {
			char[] charArr = strs[i].toCharArray();
			//Sort the characters of each string
			Arrays.sort(charArr);
			String key = String.valueOf(charArr);
			// If the key doesn't exist, create a new ArrayList to store values
			if(!hm.containsKey(key)) {
				ArrayList<String> values = new ArrayList<String>();
				values.add(strs[i]);
				hm.put(key, values);
			} else {
				hm.get(key).add(strs[i]);
			}
		}
		List<List<String>> result = new ArrayList<List<String>>();
		for(String key: hm.keySet()) {
			result.add(hm.get(key));
		}
		return result;
	}
	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> res = groupAnagrams(strs);
		System.out.println(res);
	}

}
