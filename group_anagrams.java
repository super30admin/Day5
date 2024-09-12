
// Time Complexity : O(NMlogM) [ If M is the length of longest word to be sorted, sorting takes MlogM times and if there are N words in the String array, Total time complexity would be O(NMlogM)]
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Import statements are defined
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class group_anagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		// A List of List is created
		List<List<String>> group_anagrams = new ArrayList<>();
		// HashMap is created with key as String and Value as List of String
		HashMap<String, List<String>> hmap = new HashMap<>();
		/*
		 * We loop through the entire input String Array and sort each String, we use
		 * HashMap to first check if we have the sorted array as a key, if not we put
		 * the key as the sorted array and value as an ArrayList. Later we add the
		 * unsorted string into the arraylist as value
		 */
		for (String curr : strs) {
			char[] ch = curr.toCharArray();
			Arrays.sort(ch);
			String sorted = new String(ch);
			if (!hmap.containsKey(sorted)) {
				hmap.put(sorted, new ArrayList<>());
			}
			hmap.get(sorted).add(curr);
		}
		// In the end all values are added in order to get a list of lists
		group_anagrams.addAll(hmap.values());
		return group_anagrams;
	}
}