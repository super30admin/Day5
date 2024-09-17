/*Algorithm:
    1. Create two hashmaps, Traverse through the string. For each character in the first string if the character key is not in the first hashmap, map it with the character respective character of the other string. Do the vice versa with the other hashmap.
    2. If the character is there in the hashmap then check if the mapped character from hashmap in the other string is equal to this, If no then return false. Do the vice versa.
    3. After complete traversal of the string length return true.
    
    Time Complexity: O(n)
    Space complexity: O(1) as the largest word which we may be saving will be of less size.
    
    Did the problem execute on leetcode successfully? Yes
    
    
    */


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        
        for(int i=0; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            if(!sMap.containsKey(a)){
                sMap.put(a,b);
            }
            else{
                if(!sMap.get(a).equals(b)){
                    return false;
                }
                
         
            }
               if(!tMap.containsKey(b)){
                    tMap.put(b,a);
            }
            else{
                if(!tMap.get(b).equals(a))
                        return false;
               }
        }
        
        return true;
    }
}