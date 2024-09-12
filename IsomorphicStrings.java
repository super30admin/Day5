import java.util.HashMap;

//Time Complexity: O(n)  // as we check ech char in the string.
//Space Complexity:O(1)  // standard/ fixed number of characters.
//Did it successfully run on leetcode: yes

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> smap = new HashMap();
        HashMap<Character, Character> tmap = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (smap.containsKey(sChar)) { // s mapping with t
                if (smap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                smap.put(sChar, tChar);
            }

            if (tmap.containsKey(tChar)) { // t mapping with s
                if (tmap.get(tChar) != sChar) {
                    return false;
                }
            } else {
                tmap.put(tChar, sChar);
            }

        }
        return true;

    }
}