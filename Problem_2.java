// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach : Used two fixed-size arrays to track character mappings between the strings,
// ensuring each character from one string maps to exactly one character from the other string consistently.
// If any inconsistency is found, it returns false; otherwise, it returns true.
class SolutionIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = new char[256];
        char[] tArr = new char[256];
        for(int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(tArr[tChar] != '\u0000' && tArr[tChar] != sChar) {
                return false;
            } else if(sArr[sChar] != '\u0000' && sArr[sChar] != tChar) {
                return false;
            } else {
                tArr[tChar] = sChar;
                sArr[sChar] = tChar;
            }
        }
        return true;
    }
}