// Time Complexity: O(N)
// Space Complexity: O(1)
// Isomorphic Strings
import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // If the lengths of the strings are not the same, they can't be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // Create two hash maps to store character mappings
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        // Iterate over characters of both strings
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if there is a mapping for charS
            if (mapS.containsKey(charS)) {
                // If the mapped character doesn't match charT, return false
                if (mapS.get(charS) != charT) {
                    return false;
                }
            } else {
                // Check if charT is already mapped to some other character
                if (mapT.containsKey(charT)) {
                    return false;
                }
                // Create new mappings in both hash maps
                mapS.put(charS, charT);
                mapT.put(charT, charS);
            }
        }
        // If all characters have valid mappings, return true
        return true;
    }
}
