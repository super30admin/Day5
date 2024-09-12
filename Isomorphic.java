import java.util.*;
class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap <Character, Character> sMap = new HashMap<>();
        HashMap <Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i ++ ) {
            char sString = s.charAt(i);
            char tString = t.charAt(i);
            if(sMap.containsKey(sString)) {
                if(sMap.get(sString) != tString) {
                    return false;
                } 
            } else {
                sMap.put(sString, tString);
            }
            if(tMap.containsKey(tString)) {
                if(tMap.get(tString) != sString) {
                    return false;
                } 
            } else {
                tMap.put(tString, sString);
            }
        }
    return true;
    }
}