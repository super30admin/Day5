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

Time-Complexity = 0(N)
Space-Complexity = O(1)

class Solution {
public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        HashMap<Long, List<String>> map = new HashMap();

        for(int i = 0; i< strs.length; i++) {

            String s = strs[i];

            Long primeProduct = 1L;
            for(int j = 0; j < strs[i].length(); j++) {
                primeProduct = primeProduct * primes[strs[i].charAt(j) - 'a'];
            }

            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<String>());
            }

            map.get(primeProduct).add(strs[i]);

        }
        return new ArrayList<>(map.values());

    }

}

Time-Complexity = 0(N)
Space-Complexity = O(1)

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
if(s == null || t == null || s.length() != t.length()) {
return false;
}

        HashMap<Character, Character> map1 = new HashMap();
        HashMap<Character, Character> map2 = new HashMap();

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(!map1.containsKey(sChar)) {
                map1.put(sChar, tChar);
            }

            if(!map2.containsKey(tChar)) {
                map2.put(tChar, sChar);
            }

            if(map1.get(sChar) != tChar || map2.get(tChar) != sChar) {
                return false;
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

Time-Complexity = 0(N)
Space-Complexity = O(N)

class Solution {
public boolean wordPattern(String pattern, String s) {

        String[] words = s.split("\\s+");

        if(words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map = new HashMap();

        for(int i = 0; i < words.length; i++) {

            char current = pattern.charAt(i);

            if(map.containsKey(current)){
                if(!map.get(current).equals(words[i])){
                    return false;
                }
    	    }
            else if(map.containsValue(words[i])){
                return false;

            }
            else{
                map.put(current, words[i]);
            }
        }
        return true;
    }

}
