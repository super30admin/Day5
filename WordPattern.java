package Oct19;

import java.util.HashMap;
import java.util.Map;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        
// Time Complexity: O(lk) where l is the length of pattern and k is the length of each word in string 's'.
// k is needed because lookup for string value in hashmap involves calcualtion of hashvalue for each character and subsequently, entire word. This leads to k iterations.

// Space Complexity: O(1) 
// Because we can have maximum 26 characters in both the hashmaps. First hashmap can have max 26 characters as the key. Second hashmap can have any no.of words separated by spaces but no. of keys in the second hashmap also shall be restricted to 26 letters. If it exceeds, we exit by returning the boolean value. 
        
// Did this code successfully run on Leetcode : Yes

// Any problem you faced while coding this : No

// Approach: 2 hashmaps used, 1 for each string.
// Ith character of first string mapped to Ith character of second string in HashMap1. Similarly for HashMap2.
// in either of the hashmaps, if there is a mismatch in value for any character with its corresponding one in the other string, we return false else true.
       
        if (s == null || pattern == null){
           return false;
        }
        
        String[] strArr = s.split(" ");
        
        int lenPat = pattern.length();
        int lenArr = strArr.length;
        
        if (lenPat != lenArr) {
            return false;
        }
        
        Map<Character, String> hm1 = new HashMap<>();
        Map<String, Character> hm2 = new HashMap<>();
        
        for (int i = 0; i < lenPat; i++) {
            
            char pChar = pattern.charAt(i);
            String temp = strArr[i];
            
            if (!hm1.containsKey(pChar)) {
                hm1.put(pChar, temp);
            } else {
                String curVal = hm1.get(pChar);
                if (!curVal.equals(temp)) {
                   return false;
                }
            }
            
            if (!hm2.containsKey(temp)) {
                hm2.put(temp, pChar);
            } else {
                char curVal = hm2.get(temp);
                if (curVal != pChar) {
                   return false;
                }
            }
        }
      
        return true;
        
    }
}
