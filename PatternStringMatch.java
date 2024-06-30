import java.util.HashMap;
import java.util.Map;


//Time Complexity: O(N)
//Space Complexity: O(N)

public class PatternStringMatch {
    public boolean wordPattern(String pattern, String s) {
        String[] splitString = s.split(" ");
        Map<Character, String> charToString = new HashMap<>();
        Map<String, Character> stringToChar = new HashMap<>();

        if (pattern.length() != splitString.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = splitString[i];


            if (charToString.containsKey(c)) {
                if (!charToString.get(c).equals(word)) {
                    return false;
                }
            } else {
                charToString.put(c, word);
            }


            if (stringToChar.containsKey(word)) {
                if (!stringToChar.get(word).equals(c)) {
                    return false;
                }
            } else {
                stringToChar.put(word, c);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PatternStringMatch solution = new PatternStringMatch();


        System.out.println(solution.wordPattern("abba", "dog cat cat dog"));
        System.out.println(solution.wordPattern("abba", "dog cat cat fish"));
        System.out.println(solution.wordPattern("aaaa", "dog cat cat dog"));

    }
}
