// Time Complexity: O(1)
// Space Complexity: O(n log n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No problem while coding

import java.util.HashMap;

public class isIsomorphic {

    public static boolean checkIsIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) return false;
            } else {
                sMap.put(sChar, tChar);
            }

            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) return false;
            } else {
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "ads";
        System.out.println("egg -> ads: isIsomorphic: " + checkIsIsomorphic(s, t));
        System.out.println("egg -> add: isIsomorphic: " + checkIsIsomorphic("egg", "add"));
    }
}