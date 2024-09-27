// Time Complexity : O(n)) 
// Space Complexity : O(n) -- please confirm, not sure about this.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Approach:
// 1. I used HashMap to store the characters of the string. 
// 2. Every character from first string was stored as a key and corresponding character from second string as the value. This will cover the cases like 'abc' and 
// 'def'
// 3. To cover cases like 'abc' and 'bcf', two hashmaps are required, as the corresponding character in second string can have another corresponding character 
// in the pattern. Like, here in this example, a is mapped to b,  but b is not mapped to a but c.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<Character, Character>();                       
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();

       for(int i= 0; i < s.length(); i++){
           if(!map.containsKey(s.charAt(i))){
               map.put(s.charAt(i), t.charAt(i));
           }
           else{
               if(map.get(s.charAt(i)) != t.charAt(i)){
                   return false;
               }
           }
           if(!map2.containsKey(t.charAt(i))){
               map2.put(t.charAt(i), s.charAt(i));
           }
           else{
               if(map2.get(t.charAt(i)) != s.charAt(i)){
                   return false;
               }
           }
       }
        return true;
    }
}
