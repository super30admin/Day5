//BruteForceApproach

//TC: O(n) where n is length of strings
//SC: O(c) where c is count of unique chars in input strings
//approach: maintain 2 hashmaps, each containing mappings from one input string to other and vice versa
//  iterate through both strings if mapping is not there in map, add, if present, check if same or not

import java.util.HashMap;

public class IsomorphicStrings {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            HashMap<Character, Character> mapST = new HashMap<>();
            HashMap<Character, Character> mapTS = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char charS = s.charAt(i);
                char charT = t.charAt(i);

                if (mapST.containsKey(charS)) {
                    if (mapST.get(charS) != charT) {
                        return false;
                    }
                } else {
                    mapST.put(charS, charT);
                }

                if (mapTS.containsKey(charT)) {
                    if (mapTS.get(charT) != charS) {
                        return false;
                    }
                } else {
                    mapTS.put(charT, charS);
                }
            }

            return true;
        }

        public static void main(String[] args) {
            IsomorphicStrings solution = new IsomorphicStrings();

            // Test cases
            System.out.println(solution.isIsomorphic("egg", "add")); // Output: true
            System.out.println(solution.isIsomorphic("foo", "bar")); // Output: false
            System.out.println(solution.isIsomorphic("paper", "title")); // Output: true
        }

}
