import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Same logic as Isomorphic Strings. Instead of map of character, character and set of character, here I created map of 
character, String and Set of String.
*/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();
        String[] words = s.split(" ", 0);
        
        if (words.length != pattern.length()) return false;

        for (int i=0; i<pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            if (map.containsKey(currentChar)) {
                if (!words[i].equals(map.get(currentChar))) {
                    return false;
                }
            } else {
                if (uniqueWords.contains(words[i])) {
                    return false;
                }
                map.put(currentChar, words[i]);
                uniqueWords.add(words[i]);
            }
        }
        return true;
    }
}