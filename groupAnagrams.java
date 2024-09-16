import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Time Complexity : O(NlogN)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Approach:
1) Sort the key and check if it exists in the map or not. If yes then add the unsorted key to the arrayList
2) if key is not present, then just add the key and corresponding value as a new arrayList
3) return the values in map
*/



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) 
            return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (int i=0;i<strs.length;i++) {
            
            char[] key = strs[i].toCharArray();
            
            Arrays.sort(key);
            
            String keyStr = String.valueOf(key);
            
            if (!map.containsKey(keyStr)) 
                map.put(keyStr, new ArrayList<>());
            
            map.get(keyStr).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}