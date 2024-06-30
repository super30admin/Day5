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
    Map<String, List<String>> mp = new HashMap<>();

    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch); // Sort the character array

            // Use sorted character array as key directly
            if (!mp.containsKey(new String(ch))) {
                mp.put(new String(ch), new ArrayList<>());
            }
            mp.get(new String(ch)).add(strs[i]);
        }
        return new ArrayList<>(mp.values());
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
        Map<Character, Character> mp = new HashMap<>();
        Map<Character, Character> mp2 = new HashMap<>();
        
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        
        int i = 0;
        int n = s.length();
        for (i=0;i<n;i++){
            if (!mp.containsKey(s1[i]))
                mp.put(s1[i], t1[i]);
            else{
                if (t1[i] != mp.get(s1[i])){
                    System.out.println(s1[i] + "asfd" + mp.get(s1[i]));
                    return false;
                }    
            }

            if (!mp2.containsKey(t1[i]))
                mp2.put(t1[i], s1[i]);
            else{
                if (s1[i] != mp2.get(t1[i])){
                    System.out.println(s1[i] + "asfd" + mp.get(s1[i]));
                    return false;
                }    
            }
        }
        return true;
    }
}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mp = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        
        if (s.length() != t.length())
            return false;

        int i = 0;
        int n = s.length();
        for (i=0;i<n;i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if (mp.containsKey(s1))
            {
                if ( mp.get(s1) != t1)
                    return false;
            }
            else{
                if (tSet.contains(t1))
                    return false;

                mp.put(s1, t1);
                tSet.add(t1);   
            }
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

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] splited = s.split("\\s+");
        HashMap<Character, String> mp = new HashMap<>();
        HashMap<String, Character> mp2 = new HashMap<>();
        
        char[] p = pattern.toCharArray();

        if (splited.length != pattern.length())
            return false;

        for(int i=0;i<p.length;i++){
            if (mp.containsKey(p[i])){
                if (!mp.get(p[i]).equals(splited[i]))
                    return false;
            }
            else 
                mp.put(p[i], splited[i]);

            if (mp2.containsKey(splited[i])){
                if (mp2.get(splited[i])!=p[i])
                    return false;
            }
            else 
                mp2.put(splited[i], p[i]);
        }
        return true;
    }
}