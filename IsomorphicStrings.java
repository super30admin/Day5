package s30;

import java.util.*;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Character> map = new HashMap<>();
        Set<Character> mapped = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false;
                }
            } else {
                if (mapped.contains(charT)) {
                    return false;
                }
                map.put(charS, charT);
                mapped.add(charT);
            }
        }
        
        return true;
    }
    
}
