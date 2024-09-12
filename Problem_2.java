// Time Complexity : O(N) where n = length of s or t
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i += 1) {
            if (sMap.get(s.charAt(i)) == null) {
                sMap.put(s.charAt(i), t.charAt(i));
            } else {
                if (sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            if (tMap.get(t.charAt(i)) == null) {
                tMap.put(t.charAt(i), s.charAt(i));
            } else {
                if (tMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }

        }
        return true;
    }
}
