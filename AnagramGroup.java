import java.util.*;

// Time Complexity : O(N LlogL) where N is size of array and L is max length of string in array
// Space Complexity : O(NL) where N is the size of array and L is max length of string in array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*Approach
 * Idea is to use the hash map where key will be the sorted string in the array and value will be list of anagrams to the key
 * */

public class AnagramGroup {

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            //sort each string to generate unique key for each anagram
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = String.valueOf(chars);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }

}