/*
 * #205. Isomorphic Strings
 * 
 * Time Complexity: O (N) -> To traverse through the characters of string 's'
 * 
 * Space Complexity: O (N) -> To store characters of both strings as key value pairs
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.hashing1;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	public boolean isIsomorphic(String s, String t) {
		
        /*
         * Input validation check
         * If length of both strings is not equal or any of the given strings is null, return false -> not isomorphic
         */
        if(s == null || t == null || s.length() != t.length()){
            return false;
        }
        
        // Create a map to store the characters of both strings as key value pairs
        Map<Character, Character> ans = new HashMap<Character, Character>();
        
        /*
         * Traverse through the characters of String 's'
         * 	- key = character of String 's' at ith index
         * 	- value = character of string 't' at ith index
         * 
         * 	- If key or value already present in map
         * 		- If key is already present, check if current value from String 't' matches the value of already present key
         * 		- If value is already present, check if value at current key (not in map) is equal to null, return false
         * 			- This condition is to validate the case where same value from string 't' is encountered for different keys in string 's' which is not allowed
         * 	- If key or value not already present in map
         * 		- put the key value pair in map
         * 	- Repeat the above process until all characters of String 's' is traversed
         * 	- After traversing all characters, if string is isomorphic, return true, else return false
         * 
         */	
        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            char value = t.charAt(i);
            
            if(ans.containsKey(key) || ans.containsValue(value)){
                if(ans.get(key) == null || ans.get(key) != value){
                    return false;
                }
            }else{
                ans.put(key, value);
            }
        }
        return true;    
    }

}
