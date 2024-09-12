package nov22OOPs;

import java.util.HashMap;

// Problem 12
// LeetCode 205
// https://leetcode.com/problems/isomorphic-strings/
// https://github.com/super30admin/Hashing-1/
public class isomorphicStrings205 {
public boolean isIsomorphic (String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }

	// Time complexity o(n)
	// Space complexity o(1)

}
