// Time Complexity: O(n)
// Space Complexity: O(m)
// Word Pattern
import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Split the string s into words
        String[] words = s.split(" ");
        
        // If the number of words and the length of the pattern do not match, return false
        if (words.length != pattern.length()) {
            return false;
        }

        // Create two hash maps to store the character-to-word and word-to-character mappings
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        // Iterate over the pattern characters and words
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Check the character-to-word mapping
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false; // If current mapping does not match the word, return false
                }
            } else {
                if (wordToChar.containsKey(word)) {
                    return false; // If the word is already mapped to another character, return false
                }
                // Create new mappings
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
        }

        // If all mappings are consistent, return true
        return true;
    }
}
