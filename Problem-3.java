import java.util.HashMap;
import java.util.HashSet;

// Time Complexity : O(N) [...where N: lenght of pattern]  
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// Idea is to create a mapping of each character in pattern with each word in s. 
// We need to keep track of the mapped words so we use wordSet for this

class Solution3 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length)
            return false;

        int n = words.length;

        HashMap<Character, String> patternMapper = new HashMap<>();
        HashSet<String> wordSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            char key = pattern.charAt(i);
            String word = words[i];

            if (patternMapper.containsKey(key)) {
                // Check if previously mapped key matches with current word
                if (!patternMapper.get(key).equals(word)) {
                    return false;
                }
            } else {
                if (wordSet.contains(word)) {
                    // this word is already been mapped, and currently has diffrent value
                    return false;
                }
                // add new mapping
                patternMapper.put(key, word);
                wordSet.add(word);
            }
        }

        return true;
    }
}
