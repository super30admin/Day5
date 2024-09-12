// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes I was using only one hashmap for mapping but it gives me false answer. 

import java.util.*;

class Main {

    public static boolean isIsomorphic(String s, String t) {
        // here we are going to use two hashMaps to check string is isomorphic or not
        // and set all the intial value to the -1 as to check it is already visited or
        // not.
        int[] sMap = new int[256];
        Arrays.fill(sMap, -1);
        int[] tMap = new int[256];
        Arrays.fill(tMap, -1);
        // if length of both string are not same than we are going to return false
        if (s.length() != t.length())
            return false;

        // here we are checking for each character for string that each are mapped as
        // per question given or not
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // here we check character in the string is already mapped or not
            if (sMap[c1] == -1 && tMap[c2] == -1) {
                sMap[c1] = c2;
                tMap[c2] = c1;

            } else {

                // if character in string is already mapped we check it is correctly mapped or
                // not. if it is not correctly mapped we return false
                // here we are using second hashmap because it may be possible diffrent
                // character is mapped to same character if we only use one hashmap than it will
                // not give a precise answer
                if (sMap[c1] != c2 || tMap[c2] != c1) {
                    return false;
                }
            }
        }

        // if all the character in the string are correctly mapped than we return true
        return true;

    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}