/*
    1. Time Complexity : O(n)
    2. Space Complexity : O(1)   
    3. Did this code successfully run on Leetcode : Yes
    4. Any problem you faced while coding this : -
 */

/*
 * Created two maps (used array of size 128 for ASCII instead of HashMap)
 * to save mapping of chars from s to t and t to s respectively.
 * If a char mapped s to a char in t then the same char in t must be mapped to same char in s.
 * if not then the strings are not isomorphic.
 * If all chars satisfy the mapping then the strings are isomorphic
 * 
 */

class Solution {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sMap = new char[128];
        char[] tMap = new char[128];
        char a, b;
        for (int i = 0; i < s.length(); ++i) {
            a = s.charAt(i);
            b = t.charAt(i);
            if (sMap[a - '\0'] != '\0' && sMap[a - '\0'] != b) return false;
            sMap[a - '\0'] = b;
            if (tMap[b - '\0'] != '\0' && tMap[b - '\0'] != a) return false;
            tMap[b - '\0'] = a;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "paper" , t = "title";
        System.out.println("Strings "+ s + " and "+ t + " are isomorphic : " + isIsomorphic(s, t));
    }
}