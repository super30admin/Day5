// Time Complexity : O(k) where k is the length of the pattern String
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/*
 * The idea is to use Map to maintain a mapping for every unique character in Pattern String --> word in String S
 * Also, we maintain another HashSet to maintain the set to track which words are already seen
 * for every pair of characters from Pattern String and word in String S, we check for valid isomorphism.
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");
        
        // base case
        if (words.length != pattern.length()) {
            return false;
        }
        
        // create a Map for Pattern char --> word in String s
        String[] map = new String[26];
        
        // Create a HashSet for maintaining a word if that is already seen
        // it serves as a reverse map for Word --> char in pattern
        Set<String> hashSet = new HashSet<>();
        
        for (int i=0; i<pattern.length(); i++) {
            char chPattern = pattern.charAt(i);
            String word = words[i];
            
            if (map[chPattern - 'a'] != null) {
                // mapping exists
                // verify if the new mapping is also correct
                
                if (!map[chPattern - 'a'].equals(word)) {
                    return false;
                } 
            } else {
                // mapping does not exist
                // Store the mapping
                map[chPattern - 'a'] = word;
                
                // check the reverse mapping
                if (hashSet.contains(word)) return false;
                else {
                    hashSet.add(word);
                }
            }
        }
        
        return true;
    }
}