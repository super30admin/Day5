// Time Complexity : O(n)
// Space Complexity : Not sure. Need to learn how to calculate.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;
import java.util.Map;

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMap = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++){
            if(charMap.containsKey(s.charAt(i)) && charMap.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            if(!charMap.containsKey(s.charAt(i)) && charMap.containsValue(t.charAt(i))){
                return false;
            }
            if(!charMap.containsKey(s.charAt(i)) && !charMap.containsValue(t.charAt(i))){
                charMap.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}