//PROBLEM - 290. Word Pattern
/** 3 Pointer Approcach: 
 * Straighforward approach to use <Key,Value> of <CHAR,WORD> and <WORD,CHAR>
 * HashMap data structure best suitable to hold the data.
 * APPROACH: 
 * 1. If word/Character is present as key then check corresponding char/word with current char/word.
 * 2. If match keep moving, if not retuen FALSE.
 * 3. Incase w/c not present add to HashMap.
 */ 
//
//time Complexity :
// O(N)

// Space Complexity :
//  O(X) =>  x represent number of unique characters 

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.

import java.util.Map;

class Problem3_twoMaps {
    public boolean wordPattern(String pattern, String str) {
        
       if(str== null || pattern == null)
            return false;
        
       String[] s = str.split(" ");
        
       if(pattern.length() != s.length)
            return false;
        
        Map map1 = new HashMap();
        Map<String, Character> map2 = new HashMap();
        
        for(int i=0; i<pattern.length(); i++){
            
            char c = pattern.charAt(i);
            
            if(map1.containsKey(c) && !map1.get(c).equals(s[i]))
                return false;
            else
                map1.put(c,s[i]);
            
             if(map2.containsKey(s[i]) && !map2.get(s[i]).equals(c))
                return false;
            else
                map2.put(s[i], c);
              
        }
        
        return true;        
    }
}