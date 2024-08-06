# Hashing-1
Explain your approach in **three sentences only** at top of your code


## Problem 1:
Given an array of strings, group anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:
All inputs will be in lowercase.
The order of your output does not matter.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        HashMap<String,List<String>> resMap=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String sorted=String.valueOf(c);
            if(!resMap.containsKey(sorted))
            {
                resMap.put(sorted,new ArrayList<>());
            }
            resMap.get(sorted).add(s);
        }
        for(Map.Entry<String,List<String>> entry:resMap.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}

## Problem 2:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.


class Solution {
    public boolean isIsomorphic(String s, String t) {
        
     HashMap<Character,Character> sMap=new HashMap<>();
        HashMap<Character,Character> tMap=new HashMap<>();
        int slen=s.length();
        int tlen=t.length();
        if(slen!=tlen)
            return false;
        for(int i=0;i<slen;i++){
            if(!sMap.containsKey(s.charAt(i)))
                sMap.put(s.charAt(i),t.charAt(i));
            if(sMap.get(s.charAt(i))!=t.charAt(i))
                return false;
            if(!tMap.containsKey(t.charAt(i)))
                tMap.put(t.charAt(i),s.charAt(i));
            if(tMap.get(t.charAt(i))!=s.charAt(i))
                return false;
        
        }
        return true;
    }
}

## Problem 3:
Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:
Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Example 2:
Input:pattern = "abba", str = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false

Example 4:
Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
