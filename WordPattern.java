//https://leetcode.com/problems/word-pattern/

/*
Time: O(N) where N = length of the pattern or Number of words in s
Space: O(N) for HashMap
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None

*/
import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");

        if (pattern == null || s == null || pattern.isEmpty() || s.isEmpty() || pattern.length() != words.length) {
            return false;
        }

        Map map = new HashMap<>();

        int n = words.length;
        for (Integer i = 0; i < n; i++) {
            // put returns the previous value associated with key, or null if there was no
            // mapping for key.
            if (map.put(pattern.charAt(i), i) != map.put(words[i], i))
                return false;
        }

        return true;

    }

}
