// Time Complexity : O (n) where n = number of letters in each string
// Space Complexity : O (1) since we are mapping max 26 letters
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach
/*
 * Maintain two maps, letters1 <-> letters2 and letters2 <-> letters1
 * In case of a mismatch at any time, return false
 * Else continue adding and return true.
 */
import java.util.*;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int l = s.length();
        Map<Character, Character> stMap = new HashMap<>();
        Map<Character, Character> tsMap = new HashMap<>();
        for(int i = 0; i < l; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(stMap.get(sc) == null) {
                stMap.put(sc, tc);
            }
            else if(stMap.get(sc) != tc) {
                return false;
            }
            if(tsMap.get(tc) == null) {
                tsMap.put(tc, sc);
            }
            else if(tsMap.get(tc) != sc) {
                return false;
            }
        }
        return true;
    }
}
