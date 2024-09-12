// Time Complexity : O(NK log K), N is length of strs, K is max length of a stirng in strs
// Space Complexity : O(NK) , total info stores in map
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : n/a

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // edge case: empty
        if (strs.length == 0) return new ArrayList();
        
        HashMap<String, ArrayList> map = new HashMap<String, ArrayList>(); // key is sorted string, value is array list of strs that when sorted is same as key
        
        for (String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String k = String.valueOf(charArr);
            if (!map.containsKey(k)) map.put(k, new ArrayList());
            map.get(k).add(s);
        }
        return new ArrayList(map.values());
    }
}