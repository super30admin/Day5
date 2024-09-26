package day5;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String s, String t) {
        
		// return false for null strings 
		if(s == null || t == null) {
            return false;
        }
		// if length of both the strings do not match, return false
		
        if(s.length() != t.length()) {
        	return false;
        }
        // converting string into sequence of characters
        char[] key = s.toCharArray();
        char[] value = t.toCharArray();
        
        Map<Character, Character> map = new HashMap<Character, Character>();
        
        for(int i = 0; i < s.length(); i++) {
        	
        	// if key is present and value against that key is correct one, 
        	// then return true, else return false
        	if(map.containsKey(key[i])) {
        		if(map.get(key[i]).equals(value[i])) {
        			return true;
        		} 
        		else return false;
        	}
        	// returns false if map maps more than one key to the specified value
        	// ***** special case *****
        	else if(map.containsValue( value[i])) {
        		return false;
        	}
        	
        	// map key, value entries
        	map.put(key[i], value[i]);
        } 
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isIsomorphic("adda", "elle"));
	}
	}
	
