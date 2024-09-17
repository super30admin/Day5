/**
 * time complexity is O(n) where n is length of string
 * space complexity is O(n) as well.
 */

import java.util.HashMap;
import java.util.Map;

class isIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) {
            return false;
        }
        
        if(s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            Character schar = s.charAt(i);
            Character tchar = t.charAt(i);
            
            if(smap.containsKey(schar) && smap.get(schar) != tchar) {
                return false;
            }
            if(tmap.containsKey(tchar) && tmap.get(tchar) != schar) {
                return false;
            }
            smap.put(schar, tchar);
            tmap.put(tchar, schar);
        }
        return true;
        
    }
}