import java.util.*;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> mapChar = new HashMap<>();
        HashMap<String, Character> mapWord = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (!mapChar.containsKey(c)) {
                if (mapWord.containsKey(word)) {
                    return false;
                } else {
                    mapChar.put(c, word);
                    mapWord.put(word, c);
                }
            } else {
                String mapped = mapChar.get(c);
                if (!mapped.equals(word))
                    return false;
            }
        }
        return true;

    }
}
