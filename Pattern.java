/**
 * time complexity is O(n) where n is length of string
 * space complexity is O(n) as well.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(s == null || pattern == null) {
            return false;
        }
        String[] words = s.split(" ");
        if(words.length != pattern.length()) {
            return false;
        }
        
        Map<String, Character> map = new HashMap<>();
        Set<Character> chars = new HashSet<>();

        for(int i = 0; i < pattern.length(); i++) {
            String word = words[i];
            Character ch = pattern.charAt(i);
            if(map.containsKey(word) && map.get(word) != ch || !map.containsKey(word) && chars.contains(ch)) {
                return false;
            }
            map.put(word, ch);
            chars.add(ch);
        }
        return true;
    }
}
