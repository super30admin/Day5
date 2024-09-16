// Time Complexity : O(n^2) 
// Space Complexity : Not sure. Need to learn how to calculate.
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : No.

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null || str == null) return false;
        Map<Character, String> charMap = new HashMap<>();
        char[] ca = pattern.toCharArray();
        String[] strs = str.split(" ");
        int length = ca.length;
        
        if(length != strs.length) return false;
        
        for(int i = 0; i < length; i++){
            if(!charMap.containsKey(ca[i]) && !charMap.containsValue(strs[i])){
                charMap.put(ca[i], strs[i]);
            }
            if(charMap.containsKey(ca[i]) && !(charMap.get(ca[i]).equals(strs[i]))){
                return false;
            }
            if(getKeyByValue(charMap, strs[i]) != ca[i]){
                return false;
            }
        }
        return true;
    }
    
    public <Character, String> Character getKeyByValue(Map<Character, String> map, String value) {
        for (Map.Entry<Character, String> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}