import java.util.HashMap;
import java.util.HashSet;

public class Pattern {
    public boolean wordPattern(String pattern, String s) {
        if (s == null && pattern != null || s != null && pattern == null) {
            return false;
        }
        String[] words = s.trim().split("\\s+");
        if (words.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> sMap = new HashMap<>();
        HashSet<String> tSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            char sChar = pattern.charAt(i);
            String str = words[i];
            if (!sMap.containsKey(sChar)) {
                sMap.put(sChar, str);
                if (tSet.contains(str)) {
                    return false;
                }
                tSet.add(str);
            } else {
                if (!sMap.get(sChar).equals(str))
                    return false;
            }
        }
        return true;
    }
}
