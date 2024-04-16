/*#Hashing-1 Explain your approach in**three sentences only**at top of your code

##Problem 1:Given an array of strings,group anagrams together.

Example:Input:["eat","tea","tan","ate","nat","bat"],Output:[["ate","eat","tea"],["nat","tan"],["bat"]]

Note:All inputs will be in lowercase.The order of your output does not matter.*/
// Time Complexity : O(n)
// Space Complexity : O(n)

//Approach: We will use a hashmap to store the sorted string as key and the list of strings as value. 
//We will iterate through the input array and sort each string and store it in the hashmap. 
//If the sorted string is not present in the hashmap, we will add it to the hashmap and add the string to the list. 
//If the sorted string is already present in the hashmap, we will add the string to the list. 
//Finally, we will return the values of the hashmap as the output.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            String sortedStr = String.valueOf(sorted);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

/*
 * ## Problem 2:
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * 
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 * 
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 * Note:
 * You may assume both s and t have the same length.
 */
// Time Complexity : O(n)
// Space Complexity : O(n)
//Approach: We will use two hashmaps to store the mapping of characters from s to t and t to s.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) return false;
            } else {
                sMap.put(sChar, tChar);
            }
            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) return false;
            } else {
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}

/*
 * ## Problem 3:
 * Given a pattern and a string str, find if str follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a
 * letter in pattern and a non-empty word in str.
 * 
 * Example 1:
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * 
 * Example 2:
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * 
 * Example 3:
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * 
 * Example 4:
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains
 * lowercase letters that may be separated by a single space.
 */
// Time Complexity : O(n)
// Space Complexity : O(n)
//Approach: We will use two hashmaps to store the mapping of characters from pattern to string and string to pattern.
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null && s == null) return true;
        if (pattern == null || s == null) return false;
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String word = words[i];
            if (pMap.containsKey(pChar)) {
                if (!pMap.get(pChar).equals(word)) return false;
            } else {
                pMap.put(pChar, word);
            }
            if (sMap.containsKey(word)) {
                if (sMap.get(word) != pChar) return false;
            } else {
                sMap.put(word, pChar);
            }
        }
        return true;
    }
}