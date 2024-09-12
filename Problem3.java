// Time Complexity : O(n) where n is the length of pattern
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * we are using two hashmaps to keep track of the mappings from character from first string to the word in the words array and backwards
 * we store the mapping for character from first string to individual word.
 * If at any position we find mapping to be different, we return false
**/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> pMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();
        
        String[] words = s.split(" ");
        
        if(words.length != pattern.length()) {
            return false;
        }
        
        for(int j=0;j<pattern.length();j++) {
            if(!pMap.containsKey(pattern.charAt(j))) {
                // there is no mapping for character --> word
                pMap.put(pattern.charAt(j), words[j]);
                
                if (wordMap.containsKey(words[j])) {
                    // there is a backward map already existing for the word.
                    return false;
                } else {
                    wordMap.put(words[j], pattern.charAt(j));
                }
            } else {
                // there is already a mapping existing for character --> word
                if (pMap.get(pattern.charAt(j)).equals(words[j]) && wordMap.get(words[j]) == pattern.charAt(j)) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        
        return true;
    }
}