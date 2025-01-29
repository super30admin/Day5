// Time Complexity : O(n)
// Space Complexity : O(1) Since the number of characters in the hashmap will be constant.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: I have used two hashmaps to store the mapping of characters from s to t and t to s. I have iterated through the strings and checked if the character is already present in the map. If it is present, I have checked if the mapping is correct. If it is not correct, I have returned false. If the character is not present in the map, I have added the mapping to the map. I have done this for both the strings. If the length of the strings is not equal, I have returned false. If the strings are null, I have returned false. If both the strings are null, I have returned true.

import java.util.HashMap;
import java.util.Map;

class Problem2 {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, tChar);
            }else{
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            }

            if(!tMap.containsKey(tChar)){
                tMap.put(tChar, sChar);
            }else{
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            }
        }
        return true;
    }
}
