package hashing1;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	//Time Complexity : O(n)
	//Space Complexity : O(n)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Mapping 1:1 relationship in map and simultaneously
	//checking if character in string t is unused
	
	// USING 2 HASHMAPS
	public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Boolean> assigned = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            } else {
                if(assigned.containsKey(t.charAt(i)))
                    return false;
                else {
                    map.put(s.charAt(i), t.charAt(i));
                    assigned.put(t.charAt(i), true);
                }
            }
        }
        return true;
    }
	
	// USING 1 HASHMAP
	public boolean isIsomorphi(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character, Character> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            } else {
                if(map.containsValue(t.charAt(i)))
                    return false;
                else
                    map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
