// Time Complexity : O(nk log n) n is length of max string in strs, k is length of strs
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Couldn't get better time complexity (there's a solution with better time complexity than this)
//Time taken : 25 mins
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List> map = new HashMap<>();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);

            if(!map.containsKey(String.valueOf(c))){
                map.put(String.valueOf(c), new ArrayList());
            }
            map.get(String.valueOf(c)).add(s);
        }
        return new ArrayList(map.values());
    }
}
