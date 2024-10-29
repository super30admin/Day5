// Time Complexity O(m +n) where m and n are lengths of string snd pattern
// Space complexity is constant - O(m+n)
// Ran on leetcode : Yes
// problems faced : No

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s ){
        // split the sting
        String [] words = s.split(" ");
        if (pattern.length() != words.length){
            return false;
        }

        // Create 2 hashmaps for chatToword and wordTochar Mapping
        HashMap <Character, String> charToWordMap = new HashMap<>();
        HashMap <String, Character> wordToCharMap = new HashMap<>();


        for (int i = 0; i<words.length; i++){
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];
        // If the current mapping from char to word or word to char does not exist
        // or is inconsistent, return false
            if(!charToWordMap.getOrDefault(currentChar, currentWord).equals(currentWord)
                    || wordToCharMap.getOrDefault(currentWord, currentChar) != currentChar){
                return false;
            }
            // update the mappings ]
            charToWordMap.put(currentChar,currentWord );
            wordToCharMap.put(currentWord, currentChar);
        }
        return true;

    }

    public static void main (String [] args){
        WordPattern word = new WordPattern();
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        String pattern2 = "abba";
        String s2 = "dog cat cat fish";

        System.out.println("The output is " +word.wordPattern(pattern1, s1 ));
        System.out.println("The output is " +word.wordPattern(pattern2, s2 ));
    }
}
