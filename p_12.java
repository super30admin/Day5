// Time Complexity :o(nklog(k))
// Space Complexity :0(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //null.
        if(strs == null) return new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length ; i++){
            char [] charArr = strs[i].toCharArray();
            Arrays.sort(charArr); 
            String sorted = String.valueOf(charArr);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}