package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsoMorphicsStrings {

    // Approach:    Use hashmap to store the mapping of the chars and if any char already present in map then check if it is correct in 2nd string else return false;
    // define map which will store char,char ; mapping of the char of 1st string to 2nd string
    // while iterating check if already present in map, if yes, check the value from map is same as char from 2nd string
    // if true, continue till end, else return false;
    
	// TC: O(n) -> n is characters in string s or t
	//SC: O(n + n) -> n is characters in string s
    public boolean isIsomorphic(String s, String t) {
     
        if(s.length() != t.length())
            return false;
        
        int length = s.length();
        Map<Character, Character> mapping = new HashMap<Character,Character>(length);
        Set<Character> usedKeys = new HashSet<Character>(length);
        
        for(int i=0; i<length;i++){
            
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(mapping.containsKey(sChar)){
                char val = mapping.get(sChar);
                
                if(tChar != val)
                    return false;    
            }
            else
            {
                if(usedKeys.contains(tChar))
                    return false;
                
                mapping.put(sChar, tChar);
                usedKeys.add(tChar);
   
            }   
            
        }  
     return true;   
        
    }
}