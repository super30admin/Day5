// Time Complexity : O(n), 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package hashing1;

import java.util.*;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        //char [] ch = new char [];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
            } else {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            }
            if (!tMap.containsKey(tChar)) {
                tMap.put(tChar, sChar);
            } else {
                if (tMap.get(tChar) != sChar) {
                    return false;
                }
            }
        }
        return true;
    }
}
