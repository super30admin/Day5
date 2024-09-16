//Problem
49.Group Anagrams
        Given an array of strings strs,group the anagrams together.You can return the answer in any order.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,typically using all the original letters exactly once.


        Example 1:

        Input:strs=["eat","tea","tan","ate","nat","bat"]
        Output:[["bat"],["nat","tan"],["ate","eat","tea"]]


// Time Complexity : O(Nklogk) where N is length of input  and k is max length of string in given input


// Space Complexity : O(Nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
sort the characters of each string
Map each sorted String as key and save the corresponsing string as value;
if key exists, it adds the string to the existing List or else creates new arrayList for that paticular key
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList();
        Map<String, List> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!map.containsKey(key))
                map.put(key, new ArrayList());
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}