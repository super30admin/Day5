/**
 * Time Complexity: O(N) where N is the number of characters in pattern string
 * Space Complexity: O(M) where M is the number of words in string s
 * LeetCode: Y (https://leetcode.com/problems/word-pattern/)
 * Approach: 
 *  Use two hashmaps to map character to string and string to character
 *  If there is any mismatch then return false else insert values into hashmaps and continue
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Split string s into array of strings
        String[] words = s.split(" ");
        
        // Initialize HashMap to map character -> string
        Map<Character, String> charToStringMapping = new HashMap<>();
        
        // Initialize HashMap to map string -> charcter
        Map<String, Character> stringToCharMapping = new HashMap<>();
        
        // check if pattern length is equal to the number of words in string s
        if(pattern.length() != words.length) {
            return false;
        }
        
        // Iterate through the given pattern character by character
        for(int i = 0 ; i < pattern.length() ; i++) {
            // first check if keys exist in the respective hashmaps and
            // then check mapping in both the values match
            // if there is any mismatch then return false
            if((charToStringMapping.containsKey(pattern.charAt(i)) ^ stringToCharMapping.containsKey(words[i])) || (charToStringMapping.containsKey(pattern.charAt(i)) && !(charToStringMapping.get(pattern.charAt(i)).equals(words[i]))) || (stringToCharMapping.containsKey(words[i]) && (stringToCharMapping.get(words[i]) != pattern.charAt(i)))) {
                return false;
            }
            
            // insert mapping: character -> string into hashmap
            charToStringMapping.putIfAbsent(pattern.charAt(i), words[i]);
            
            // insert mapping: string -> character into hashmap
            stringToCharMapping.putIfAbsent(words[i], pattern.charAt(i));
        }
        
        // no mismatch found so return true
        return true;
        
    }
}
