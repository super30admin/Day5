package Hashing1;

import java.util.HashMap;

public class question13_isomorphicStrings {
    /*
    Using 2 HashMaps ---->
        Time Complexity : O(n)
        Space Complexity: O(1)
     */
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // s to t mapping
            if (!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
            } else {
                if (sMap.get(sChar) != tChar) return false;
            }

            // t to s mapping
            if (!tMap.containsKey(tChar)) {
                tMap.put(tChar, sChar);
            } else {
                if (tMap.get(tChar) != sChar) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
