// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
//https://leetcode.com/problems/word-pattern/
// Any problem you faced while coding this : No
import java.util.HashMap;
import java.util.Map;

public class IsomorphicWordtoChar {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length!=pattern.length())
            return false;
        Map<Character,String> charToWord = new HashMap<>();
        Map<String,Character> wordToChar = new HashMap<>();

        for(int i=0;i<words.length;i++){
            char c = pattern.charAt(i);
            String word = words[i];
            if(charToWord.containsKey(c) && !charToWord.get(c).equals(word))
                return false;

            if(wordToChar.containsKey(word) && wordToChar.get(word)!=c)
                return false;
            
            charToWord.put(c, word);
            wordToChar.put(word, c);
        }
        return true;
    }
}
