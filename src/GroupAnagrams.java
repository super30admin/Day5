// Check word pattern.
// Time Complexity - O(nlogn)
// Space Complexity - O(n) - worst case, we have to store all strings in their sorted form
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] tempArray = s.toCharArray();
            Arrays.sort(tempArray);
            String sortedString = new String(tempArray);
            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(s);
            } else {
                map.put(sortedString, new ArrayList<>(Arrays.asList(s)));
            }
        }
        return new ArrayList<>(map.values());
    }
}