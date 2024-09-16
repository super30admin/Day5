import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : None.

class isomorphic {
    public boolean isIsomorphic (String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            }
            else {
                sMap.put(sChar, tChar);
            }

            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar) return false;
            }
            else {
                tMap.put(tChar, sChar);
            }
        }

        return true;


    }
}
