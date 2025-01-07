
// Time Complexity : O(n+m) n is the no of characters in string and m is the length of the pattern
// Space Complexity : O(m+k) k is number of unique words in string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach :
  /*We keep two hashmaps one to map the  character in pattern to a word in str.
   * and other to map a word in str to a character in pattern
   * If all mappings are consistent, return true. Otherwise, return false.
*/

import java.util.*;

public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" "); // Split the string into words

        // If the lengths don't match, it can't follow the pattern
        if (pattern.length() != words.length) {
            return false;
        }

        // Maps to track the bijection
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Check if the character already maps to a word
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false; // Mismatch in mapping
                }
            } else {
                charToWord.put(c, word);
            }

            // Check if the word already maps to a character
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false; // Mismatch in mapping
                }
            } else {
                wordToChar.put(word, c);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "ababcac";
        String str = "cat dog cat dog fish cat fish";

        boolean result = wordPattern(pattern, str);
        System.out.println("Output: " + result); 
    }
    
}
