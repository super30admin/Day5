//PROBLEM - 205. Isomorphic Strings
/** 3 Pointer Approcach: 
 * Use <Key,Value> of <CHAR,CHAR> Arrays to keep to hold K,V data.
 * Character-1 ASCII used as Index (KEY) and saves corresponding chracter ASCII value (VALUE) 
 * APPROACH: 
 * 1. If Character1/Character2 is present as key then check corresponding Character with current Character.
 * 2. If match keep moving, if not retuen FALSE.
 * 3. Incase c/c not present add to HashMap.
 */ 
//
//time Complexity :
// O(N)

// Space Complexity :
// O(1) => constant 256 characters.  

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.


class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        char[] map1 = new char[256];
        char[] map2 = new char[256];
        
        for(int i= 0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(map1[c1] != '\u0000'  && map1[c1] != c2){
               return false;
            }else if(map1[c1] == 0){
                map1[c1] = c2;
            }
            
            if(map2[c2] != '\u0000'  && map2[c2] != c1){
               return false;
            }else if(map2[c2] == 0){
                map2[c2] = c1;
            }
        }
        
        return true;
        
    }
}