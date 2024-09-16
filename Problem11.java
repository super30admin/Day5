//Time Complexity: n = input size, s = string size - O(nslogs);
//Space Complexity: O(ns);
//Run on leetcode: Yes
//Problems faced any: No

import java.util.*;
class Problem11 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();
        Map<String, List> ans  = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!ans.containsKey(key))
                ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}