//PROBLEM - 290. Word Pattern
/** 3 Pointer Approcach: 
 * Here used TOUPLEs as CHAR and WORD have { 1 to 1 } mapping.
 * Used one HashMap to hold <W, C> and <C, W> pairs. 
 * APPROACH: 
 * 1. If word/Character is not present add corresponding char/word.
 * 2. Check if W key returns current char and C key returns current word
 * 3. If not rturn false
 */ 
//
//time Complexity :
// O(N)

// Space Complexity :
//  O(X) =>  x represent number of unique characters 

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.

import java.util.*;
class Problem3_OneMap {
    public boolean wordPattern(String pattern, String str) {
        
        if(str== null || pattern == null)
             return false;
         
        String[] s = str.split(" ");
         
        if(pattern.length() != s.length)
             return false;
         
         Map map1 = new HashMap();
      
         for(int i=0; i<pattern.length(); i++){
             
             char c = pattern.charAt(i);
             String w = s[i];
             
             if (!map1.containsKey(c))
                 map1.put(c, w);
 
             if (!map1.containsKey(w))
                 map1.put(w, c);
 
             if (!map1.get(c).equals(w) || !map1.get(w).equals(c))
                 return false;
               
         }
         
         return true;
         
     }
 }