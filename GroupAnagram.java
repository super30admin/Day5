// Time Complexity : O(n*nlogn) because O(nlogn) to sort the string characters
// Space Complexity : Not sure. Need to learn how to calculate.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();
        Map<String, List<String>> anaMap = new HashMap<String, List<String>>();
        for(String s: strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(!anaMap.containsKey(key))
                anaMap.put(key, new ArrayList<String>());
            anaMap.get(key).add(s);
        }
        return new ArrayList(anaMap.values());
    }
}