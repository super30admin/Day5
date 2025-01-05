// Time Complexity : O (nk) where n = number of words in pattern, k = avg length of words
// Space Complexity : O (n) where n = number of words/letters
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach
/*
 * Similar to isomorphic strings
 * Split the pattern into a word array.
 * Maintain two maps, letter <-> word and word <-> letter
 * In case of a mismatch at any time, return false
 * Else continue adding and return true.
 */
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] t = s.split(" ");
        if(pattern.length() != t.length) return false;
        int l = pattern.length();
        Map<Character, String> stMap = new HashMap<>();
        Map<String, Character> tsMap = new HashMap<>();
        for(int i = 0; i < l; i++) {
            char sc = pattern.charAt(i);
            String tc = t[i];
            if ((stMap.containsKey(sc) && !stMap.get(sc).equals(tc))
                    || (tsMap.containsKey(tc) && tsMap.get(tc) != sc)) {
                return false;
            }
            tsMap.put(tc, sc);
            stMap.put(sc, tc);
        }
        return true;
    }
}
