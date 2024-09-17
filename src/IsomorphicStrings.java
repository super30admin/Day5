// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.*;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap.containsKey(sChar)) {
                if (!sMap.get(sChar).equals(tChar))
                    return false;
            }
            else {
                sMap.put(sChar, tChar);
            }

            if (tMap.containsKey(tChar)) {
                if (!tMap.get(tChar).equals(sChar))
                    return false;
            }
            else {
                tMap.put(tChar, sChar);
            }
        }

        return true;
    }
}