// Time Complexity : O(mk) + O(nk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach



class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if(pattern.length() != words.length) return false;
        
        HashMap<Character, String> pMap = new HashMap<Character, String>();
        HashMap<String, Character> sMap = new HashMap<String, Character>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char letter = pattern.charAt(i);
            String word = words[i];
            
            // checking if the key is already present
            if(pMap.containsKey(letter)) {
                // if the value in hashmap is not matching with the current value then return false
                if(!pMap.get(letter).equals(word))
                    return false;
            }
            else
            // if not present add key value pair to hashmap
                pMap.put(letter, word);
            
            // checking if the key is already present
            if(sMap.containsKey(word)) {
                // if the value in hashmap is not matching with the current value then return false
                if(sMap.get(word) != letter)
                    return false;
            }
            else
            // if not present add key value pair to hashmap
                sMap.put(word, letter);
        }
        return true;

    }
}