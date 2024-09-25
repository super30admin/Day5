//Time Complexity : O(n)
//Space Complexity : O(1)
//Code run successfully on LeetCode.

import java.util.HashMap;

public class IsoString_2 {
	
	public boolean isIsomorphic(String s, String t) {
    	char schar;
    	char tchar;
    	if(s.length()!= t.length())
    		return false;
    	
    	HashMap<Character, Character> smap = new HashMap<>();
    	HashSet<Character> tset = new HashSet<Character>();
    	
    	for(int i =0; i < s.length(); i++) {
    		schar = s.charAt(i);
    		tchar = t.charAt(i);
    		
    		if(smap.containsKey(schar))
    		{
    			if(smap.get(schar) != tchar)
    				return false;
    		}
    		
    		else{
                
                smap.put(schar, tchar);
                
                if(tset.contains(tchar))
    		    {
                   return false;
    		    }
    		
    		    else
    			    tset.add(tchar);   
            }	
    	}
        return true;
    }

}
