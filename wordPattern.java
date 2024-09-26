//time o(n) where n is the length of the string
//space o(1) the map and set will have fixed size

import java.util.*;

public class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        if (pattern.length() != strings.length)
            return false;
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c)) {
                if (set.contains(strings[i]))
                    return false;
                map.put(c, strings[i]);
                set.add(strings[i]);
            } else {
                if (!map.get(c).equals(strings[i]))
                    return false;
            }
        }
        return true;
    }
}
