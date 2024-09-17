/**
 * Time Complexity : O(n*klogk) where n =  length of strings array 
 * and k=maximum length of string in strs 
 * 
 * Space Complexity: O(n*k)
 */

import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String,List>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!(ans.containsKey(key))){
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

    public static void main(String args[]){
        GroupAnagrams obj = new GroupAnagrams();
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(obj.groupAnagrams(strs));
        
    }
}