package Oct19;

import java.util.HashMap;
import java.util.Map;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
       
// Time Complexity: O(l) where l is the length of each string

// Space Complexity: O(1) 
// Because we can have maximum 26 characters in the hashmap that we are using. 
        
// Did this code successfully run on Leetcode : Yes

// Any problem you faced while coding this : No

// Approach: 2 hashmaps used, 1 for each string.
// Ith character of first string mapped to Ith character of second string in HashMap1. Similarly for HashMap2.
// in either of the hashmaps, if there is a mismatch in value for any character with its corresponding one in the other string, we return false else true.
        
        int len = s.length();
        int lenT = t.length();
        
        if (s == null || t == null || len != lenT){
           return false;
        }
        
        Map<Character, Character> hm1 = new HashMap<>();
        Map<Character, Character> hm2 = new HashMap<>();
        
        for (int i = 0; i < len; i++) {
            
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (!hm1.containsKey(sChar)) {
                hm1.put(sChar, tChar);
            } else {
                char curVal = hm1.get(sChar);
                if (curVal != tChar) {
                   return false;
                }
            }
            
            if (!hm2.containsKey(tChar)) {
                hm2.put(tChar, sChar);
            } else {
                char curVal = hm2.get(tChar);
                if (curVal != sChar) {
                   return false;
                }
            }
        }

        return true; 
    }
}