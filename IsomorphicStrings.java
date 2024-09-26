//time o(n) where n is the length of the string
//space o(1) the map and set will have fixed size

import java.util.*;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> sMap = new HashMap<>();
        Set<Character> tMap = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!sMap.containsKey(sChar)) {
                if (tMap.contains(tChar))
                    return false;
                sMap.put(sChar, tChar);
                tMap.add(tChar);
            } else {
                if (sMap.get(sChar) != tChar)
                    return false;
            }
        }
        return true;
    }
}
