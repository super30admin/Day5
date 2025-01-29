package problem2;

//less efficient approach

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

import java.util.HashMap;
import java.util.HashSet;

public class Approach2 {

    public static void main(String[] args) {
        String s = "egg";
//        String t = "add";
        String t = "adw";

//        String s = "foo";
//        String t = "bar";

//        String s = "paper";
//        String t = "title";

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap();
        HashMap<Character, Character> tMap = new HashMap();

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
            } else {

                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            }

            if (!tMap.containsKey(tChar)) {
                tMap.put(tChar, sChar);
            } else {

                if (tMap.get(tChar) != sChar) {
                    return false;
                }
            }
        }

        return true;
    }
}
