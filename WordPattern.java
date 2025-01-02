// Approach: A one-to-one mapping (in both directions) is required between the characters of the pattern and the space-separated strings
// of the input string. An invalid mapping occurs when a character in the pattern maps to more than one string in the string array or
// vice versa. For example, mappings that take the form < (one-to-many) or > (many-to-one) are invalid. Use a hashmap to check for <
// mappings and a hashset to check for > mappings.
// Time Complexity : O(n) where n - pattern.length()
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.Map;
import java.util.HashMap;

import java.util.Set;
import java.util.HashSet;

public class WordPattern {

    boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Set<String> mappedStrSet = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(strs[i])) {
                    return false;
                } else {
                    continue;
                }
            } else if (mappedStrSet.contains(strs[i])) {
                return false;
            } else {
                map.put(c, strs[i]);
                mappedStrSet.add(strs[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern wp = new WordPattern();
//        String s = "abba", t = "cat dog dog cat";
        System.out.println("Given string follows given pattern (true/false): " + wp.wordPattern(args[0], args[1]));
    }
}