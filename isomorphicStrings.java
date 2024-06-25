// Time Complexity :O(N) 
// Space Complexity :O(N) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // If lengths of strings are not equal, they can't be isomorphic
        if (s.length() != t.length()) return false;
        
        // HashMaps to store character mappings from s to t and t to s
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        // Iterate through the characters of both strings
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i); // Character from string s
            char tChar = t.charAt(i); // Character from string t
            
            // Check if there is a mapping for sChar in sMap
            if (sMap.containsKey(sChar)) {
                // If the mapped character does not match tChar, return false
                if (sMap.get(sChar) != tChar) return false;
            } else {
                // Add the mapping from sChar to tChar in sMap
                sMap.put(sChar, tChar);
            }
            
            // Check if there is a mapping for tChar in tMap
            if (tMap.containsKey(tChar)) {
                // If the mapped character does not match sChar, return false
                if (tMap.get(tChar) != sChar) return false;
            } else {
                // Add the mapping from tChar to sChar in tMap
                tMap.put(tChar, sChar);
            }
        }
        
        // If no conflicts in mappings were found, the strings are isomorphic
        return true;
    }
}
