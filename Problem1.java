
//Problem: leetcode 49. Group Anagrams: Given an array of strings, group anagrams together.
//Problem Link: https://leetcode.com/problems/group-anagrams/
// Time Complexity : O(n)
// Space Complexity :O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


//Approach
/*

Using a Map which contains sorted String as Keys and the lkist of all the string which when sorted equals the key as its value.

*/

import java.util.*;

class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }
        Map<String, List> ans = new HashMap<String, List>();
        for( String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList());
            }
            //System.out.println(ans.get(key));
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}

