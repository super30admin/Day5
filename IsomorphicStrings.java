import java.util.*;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int l = s.length();
        Map<Character, Character> stMap = new HashMap<>();
        Map<Character, Character> tsMap = new HashMap<>();
        for(int i = 0; i < l; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(stMap.get(sc) == null) {
                stMap.put(sc, tc);
            }
            else if(stMap.get(sc) != tc) {
                return false;
            }
            if(tsMap.get(tc) == null) {
                tsMap.put(tc, sc);
            }
            else if(tsMap.get(tc) != sc) {
                return false;
            }
        }
        return true;
    }
}
