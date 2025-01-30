import java.util.Map;
import java.util.HashMap;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> patternToWord = new HashMap<>();
        Map<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c1 = pattern.charAt(i);
            String c2 = words[i];

            if (patternToWord.containsKey(c1)) {
                if (!patternToWord.get(c1).equals(c2)) {
                    return false;
                }
            } else {
                if (wordToPattern.containsKey(c2)) {
                    if (wordToPattern.get(c2) != c1) {
                        return false;
                    }
                }
                patternToWord.put(c1, c2);
                wordToPattern.put(c2, c1);
            }
        }
        return true;
    }
}