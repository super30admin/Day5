//https://leetcode.com/problems/isomorphic-strings/
/*
Time: O(N) where N = Length of s or t
Space: O(1) - Sizes of Frequency Arrays are fixed, don't vary with string length
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0)
            return false;

        int n = s.length();
        int[] freqS = new int[256];
        int[] freqT = new int[256];

        for (int i = 0; i < n; i++) {
            if (freqS[s.charAt(i)] != freqT[t.charAt(i)])
                return false;

            freqS[s.charAt(i)] = i + 1;
            freqT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
