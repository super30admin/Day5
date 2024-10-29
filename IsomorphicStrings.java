// Time Complexity O(n) We iterate through strings once
// Space complexity is constant - O(n) since 26 keys
// Ran on leetcode : Yes
// problems faced : No

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        // If the lengths are not the same, they cannot be isomorphic
        if (s.length() != t.length()) return false;

        // HashMaps to store character mappings
        HashMap<Character, Character> map = new HashMap<>();
        // HashMap<Character, Character> tToS = new HashMap<>();
        HashSet<Character> mapped = new HashSet<>(); // hashset to store already mapped characters

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check existing mappings from s to t
            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false;
                }
            } else {// we will check if character it exists in the hashset
                if (mapped.contains(charT)) {
                    return false;
                }
            }
            map.put(charS, charT);
            mapped.add(charT);

        }


        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));  // Output: true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(isIsomorphic(s2, t2));  // Output: false

        String s3 = "paper";
        String t3 = "title";
        System.out.println(isIsomorphic(s3, t3));  // Output: true
    }
}

