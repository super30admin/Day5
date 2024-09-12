import java.util.HashMap;
import java.util.HashSet;

// Time Complexity : O(N) [...where N: lenght of string]  
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// Idea is to create a mapping of each character in s with t. 
// We need to keep track of mapping in both strings. For this we use sCharMap and tCharSet 

class Solution2 {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> sCharMap = new HashMap<>(); // to map char in s with coresponding char in t
        HashSet<Character> tCharSet = new HashSet<>(); // to keep track of mapped characters in t

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sCharMap.containsKey(sChar)) {
                // Check if previously mapped char matches with current char
                if (sCharMap.get(sChar) != tChar)
                    return false;

            } else {
                if (tCharSet.contains(tChar)) {
                    // this tChar is already been mapped, and currently has diffrent value
                    return false;
                }
                // add new mapping
                sCharMap.put(sChar, tChar);
                tCharSet.add(tChar);
            }
        }

        // No mismatch found in the mapped characters
        return true;
    }
}
