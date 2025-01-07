// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach :
  /*We will keep 2 hashmaps, one for mapping chars of first string to other and other map for reverse mapping
  By doing this, we ensure that no two characters of one two characters map to same characters in other map*/

import java.util.HashMap;

class Isomorphic{

    public static boolean isIsomorphic(String s, String t) {
        // If the strings are of different lengths, they can't be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // HashMap to store the character mappings
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        // Iterate through both strings
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check for mapping in map1 (s -> t)
            if (map1.containsKey(charS)) {
                // If the mapping exists but doesn't match the expected character in t, return false
                if (map1.get(charS) != charT) {
                    return false;
                }
            } else {
                // If the mapping doesn't exist in map1, add it
                map1.put(charS, charT);
            }

            // Check for reverse mapping in map2 (t -> s)
            if (map2.containsKey(charT)) {
                // If the reverse mapping exists but doesn't match the expected character in s, return false
                if (map2.get(charT) != charS) {
                    return false;
                }
            } else {
                // If the reverse mapping doesn't exist in map2, add it
                map2.put(charT, charS);
            }
        }

        // If all mappings are consistent, the strings are isomorphic
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "egg";
        String t1 = "add";
        System.out.println(isIsomorphic(s1, t1));  // Output: true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(isIsomorphic(s2, t2));  // Output: false
    }



}