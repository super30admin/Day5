import java.util.HashMap;

/**
 * Time Complexity: O(N)
 * Space complexity: O(N)
 * Ran on leetcode?  Yes
 * Problems faced? No
 */
public class WordPattern {
    /**
     * Split the string into String[] and check mapping of character against words and vice versa
     * Similar to isomporphic string approach
     */
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (charToWord.containsKey(ch)) {
                if (wordToChar.containsKey(word)) {
                    if (!charToWord.get(ch).equals(word) && !wordToChar.get(word).equals(ch))
                        return false;
                } else {
                    return false;
                }
            }
            charToWord.put(ch, word);
            if (wordToChar.containsKey(word) && !wordToChar.get(word).equals(ch))
                return false;
            wordToChar.put(word, ch);
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abbbtc";
        String s = "this is is is a test";
        WordPattern obj = new WordPattern();
        boolean result = obj.wordPattern(pattern, s);
        System.out.println("result: " + result);
        assert (result);
    }
}
