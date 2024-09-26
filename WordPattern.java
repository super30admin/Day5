// Time complexity: O(n) where n is the length of pattern/number of words.
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        if(pattern.length() != strArray.length) return false;
        HashMap<Character, String>pMap = new HashMap<>();
        HashMap<String, Character>sMap = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = strArray[i];
            if(pMap.containsKey(c)) {               // Check if pattern map contains the letter.
                if(!pMap.get(c).equals(str)) {      // Check if the letter maps to correct word in pattern map. 
                    return false;
                }
            }
            else {
                pMap.put(c, str);       // Pattern map doesn't contain the letter.
            }
            if(sMap.containsKey(str)) {             // Check if string map contains the string.
                if(!sMap.get(str).equals(c)) {      // Check if the string is mapped to the correct letter in string map.
                    return false;
                }
            }
            else {
                sMap.put(str, c);       // String map doesn't contain the string.
            }
        }
        return true;
    }
}