import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class WordPatternSolution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < pattern.length(); i += 1) {
            char patternChar = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(patternChar)) {
                if(!word.equals(map.get(patternChar))) {
                    return false;
                }
            } else {
                if(set.contains(word)) {
                    return false;
                }
                map.put(patternChar, word);
                set.add(word);
            }
        }
        return true;
    }
}