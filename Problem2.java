// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.*;

public class Problem2 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sC = s.charAt(i);
            char tC = t.charAt(i);
            if (map1.containsKey(sC)) {
                if (map1.get(sC) != tC) {
                    return false;
                }
            } else if (map2.containsKey(tC)) {
                if (map2.get(tC) != sC) {
                    return false;
                }
            }
            map1.put(sC, tC);
            map2.put(tC, sC);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "acc";
        System.out.println(isIsomorphic(s, t));
    }
}
