// Time Complexity
// With bruteforce solution: 
// With hashing: O(n)
// Where n = length of s/t
// Space Complexity
// With bruteforce solution:
// With hashing Optimization: O(n)

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Null case
        if (s == null || t == null) // Check for the empty string
            return false;
        if (s.length() != t.length()) // Check for the equal length of string
            return false;

        HashMap<Character, Character> sMap = new HashMap<>(); // Hashmap for string s
        HashMap<Character, Character> tMap = new HashMap<>(); // Hashmap for string t

        for (int i = 0; i < s.length(); i++) { // Iterate over string s or t.
            char sChar = s.charAt(i); // check the character at ith position in s
            char tChar = t.charAt(i); // check the character at ith position in t

            if (!sMap.containsKey(sChar)) { // check if the smap cotains the char of string s
                sMap.put(sChar, tChar); // Add if not found
            } else {
                if (sMap.get(sChar) != tChar) // if the char found then check if it's equal to char of string t at ith
                                              // position
                    return false; // Return false if not
            }

            if (!tMap.containsKey(tChar)) { // check if the smap cotains the char of string t
                tMap.put(tChar, sChar); // Add if not found
            } else {
                if (tMap.get(tChar) != sChar) // if the char found then check if it's equal to char of string s at ith
                                              // position
                    return false; // Return false if not
            }
        }

        return true;
    }
}

/*
 * Ascii character solution
 * 
 * class Solution {
 * public boolean isIsomorphic(String s, String t) {
 * //Null case
 * if(s == null || t == null) return false;
 * if(s.length() != t.length()) return false;
 * 
 * //HashMap<Character,Character> sMap = new HashMap<>();
 * //HashMap<Character,Character> tMap = new HashMap<>();
 * 
 * char[] sMap = new char[100];
 * char[] tMap = new char[100];
 * 
 * for(int i = 0; i < s.length(); i++){
 * char sChar = s.charAt(i);
 * char tChar = t.charAt(i);
 * 
 * if(sMap[sChar - ' '] == 0){
 * sMap[sChar - ' '] = tChar;
 * }
 * else{
 * if(sMap[sChar - ' '] != tChar) return false;
 * }
 * 
 * if(tMap[tChar - ' '] == 0){
 * tMap[tChar - ' '] = sChar;
 * }
 * else{
 * if(tMap[tChar - ' '] != sChar) return false;
 * }
 * }
 * 
 * return true;
 * }
 * }
 */