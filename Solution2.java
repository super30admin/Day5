// Time complexity: O(N), where N is the length of string s. 
// Space complexity: O(1), since s and t consist of any valid ascii character.

import java.util.*;

class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        //if the length of s and t is not equal, return false
        if (s.length() != t.length())
            return false;
        //maintain two maps, one for mapping characters in s to characters in t, other for mapping characters in t to characters in s. 
        HashMap<Character, Character> st = new HashMap<>(); 
        HashMap<Character, Character> ts = new HashMap<>(); 
        for(int i=0; i<s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            //if maps contains key and their values are different, return false 
            if (st.containsKey(sc) && st.get(sc) != tc || (ts.containsKey(tc) && ts.get(tc) != sc)) {
                return false;
            }
            //put the character mappings in maps. 
            st.put(sc, tc);
            ts.put(tc, sc); 
        }
        return true;
    }
}
