// Time Complexity : O(n) --> where n is length of string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (205): Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    HashMap<Character, Character> sMap;
    HashMap<Character, Character> tMap;
    
    Solution() {
        sMap = new HashMap<>();
        tMap = new HashMap<>();
    }
    
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        
        char sChar;
        char tChar;
        
        for (int i = 0; i < s.length(); i++) {
            sChar = s.charAt(i);
            tChar = t.charAt(i);
            
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) return false;
            }
            else {
                sMap.put(sChar, tChar);
            }
            
            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) return false;
            }
            else {
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}