import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Time complexity: O(n) n- number of characters in pattern
// Space complexity: O(1)
public class WordPattern {

    // LeetCode #290
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length() == 0 || s.length() == 0) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        String[] words = s.split(" ");
        for (int i=0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if(!map.containsKey(c)) {
                map.put(c, word);
                if(set.contains(word)) return false;

                set.add(word);
            }else {
                if(!map.get(c).equals(word)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern pattern = new WordPattern();

        System.out.println("Is following = " + pattern.wordPattern("abba", "dog cat cat dog"));
    }
}
