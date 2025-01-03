// Time Complexity: O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Your code here along with comments explaining your approach in three sentences only
/**
 * Approach: 
 * In this problem I have to check that each character in the pattern maps to a unoque word in s.
 * I solved this problem using two HashMap, one is patternMap that maps characters from the pattern to words in s and
 * other is strMap that maps words in s back to characters in the pattern. Each character in the pattern maps to one unique word,
 * and each word in the string maps to one unique character. if both mapping are correct according to condition, 
 * return true otherwise return false.
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Split the string s into an array of words
        String[] strArray = s.split(" ");

        // If the length of the pattern and the number of words in 's' are different, return false
        if (pattern.length() != strArray.length) {
            return false;
        }
        
        //  Create patternMap to maps each character in the pattern to a word in 's'
        HashMap<Character, String> patternMap = new HashMap<>();

        // Create strMap to maps each word in 's' to a character in the pattern
        HashMap<String, Character> strMap = new HashMap<>();

        // Iterate through the pattern and the array of words 
        for (int i = 0;i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = strArray[i];

            // If the current character 'c' is already mapped to a word, check if the word matches
            if (patternMap.containsKey(c)) {
                // If the word doesn't match, return false
                if(!str.equals(patternMap.get(c))) {
                    return false;
            
            } else {
                // If not mapped then add the new mapping from character to word
                patternMap.put(c, str);
            }
            // Check if the word 'str' is already mapped to a character 'c'
            if(strMap.containsKey(str)) {

                //If the word maps to a different character than 'c', return false
                if(strMap.get(str) != c) {
                    return false;
                }
            }
            else {
                // If not mapped then add the new mapping from word to character
                strMap.put(str, c);
            }
        }
        // If all checks passed, the pattern matches the string s
        return true;
    }
} 
