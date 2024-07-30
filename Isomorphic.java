// Problem 205. Isomorphic Strings
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if (len1 != len2) {
            return false;
        }
        char[] map1 = new char[100];
        char[] map2 = new char[100];

        for (int i = 0; i < len1; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map1[c1 - ' '] != 0) {
                if (map1[c1 - ' '] != c2) {
                    return false;
                }
            } else {
                map1[c1 - ' '] = c2;
            }
            if (map2[c2 - ' '] != 0) {
                if (map2[c2 - ' '] != c1) {
                    return false;
                }
            } else {
                map2[c2 - ' '] = c1;
            }
        }
        return true;
    }
}
