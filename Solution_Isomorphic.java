/*
Time Complexity : O(n)
Space Complexity : O(1) beacause it can store maximum 256 characters


*/

import java.util.*;

class Solution_Isomorphic {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {

            char sch = s.charAt(i);
            char tch = t.charAt(i);

            if (sMap.containsKey(sch)) {

                char get = sMap.get(sch);
                if (get != t.charAt(i)) {
                    return false;
                }
            } else {
                sMap.put(sch, tch);
            }

            if (tMap.containsKey(tch)) {

                char get = tMap.get(tch);
                if (get != s.charAt(i)) {
                    return false;
                }
            } else {

                tMap.put(tch, sch);
            }

        }

        return true;

    }
}