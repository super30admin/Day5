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

Time complexity: O(1)
Space complexity: O(n)

class Solution {

    Map<Character, Integer> alphabetHash;

    public Solution() {
        alphabetHash = new HashMap<>();

        alphabetHash.put('a', 2);
        alphabetHash.put('b', 3);
        alphabetHash.put('c', 5);
        alphabetHash.put('d', 7);
        alphabetHash.put('e', 11);
        alphabetHash.put('f', 13);
        alphabetHash.put('g', 17);
        alphabetHash.put('h', 19);
        alphabetHash.put('i', 23);
        alphabetHash.put('j', 29);
        alphabetHash.put('k', 31);
        alphabetHash.put('l', 37);
        alphabetHash.put('m', 41);
        alphabetHash.put('n', 43);
        alphabetHash.put('o', 47);
        alphabetHash.put('p', 53);
        alphabetHash.put('q', 59);
        alphabetHash.put('r', 61);
        alphabetHash.put('s', 67);
        alphabetHash.put('t', 71);
        alphabetHash.put('u', 73);
        alphabetHash.put('v', 79);
        alphabetHash.put('w', 83);
        alphabetHash.put('x', 89);
        alphabetHash.put('y', 97);
        alphabetHash.put('z', 101);
    }

    public List<List<String>> groupAnagrams(String[] strs) {        

        Map<Integer, List<String>> anagrams = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            int hashKey = hash(strs[i]);
            if(!anagrams.containsKey(hashKey)) {
                anagrams.put(hashKey, new ArrayList<String>(Arrays.asList(strs[i])));
            } else {
                List<String> l = anagrams.get(hashKey);
                l.add(strs[i]);
                anagrams.put(hashKey, l);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<Integer, List<String>> entry: anagrams.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

    private int hash(String str) {

        int total = 0;
        for(int i = 0; i < str.length(); i++) {
            int s = alphabetHash.get(str.charAt(i));
            total += s * Math.sqrt(s) * str.charAt(i) * str.charAt(i);
        }
        return total;
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

Time complexity: O(n)
Space complexity: O(n)

class Solution {
public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(mapS.containsKey(charS)) {

                if(mapS.get(charS) != charT) return false;
            } else {
                mapS.put(charS, charT);
            }

            if(mapT.containsKey(charT)) {

                if(mapT.get(charT) != charS) return false;
            } else {
                mapT.put(charT, charS);
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

Time complexity: O(n)
Space complexity: O(n)

class Solution {
public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {

            char c = pattern.charAt(i);
            String word = words[i];
            
            if(patternMap.containsKey(c)) {
                if(!patternMap.get(c).equals(words[i])) {
                    return false;
                }
            } else {
                patternMap.put(c, words[i]);
            }

            if (wordMap.containsKey(word)) {
                if (wordMap.get(word) != c) {
                    return false;
                }
            } else {
                wordMap.put(word, c);
            }
        }

        return true;
    }
}