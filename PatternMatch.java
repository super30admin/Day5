//reference leetcode solution 290. Word Pattern
//TimeComplexity 0(n)
//Space complexity  o(n)

import java.util.HashMap;


public class PatternMatch {
	


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
	    
	    HashMap<Character, String> map = new HashMap<Character, String>();
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
	    
		// driver program 
		public static void main (String[] args) 
		{ 
			boolean res = wordPattern("abba", "dog cat cat dog"); 
			System.out.println(res); 
		
			res = wordPattern("abba", "dog cat cat fish"); 
			System.out.println(res); 
		}
	
}
