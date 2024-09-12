import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// time complexity is O(nklogk) as we are iterating throigh the length of the string 
// and klogk is for sorting the string
// space complexity is nk as we have String and ArrayList in hashmap
// this solution is passed on leetcode

public class AnagramsUsingSortingBigN11 {
	
	public List<List<String>> groupAnagrams(String [] str){
		//Edge case:
		if (str.length == 0 || str == null) {
			return new ArrayList<>();
		}
		HashMap<String,List<String>> result = new HashMap<>();
		for (String s : str) {
			char [] c = s.toCharArray();
			Arrays.sort(c);
			String sorted = String.valueOf(c);
			if(!result.containsKey(sorted)) {
				result.put(sorted, new ArrayList<String>());
			}
			result.get(sorted).add(s);
		}
		return new ArrayList<>(result.values());
	}

}
