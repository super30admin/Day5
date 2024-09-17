// Time Complexity : O(k) where k is the length of the strings
// Space Complexity : O(256) == O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/*
 * The idea is to use Map to maintain a mapping for every unique character in String S --> character in String T
 * Also, we maintain another Map to maintain the reverse mapping from character in String T --> character in String S
 * for every pair of characters from String S and T, we check for valid isomorphism
 * 
 * For maintaining a Map, I have used 2 arrays with 256 size as maximum ASCII characters can be 256
 * '\u0000' is the first character in the ASCII list.
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sMap = new char[256];
        char[] tMap = new char[256];
        
        for (int i=0; i<s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            
            if (sMap[chS - '\u0000'] != '\u0000') {
                // mapping already exists
                if (sMap[chS - '\u0000'] != chT - '\u0000') return false;
            } else {
                // mapping does not exist
                sMap[chS - '\u0000'] = (char)(chT - '\u0000');
                
                // check the tMap if the reverse mapping is also valid
                if (tMap[chT - '\u0000'] != 0) return false;
                else {
                    tMap[chT - '\u0000'] = (char)(chS - '\u0000');
                }
            }
            
        }

        // if we reach here, means that we exhausted the loop without returning false.
        // Means the strings are isomorphic 
        return true;
    }
}