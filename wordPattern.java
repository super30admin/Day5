// Time Complexity :O(N) 
// Space Complexity :O(N) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Split the string 's' into an array of words based on spaces
        String[] splitString = s.split(" ");
        
        // If the number of words in 's' does not match the length of 'pattern', return false
        if (splitString.length != pattern.length())
            return false;
        
        // HashMap to store mappings from characters in 'pattern' to words in 's'
        HashMap<Character, String> charToWord = new HashMap<>();
        
        // HashMap to store reverse mappings from words in 's' to characters in 'pattern'
        HashMap<String, Character> wordToChar = new HashMap<>();
        
        // Iterate over each character in 'pattern'
        for (int i = 0; i < pattern.length(); i++) {
            // Current character in 'pattern'
            Character sChar = pattern.charAt(i);
            
            // Corresponding word in 's' at the same position
            String temp = splitString[i];
            
            // If 'charToWord' does not already contain 'sChar', add a mapping
            if (!charToWord.containsKey(sChar))
                charToWord.put(sChar, temp);
            
            // If 'wordToChar' does not already contain 'temp', add a reverse mapping
            if (!wordToChar.containsKey(temp))
                wordToChar.put(temp, sChar);
            
            // Check consistency of mappings
            if (!charToWord.get(sChar).equals(temp) || !wordToChar.get(temp).equals(sChar))
                return false; // Return false if mappings are inconsistent
        }
        
        // If all mappings are consistent, return true
        return true;
    }
}
