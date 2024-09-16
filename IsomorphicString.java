/**
Problem: Isomorphic strings.

Time Complexity: O(n) or O(m), depending on whichever is large; where n is the length of the string s and m is the length of the string t
//because initially we check if they're not isomorphic by checking the lengths of both strings
// doesn't matter when the strings are isomorphic.


Space Complexity: O(1), though we use a hashmap, it's of constant length(26 letters).
Did this code successfully run on Leetcode : Yes

Approach : Use 2 HashMaps
1. For the first hashmap, keys are the characters in String 1. Put the corresponding char of string 2 as it's value.
2. For the second hashmap, this time, the keys are the characters in String 2. Put the corresponding char of string 1 as it's value.
3. Now, check if both hashmaps have same key-value pairs. If the key-value pairs are different, they're not isomorphic strings.

*/


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Character> hmS = new HashMap<>(26); // We need only 26 for the 26 letters in the alphabet.
        HashMap<Character, Character> hmT = new HashMap<>(26);
    
        for(int i = 0; i < s.length(); i++) {
            if(hmS.get(s.charAt(i)) != null) {
              if(hmS.get(s.charAt(i)) != t.charAt(i)) { 
                return false;
            }  
            }
            
            else {
                hmS.put(s.charAt(i), t.charAt(i));
            }
        }
        
        for(int i = 0; i < t.length(); i++) {
            if(hmT.get(t.charAt(i))!=null) {
                if(hmT.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            }
            }
            
            else {
                hmT.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}