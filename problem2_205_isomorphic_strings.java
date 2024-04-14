// Time Complexity :In general the space Complexity will be o(n) for this approach but since alphabets are only 26(constant) it is O(1)
// Space Complexity:since alphabets are only 26(constant) it is O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :
//No specific problems faced initially struggled a bit to understand the isomorphic meaning

// Your code here along with comments explaining your approach
/*Isomorphic is once an alphabet is mapped to  one alphabet cannot map another alphabet so to have the track of alpabets in both strings , string s to string t sand string t to string s. I have consider two maps sMap,tMap where in we keep characters in s mapped to t and t to s.if any of them are previously mapped to a different one then returning false*/

import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // edge case scenarios
        if (s == null && t == null)
            return true;
        if(s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        // logic
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) return false;
            }
            else
                sMap.put(sChar, tChar);
            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar)
                    return false;
            }
            else
                tMap.put(tChar, sChar);

        }
        return true;
    }
}