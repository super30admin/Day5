// Time Complexity : O(NK log K), N is length of strs, K is max length of a stirng in strs
// Space Complexity : O(NK) , total info stores in map
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : n/a

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<Character, Character>(); // key is char from String s, value is char from String t that s is mapping to
        Set<Character> assignedChars = new HashSet<Character>();
        
        for (int i = 0; i < s.length(); i++){
            if (!map.containsKey(s.charAt(i)) && !assignedChars.contains(t.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
                assignedChars.add(t.charAt(i));
            }
            else if (!map.containsKey(s.charAt(i)) && assignedChars.contains(t.charAt(i))){
                return false;
            }
            else if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
        }
        return true;

    }
}