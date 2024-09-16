import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        
        for(int i = 0; i < s.length(); i += 1) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(map.containsKey(sChar)) {
                if(tChar != map.get(sChar)) {
                    return false;
                }
            } else {
                if(set.contains(tChar)) {
                    return false;
                }
                map.put(sChar, tChar);
                set.add(tChar);
            }
        }
        return true;
    }
}