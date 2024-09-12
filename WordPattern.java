// Time Complexity : O(n)
// Space Complexity : O(n + k) where 'k' is the length of strings
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : coding the logic for reverse mapping

import java.util.*;
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
     
        String[] splits = s.split(" ");
       
        if(pattern.length() != splits.length) {
            return false;
        }
        
        // create maps to store mappings and reverse mappings
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for(int i=0; i<pattern.length(); i++) {

            char currChar = pattern.charAt(i);
            String currString = splits[i];

            // if the character in pattern is already mapped
            if(map1.containsKey(currChar)) {
                
                // if the saved value for the character in pattern is different from the current corresponding string, return false
                if(!map1.get(currChar).equals(currString)) {
                    return false;
                }
            } else {

                // if the character in pattern is not saved, but the current corresponding string is already mapped to some other character, return false
                if(map2.containsKey(currString)) {
                    return false;
                } 

                // save the mapping and reverse mapping
                map1.put(currChar, currString);
                map2.put(currString, currChar);
            }

        }

        return true;
    }    
}