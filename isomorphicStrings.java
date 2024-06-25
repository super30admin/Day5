/*
TC --> o(n)
SC --> O(1) for the HashMap
 */
import java.util.*;

class Solution {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> data = new HashMap<>();
        HashSet<Character> valData = new HashSet<>();
        //HashSet<Character> taken = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (data.containsKey(c1)) {
                if (data.get(c1) != c2) {
                    return false;
                }

            } else if (valData.contains(c2)) {
                return false;
            }
            data.put(c1, c2);
            valData.add(c2);
            //taken.add(c2);

        }//for
        return true;

    }
}
