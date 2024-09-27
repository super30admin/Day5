// Time Complexity - O(N)
// Space Complexity - O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

public class IsomorphicString {

    // using 2 hashmaps

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            // check in smap
            if (smap.containsKey(schar)) {
                if (smap.get(schar) != tchar) return false;
            } else {
                smap.put(schar, tchar);
            }

            // check in tmap
            if (tmap.containsKey(tchar)) {
                if (tmap.get(tchar) != schar) return false;
            } else {
                tmap.put(tchar, schar);
            }
        } // end of for loop
        return true;
    }

}
