package hashing;
//Time Complexity : O(N*KlogK)
//Space Complexity : O(NK)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class solution1 {
	    public List<List<String>> groupAnagrams(String[] strs) {

	        if (strs == null || strs.length == 0) {
	            return new ArrayList<>();
	        }

	        HashMap<String, List<String>> map = new HashMap<>();

	        for (String s: strs) {

	            char[] charArray = s.toCharArray();
	            Arrays.sort(charArray);
	            String sorted = String.valueOf(charArray);

	            if(!map.containsKey(sorted)) {
	                map.put(sorted, new ArrayList<>());
	            }

	            map.get(sorted).add(s);

	        }

	        return new ArrayList<>(map.values());
	    }
}
