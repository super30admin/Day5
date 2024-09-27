import java.util.*;

class Solution {
    // One hashmap and One Hashset solution
    // Time complexity is O(n) since we are iterating over a n length string
    // Space complexity is O(1) since we have only 26 character in english
    // This solution is submitted on leetcode without any errors.
    public boolean isIsomorphic(String s, String t) {
        // Edge case
        if(s == null || s.length() == 0) return false;
        if(t == null || t.length() == 0) return false;
        if (s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<s.length();i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            // One to one mapping in  map and set
            if(!map.containsKey(sCh)) {
                if(set.contains(tCh)) return false;
                map.put(sCh,tCh);
                set.add(tCh);
            } else {
                char val = map.get(sCh);
                if(val!=tCh) return false;
            }
        }
        return true;
    }
}