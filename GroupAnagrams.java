/*

Time Complexity: O(m*nlogn) -> for maximum of string length n we perform sort at each string to find key and loop runs m times hence m*nlogn
Space Complexity:  O(m) + O(n) -> m is the length of given array to store each string in map and temp list with maximum size n 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        if(strs == null || strs.length == 0) return res;
        
        for(String str: strs){            
            String key = getKey(str);
            List<String> temp = map.getOrDefault(key, new ArrayList<String>());
            temp.add(str);
            map.put(key, temp);
        }
        
        for(String key: map.keySet()){
            res.add(map.get(key));
        }
        return res;        
    }
    private String getKey(String str){
        char[] keyArr = str.toCharArray();
        Arrays.sort(keyArr);
        return String.valueOf(keyArr);
    }
}