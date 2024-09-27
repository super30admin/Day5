//PROBLEM - 205. Isomorphic Strings
/** 3 Pointer Approcach: 
 * Use 2 <Key,Value> of <CHAR,CHAR> hash sets ad HashMap data structure best suitable to hold K,V data.
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


import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Character> hash1 = new HashMap<>(256);
        HashMap<Character, Character> hash2 = new HashMap<>(256);
        
        for(int i= 0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(!hash1.containsKey(c1))
                hash1.put(c1, c2);
            
            if(!hash2.containsKey(c2))
                hash2.put(c2, c1);
            
            if(hash1.get(c1) != c2 || hash2.get(c2) != c1)
                return false;
         }
        
        return true;
        
    }
}
            
//             if(hash1.containsKey(c1) && hash1.get(c1) != c2){
//                return false;
//             }else if(!hash1.containsKey(c1)){
//                 hash1.put(c1, c2);
//             }
            
//             if(hash2.containsKey(c2) && hash2.get(c2) != c1){
//                return false;
//             }else if(!hash2.containsKey(c2)){
//                 hash2.put(c2, c1);
//             }