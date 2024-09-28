import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*******
## Problem 1:
Given an array of strings, group anagrams together

Time Complexity :   O (NK log K) 
                Where,
                - N: length of strs 
                - K: max length of a string in strs
                - Log N - sort the char Array
Space Complexity :  O (NK)        - 
Did this code successfully run on Leetcode :    Yes (49. Group Anagrams)
Any problem you faced while coding this :       No
*******/

class MyGroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create a map of key sting and list of string with same anagram
        Map<String, List> mp = new HashMap<String, List>();
        
        for ( String s: strs){
            // convert string and sort the string
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.copyValueOf(charArray);

            // if sorted string is not in map, create a entry in map
            if (!mp.containsKey(key)){
                mp.put(key, new ArrayList());
            }
            // add the string list
            mp.get(key).add(s);
        }
        // return all the map values - List<List>
        return new ArrayList(mp.values());
    }

    public static void main(String args[]) 
    { 
        MyGroupAnagrams obj = new MyGroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(obj.groupAnagrams(strs));
    }
}
