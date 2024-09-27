// Time Complexity - O(n log n)
// Space Complexity - O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams1 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> ans = new HashMap<>();

        for ( String s : strs ) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList<>());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
