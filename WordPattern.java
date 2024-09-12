// Time Complexity : O(N) where N represents number of words in s or number of chars in pattern
// Space Complexity : O(M), where M represents number of unique words in s
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : n/a

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<Character, String>();
        Map<String, Character> map2 = new HashMap<String, Character>();
        String[] words = s.split(" ");
        
        //edge case: pattern and words not same length
        if (pattern.length() != words.length){
            return false;
        }
        
        for (int i = 0; i < words.length; i++){
            if (!map1.containsKey(pattern.charAt(i)) && !map2.containsKey(words[i])){ // not in either hash map, add to both
                map1.put(pattern.charAt(i), words[i]);
                map2.put(words[i], pattern.charAt(i));
            }
            
            else if (!map1.containsKey(pattern.charAt(i)) && map2.containsKey(words[i])){
                return false;
            }
            
            else if (map1.containsKey(pattern.charAt(i)) && !map1.get(pattern.charAt(i)).equals(words[i])){ // value does not map to key
                return false;
            }
            
        }
        return true;
    }
}