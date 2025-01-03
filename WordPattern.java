
/**
 * Time Complexity: O(n + k) where n is the length of string s and k is the length of pattern 
 * Space Complexity: O(n) where n is the length of string s
 * 
 * Approach: We maintain 2 hashmaps. One to create character to word mapping,
 * Other mapping for word to character mapping.
 * We iterate over every character in the pattern.
 * If that character is not present in charMap, we add it with value as corresponding word at that index in string s.
 * If that word is not present in wordMap, we add it with value as corresponding char at that index in pattern.
 * If the mapping exists in either map, we compare the value. If it is not equal, we return false.
 * The assumption is that one character should be mapped to one word and vice versa.
 */

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

  public boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");
    if (words.length != pattern.length()) {
      return false;
    }

    Map<Character, String> charMap = new HashMap<>();
    Map<String, Character> wordMap = new HashMap<>();

    for (int i = 0; i < pattern.length(); i++) {
      char c = pattern.charAt(i);
      String word = words[i];

      if (!charMap.containsKey(c)) {
        charMap.put(c, word);
      }

      if (!wordMap.containsKey(word)) {
        wordMap.put(word, c);
      }

      if (!charMap.get(c).equals(word) || !wordMap.get(word).equals(c)) {
        return false;
      }
    }
    return true;
  }

}
