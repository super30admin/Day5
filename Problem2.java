// Time Complexity : O(n) where n is the length of strings
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * we are using two hashmaps to keep track of the mappings from character from first string to the character in the second string
 * we store the mapping for character from first string to character for next string
 * * If at any position we find mapping to be different, we return false
**/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        for(int i=0;i<s.length();i++) {
            char first = s.charAt(i);
            char second = t.charAt(i);
            
            if (!sMap.containsKey(first)) {
                // first map does not contain the key
                sMap.put(first,second);
                
                // we return false if there is already an existing mapping in tmap.
                // otherwise we put the backward mapping in the second map.
                if (tMap.containsKey(second)) {
                    return false;
                } else {
                    tMap.put(second, first);
                }
            } else {
                // first Map contains the key
                // we return false when either the existing map has a different value or backward mapping is different
                if (sMap.get(first) == second && tMap.get(second) == first) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        
        return true;
    }
}