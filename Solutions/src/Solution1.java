// Time Complexity :
//KlogK
//// Space Complexity :O(n)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        Arrays.sort(strs);
        for (int i=0;i<strs.length;i++){
            String temp = strs[i];
            char[] ch = temp.toCharArray();
            Arrays.sort(ch);
            if (map.containsKey(String.valueOf(ch))){
                map.get(String.valueOf(ch)).add(strs[i]);
            }
            else{
                List<String> tmpres = new ArrayList<>();
                tmpres.add(strs[i]);
                map.put(String.valueOf(ch), tmpres);
            }

        }

        for (List<String> item: map.values()) {
            results.add(item);
        }
        return results;
    }
}