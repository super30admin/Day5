// Time Complexity : O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes

// Approach: I have used two hashmaps to store the mapping of characters from pattern to string and string to pattern. I have iterated through the pattern and string and checked if the character is already present in the map. If it is present, I have checked if the mapping is correct. If it is not correct, I have returned false. If the character is not present in the map, I have added the mapping to the map. I have done this for both the strings. If the length of the strings is not equal, I have returned false. If the strings are null, I have returned false. If both the strings are null, I have returned true.

import java.util.HashMap;
import java.util.Map;

class Problem3 {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");

        if(strs.length != pattern.length()){
            return false;
        }

        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> strMap = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char pChar = pattern.charAt(i);
            String str = strs[i];

            if(!patternMap.containsKey(pChar)){
                patternMap.put(pChar, str);
            }else {
                if(!patternMap.get(pChar).equals(str)){
                    return false;
                }
            }

            if(!strMap.containsKey(str)){
                strMap.put(str, pChar);
            }else {
                if(strMap.get(str) != pChar){
                    return false;
                }
            }
        }
        return true;
    }
}