// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.*;

public class Problem3 {
    public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char patC = pattern.charAt(i);
            String strC = str[i];
            if (map1.containsKey(patC)) {
                if (!map1.get(patC).equals(strC)) {
                    return false;
                }
            } else if (map2.containsKey(strC)) {
                if (!map2.get(strC).equals(patC)) {
                    return false;
                }
            }
            map1.put(patC, strC);
            map2.put(strC, patC);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
