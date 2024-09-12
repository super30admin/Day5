// Time Complexity : O(N) 
// Space Complexity : O(M)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
import java.util.*;
class WordPatternSolution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if(!charMap.containsKey(c)){
                if(wordMap.containsKey(w)) {
                    return false;
                }
                else {
                    charMap.put(c, w);
                    wordMap.put(w, c);
                }
            }
            else {
                String mapped = charMap.get(c);
                if (!mapped.equals(w)) {
                    return false;
                }
            }
        }
        return true;
    }
}