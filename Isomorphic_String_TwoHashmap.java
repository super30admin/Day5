import java.util.*;

class Solution {
    // Two hashmap solution
    // Time complexity is O(n) since we are iterating over a n length string
    // Space complexity is O(1) since we have only 26 character in english
    // This solution is submitted on leetcode without any errors.
    public boolean isIsomorphic(String s, String t) {
        // Edge case
        if(s == null || s.length() == 0) return false;
        if(t == null || t.length() == 0) return false;
        if (s.length()!=t.length()) return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i = 0; i<s.length();i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            // One to one mapping in sMap
            if(!sMap.containsKey(sCh)) {
                sMap.put(sCh,tCh);
            } else {
                char val = sMap.get(sCh);
                if(val!=tCh) return false;
            }
            // One to one mapping in tMap
            if(!tMap.containsKey(tCh)) {
                tMap.put(tCh,sCh);
            } else {
                char val = tMap.get(tCh);
                if(val!=sCh) return false;
            }
        }
        return true;
    }
}