// Approach: A one-to-one mapping (in both directions) is required between the characters of the two strings. An invalid mapping occurs
// when a character in one string maps to more than one character in the other. For example, mappings that take the form < (one-to-many)
// or > (many-to-one) are invalid. Use a hashmap to check for < mappings and a hashset to check for > mappings. Return true if no invalid
// mappings are found.
// Time Complexity : O(n) where n - s.length()
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
public class IsomorphicStrings {

    boolean areIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> mappedCharSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                } else {
                    continue;
                }
            } else if (mappedCharSet.contains(t.charAt(i))) {
                return false;
            } else {
                map.put(s.charAt(i), t.charAt(i));
                mappedCharSet.add(t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings is = new IsomorphicStrings();
        String s = "paper", t = "title";
        System.out.println("Given strings are isomorphic (true/false): " + is.areIsomorphic(s, t));
    }
}