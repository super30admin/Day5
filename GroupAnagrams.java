package hashing1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	//Time Complexity : O(n klogk) - n for looping and k is the maximum length of a word in strs
	//Space Complexity : O(nk)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s: strs) {
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String sorted = String.valueOf(letters);
            if(!map.containsKey(sorted))
                map.put(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }
        
        for(List<String> list: map.values())
            groupedAnagrams.add(list);
        
        return groupedAnagrams;
    }
}
