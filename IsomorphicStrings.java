import java.util.Arrays;

// Time Complexity :O(n) where n is the length of string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
//https://leetcode.com/problems/isomorphic-strings/
// Any problem you faced while coding this : no
// Approach: Created two arrays of 256 size and stored the mapping for both s to t and t to s, checked for correctness

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] ss = new int[256];
        int[] tt = new int[256];
        Arrays.fill(ss, -1);
        Arrays.fill(tt, -1);
        for(int i = 0; i < s.length(); i++) {
            if (ss[s.charAt(i)] == -1 && tt[t.charAt(i)] == -1) {
                ss[s.charAt(i)] = t.charAt(i);
                tt[t.charAt(i)] = s.charAt(i);
            } else if (ss[s.charAt(i)] != t.charAt(i) || tt[t.charAt(i)] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "paper", t = "title";
        IsomorphicStrings is = new IsomorphicStrings();
        System.out.println(is.isIsomorphic(s, t));
    }
}
