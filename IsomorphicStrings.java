// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach:
// We can keep two maps, to keep which character from string S is mapped to character in String T and vice versa.
// We compare each character from S with corresponding character in T, and check if the mappings in both the maps are same.
// In another words, we check if a character from S is mapped a character in T and the character in T is mapped to the same character in S.
// Then the characters in strings are correctly mapped.
// But if a character in S is mapped to T and if the opposite is not true, then the strings are not isomorphic.

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.equals("")) return true;
        if (s.length() == 1) return true;

        Map<Character, Character> s_to_t = new HashMap<>();
        Map<Character, Character> t_to_s = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            s_to_t.put(sChar, tChar);
            t_to_s.put(tChar, sChar);
        }

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = s_to_t.get(sChar);
            if (tChar != t.charAt(i) || t_to_s.get(tChar) != sChar) {
                return false;
            }
        }

        return true;
    }
}
