/*
Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true
Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false
Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false
Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false Notes: You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
*/
import java.util.*;

class Solution {

    //Time Complexity : O(N)
    //Space Complexity : O(N)
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        if (pattern.length() != words.length)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char patternCharacter = pattern.charAt(i);
            String word = words[i].trim();
            String mappedWord = map.get(patternCharacter);
            Character mappedChar = reverseMap.get(word);
            
            if (mappedWord == null && mappedChar == null) { // Not yet mapped
                map.put(patternCharacter, word);
                reverseMap.put(word, patternCharacter);
            } else if (mappedWord == null && mappedChar != null) {
                if (mappedChar == patternCharacter) {
                    map.put(patternCharacter,word);
                } else {
                    return false;
                }
            } else if (!mappedWord.equals(word)) {
                return false;
            }
        }

        return true;
    }
}