package day5;

import java.util.*;

public class WordPattern {
	public static boolean wordPattern(String pattern, String str) {
		
		//return false for null pattern or string 
	    if (pattern == null || str == null) {
	        return false;
	    }
	    
	    // converting string into sequence of characters
	    char[] patterns = pattern.toCharArray();
	    
	    // converting big string into array of substrings
	    String[] strs = str.split("\\s+");  //whitespace regex, can be written as (" ")
	    
	    // if length of both the arrays do not match, return false
	    if (patterns.length != strs.length) {
	        return false;
	    }
	    
	    Map<Character, String> map = new HashMap<Character, String>();
	    for (int i=0; i<patterns.length; i++) {
	        if (map.containsKey(patterns[i])) {
	            if (!map.get(patterns[i]).equals(strs[i])) {
	                return false;
	            }
	        } else if (map.containsValue(strs[i])) {
	            return false;
	        }
	        map.put(patterns[i], strs[i]);
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		System.out.println(wordPattern("abbc", "cat, dog, dog, cat"));
	}
}
