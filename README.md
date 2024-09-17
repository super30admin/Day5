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
**CODE:**
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        Map<Long, List<String>> anagramMap = new HashMap<>();
        for(int i = 0; i< strs.length;i++){
            String s = strs[i];
            Long primeProduct = calculatePrimeProduct(s,primes);
            //Checking Existence
            if(!anagramMap.containsKey(primeProduct))
                anagramMap.put(primeProduct, new ArrayList<String>());
            //adding string to anagram list
            anagramMap.get(primeProduct).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }
    private Long calculatePrimeProduct(String s , int[] primes){
        Long primeProduct = 1L;
        for(int i = 0;i< s.length();i++){
            primeProduct *= primes[s.charAt(i)-'a'];            
        }
        return primeProduct;
    }
}
/**
The time complexity is O(NK) where N is the length of the string and K is the length of the word in the string.
The space complexity is O(N).

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
You may assume both s and t have the same length
**CODE:**
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false;
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();
        for(int i =0; i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(!sMap.containsKey(schar))
                sMap.put(schar,tchar);
            if(!tMap.containsKey(tchar))
                tMap.put(tchar,schar);
            if(sMap.get(schar)!=tchar||tMap.get(tchar)!=schar)
                return false;
            
        }
        return true;
    }
}

/**
The time complexity is O(N), where N is the length of the string.
The space complexity is O(1). Even though we are using 2 map as auxillary space but the SC remains constant because here s and t has ascii values which is 256 so the map max contains 256 values.
**/

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
CODE:                                                                     
 class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern == null || str == null || pattern.length()!= str.length)
            return false;
        HashMap<Character, String> patternMap = new HashMap<Character, String>();        
        for(int i=0; i<pattern.length(); i++){
        char patternChar = pattern.charAt(i);            
           if(patternMap.containsKey(patternChar)){
            String value = patternMap.get(patternChar);
            if(!value.equals(str[i])){
                return false;
            }
        }else if (patternMap.containsValue(str[i])){
            return false;
        }
        patternMap.put(patternChar, str[i]);
    }
 
    return true;
}
}                                                                 
