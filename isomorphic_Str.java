// Time Complexity :O(n)
// Space Complexity :O(n) - number of strings
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this :-

// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
     // sCharacter -> tCharacter
     Map<Character, Character> map = new HashMap<>(); // mapping each String S character to String t character
     
     for (int i = 0; i < s.length(); i++) {
         Character sChar = s.charAt(i), tChar = t.charAt(i); // accessing each character in the string
         if (map.containsKey(sChar)) // if String S Character already exists and doest match with String T Character the return false
         { 
             if(map.get(sChar) != tChar)
                return false;
         } 
         else
         { 
             if (map.containsValue(tChar)) // If the key doesnt exist but the value is already present for some other key the return false
                 return false; 
             map.put(sChar, tChar); // if key doesnt exist then add
         }
     }
     return true;
    }
}
