// Time Complexity :O(n*k)
// Space Complexity :O(n*k)
// Did this code successfully run on Leetcode :Yes
//https://leetcode.com/problems/group-anagrams/description/
// Any problem you faced while coding this : No
import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,ArrayList<String>> map = new HashMap<>();
        for(String str:strs){
            int[] frequency = new int[26];
            for(int i=0;i<str.length();i++){
                frequency[str.charAt(i)-'a']++;
            }
            String key = Arrays.toString(frequency);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        for(String k:map.keySet()){
            result.add(map.get(k));
        }
        return result;
    }
}