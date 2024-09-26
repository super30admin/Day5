// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

import java.util.HashMap;
import java.util.Map;

/*
Problem 12
Leetcode - https://leetcode.com/problems/isomorphic-strings/submissions/
Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1: Input: s = "egg", t = "add" Output: true

Example 2: Input: s = "foo", t = "bar" Output: false

Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.
 */
//Method 1
public class IsmorphicStrings {
    public boolean isIsomorphic(String s, String t) {
            if(s.length() != t.length()) return false;

            Map<Character, Character> sMap = new HashMap<>();
            Map<Character, Character> tMap = new HashMap<>();

            for(int i = 0; i<s.length(); i++){
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);

                if(!sMap.containsKey(sChar)){
                    sMap.put(sChar, tChar);
                } else {
                    if(sMap.get(sChar) != tChar) return false;
                }
                if(!tMap.containsKey(tChar)){
                    tMap.put(tChar, sChar);
                } else {
                    if(tMap.get(tChar) != sChar) return false;
                }
            }
            return true;
        }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

//Method2
 class IsmorphicStrings2 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        char sMap[] = new char[127];
        char tMap[] = new char[127];

        for(int i = 0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if((sMap[sChar-0]==0)){
                sMap[sChar - 0] = tChar;
            } else {
                if(sMap[sChar-0] != tChar) return false;
            }
            if((tMap[tChar- 0]==0)){
                tMap[tChar - 0] = sChar;
            } else {
                if(tMap[tChar-0] != sChar) return false;
            }
        }
        return true;
    }}