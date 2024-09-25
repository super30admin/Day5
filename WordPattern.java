//Let n be the no of words in s, k be the no of letters in each word, m be the no of letters in pattern.
//Time Complexity : O(nk) + O(mk)
//Space Complexity : O(nk)
//Code run successfully on LeetCode.

import java.util.HashMap;

public class WordPattern {
	
    public boolean wordPattern(String pattern, String s) {
    	
    	String[] str = s.split(" ");
    	if(pattern.length() != str.length)
    		return false;
    	
    	HashMap<Character, String> pmap = new HashMap<>();
    	HashMap<String, Character> smap = new HashMap<>();
    	
    	char schar;
    	String s1;
    	
    	for(int i =0; i < pattern.length(); i++) {
    		
    		schar = pattern.charAt(i);
    		s1 = str[i];
    		
    		if(pmap.containsKey(schar)) {
    			if(!s1.equals(pmap.get(schar)))
    				return false;
    		}
    		
    		else
    			pmap.put(schar, s1);
    		
    		if(smap.containsKey(s1)) {
    			if(smap.get(s1) != schar)
    				return false;
    		}
    		
    		else
    			smap.put(s1,schar);
    		
    	}
        return true;
    }

}
