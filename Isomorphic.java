//Time Complexity: O(n)
//Space Complexity: O(K) n  k - length of the string
//LeetCode: Yes

//Initialise two character hashmaps. 
//Map every character to the corresponding character of the other string. Do inverse Mapping as well. 
//If the key exists in both the maps return false. Return true at the end.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())return false;
        
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        
        for(int i =0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(!smap.containsKey(sChar))smap.put(sChar, tChar);
            else{if(smap.get(sChar)!=tChar)return false;}
            
             if(!tmap.containsKey(tChar))tmap.put(tChar, sChar);
            else{if(tmap.get(tChar)!=sChar)return false;}
        }
        return false;
    }
}