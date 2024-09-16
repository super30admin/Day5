// Time Complexity : O(n) where n is number of characters in any of the two strings.
// Space Complexity : O(N) - used by the hashMaps.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : started with just one map first not realizing that it needs 1:1 mapping.

import java.util.*;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        Isomorphic iso = new Isomorphic();
        boolean response = iso.isIsomorphic(s, t);

        System.out.println(response);
    }

    public boolean isIsomorphic(String s, String t) {
        //need two maps for 1:1 mapping
        Map<Character, Character> isoMapS = new HashMap<>();
        Map<Character, Character> isoMapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            Character iS = s.charAt(i);
            Character iT = t.charAt(i);
    
            //for each character we put in respective maps
            //put returns last value or null
            Character retS = isoMapS.put(iS, iT);
            Character retT = isoMapT.put(iT, iS);

            //if last value for each s and t is not null and is not equal
            // to current S and T chars, not isomorphic
            if((retS != null && retS != iT) ||
                (retT != null && retT != iS)) {
                return false;
            }
         }
        
         //strings are isomorphic
        return true;
    }
}