// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach:
// We can keep two maps, to keep which character from pattern S is mapped to word in string array T and vice versa.
// We compare each character from S with corresponding word in T, and check if the mappings in both the maps are same.
// In another words, we check if a character from S is mapped a word in T and the word in T is mapped to the same character in S.
// Then the characters and words in strings are correctly mapped.
// But if a character in S is mapped to T and if the opposite is not true, then the characters and words are not correctly mapped.

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        if (pattern.equals("")) return false;
        if (pattern.length() == 1) return true;

        Map<Character, String> char_to_word = new HashMap<>();
        Map<String, Character> word_to_char = new HashMap<>();

        String[] array = str.split(" ");
        if (pattern.length() != array.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            String mappedWord = array[i];
            char_to_word.put(patternChar, mappedWord);
            word_to_char.put(mappedWord, patternChar);
        }

        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            String word = char_to_word.get(patternChar);

            if (!word.equals(array[i]) || word_to_char.get(word) != patternChar) {
                return false;
            }
        }

        return true;
    }
}
