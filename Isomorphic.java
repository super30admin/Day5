/* Time Complexity : O(s + t) where s is length of string 1 and t is length of string 2
// Space Complexity : O(n) HashMap storing the characters of s and t
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I tried with a single HashMap approach but time complexity was O(st).
// In that approach, I was storing keys as characters of s and mapping them with t but I was check whenever I am putting character of t
// in s in the value, whether that particular character has already occurred as value in hashmap or not since we cant hve two keys map to same value. 
/*Algorithm:  Store the s characters in hashMap 1. Store the t characters in Hashmap 2. Check once stored if the character of s at ith position stored
 in the hashmap is equal to the t's character at ith position or vice versa. If it breaks, return false.
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> s_store = new HashMap<>();        // Store s characters
        HashMap<Character, Character> t_store = new HashMap<>();        // store t characters
        for(int i = 0 ; i < s.length();i++){
    if((s_store.get(s.charAt(i)) != null && s_store.get(s.charAt(i)) != t.charAt(i)) || (t_store.get(t.charAt(i)) != null && t_store.get(t.charAt(i)) != s.charAt(i)))
            {
                return false;                           // Check if character at ith position of s is equal to character of t at ith position or vice versa
            }
            if(!s_store.containsKey(s.charAt(i))){
                s_store.put(s.charAt(i), t.charAt(i));
            }
            if(!t_store.containsKey(t.charAt(i))){
                t_store.put(t.charAt(i), s.charAt(i));
            }
  
        }
        return true;
        }
        
}