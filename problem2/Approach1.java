package problem2;

//less efficient approach

// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

import java.util.HashMap;
import java.util.HashSet;

public class Approach1 {

    public static void main(String[] args) {
//        String s = "egg";
//        String t = "add";
//        String t = "adw";

//        String s = "foo";
//        String t = "bar";

        String s = "paper";
        String t = "title";

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap();
        HashSet<Character> tSet = new HashSet();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

// key is present
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            }
            else {
                if(tSet.contains(tChar)) {
                    return false;
                } else {
                    sMap.put(sChar, tChar);
                    tSet.add(tChar);
                }
            }
        }
        return true;
    }
}
