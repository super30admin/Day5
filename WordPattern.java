package hashing1;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	//Time Complexity : O(n)
	//Space Complexity : O(n)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Mapping 1:1 relationship in map and simultaneously
	//checking if character in string t is unused
	
	// USING 2 HASHMAPS
	public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if(pattern.length() != words.length)
            return false;
        
        Map<Character, String> map = new HashMap<>();
        Map<String, Boolean> assigned = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(words[i]))
                    return false;
            } else {
                if(assigned.containsKey(words[i]))
                    return false;
                else {
                    map.put(pattern.charAt(i), words[i]);
                    assigned.put(words[i], true);
                }
            }
        }
        
        return true;
    }
	
	// USING 1 HASHMAP
	public boolean wordPatter(String pattern, String s) {
        String[] words = s.split(" ");
        
        if(pattern.length() != words.length)
            return false;
        
        Map<Character, String> map = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(words[i]))
                    return false;
            } else {
                if(map.containsValue(words[i]))
                    return false;
                else
                    map.put(pattern.charAt(i), words[i]);
            }
        }
        
        return true;
    }
}
