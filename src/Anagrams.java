import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Anagrams {
	public List<List<String>> groupAnagrams(String[] strs) {

		if (strs == null || strs.length == 0)
			return null;

		HashMap<String, List<String>> anMap = new HashMap<String, List<String>>();
	
		for (String str : strs) {
			char[] charArr = str.toCharArray();
			Arrays.sort(charArr);
			String sorted = String.valueOf(charArr);
			if (!anMap.containsKey(sorted)) {
				anMap.put(sorted, new ArrayList<String>());
			}
			anMap.get(sorted).add(str);

		}
	
		return new LinkedList<List<String>>(anMap.values());

	}

	public static void main(String[] args) {
		Anagrams an = new Anagrams();
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(an.groupAnagrams(strs));
	}
}
