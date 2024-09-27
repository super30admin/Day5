import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


    // Your code here along with comments explaining your approach
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            //Return empty array list if length
            if(strs.length == 0 || strs == null) return new ArrayList<>();
            HashMap<String, List> map = new HashMap<>();
            for(int i = 0; i < strs.length; i++){
                char[] c = strs[i].toCharArray();
                Arrays.sort(c);
                String k = String.valueOf(c);

                if(!map.containsKey(k)) map.put(k, new ArrayList());
                map.get(k).add(strs[i]);
            }
            return new ArrayList<>(map.values());
        }
    }
}
