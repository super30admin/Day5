// Time Complexity : O(N.NLogN), O(N) for outer loop O(NlogN) for sorting
// Space Complexity :O(NK),N=arr.length, K=max(strs.length)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length == 0) return new ArrayList();
        Map<String, List> output = new HashMap<>();

        for(String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);
            if(!output.containsKey(key))
                output.put(key, new ArrayList<String>());
            output.get(key).add(s);
        }

        return new ArrayList(output.values());
    }
}
