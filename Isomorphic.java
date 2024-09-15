/* Time Complexity : O(n) 
 Space Complexity : O(n)
 Did this code successfully run on Leetcode : yes
 Any problem you faced while coding this : no

Approach:

 This problem can be done in three ways
 Using two Hashmaps // I did with using two hashmaps
 Using two Char Arrays
 Using One Hashmap and one Hashset
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
    HashMap<Character, Character> sMap = new HashMap<Character, Character>();
    HashMap<Character, Character> tMap = new HashMap<Character, Character>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i= 0; i<s.length(); i++){
            char a = s.charAt(i);
            if(sMap.containsKey(a)){
                if(sMap.get(a) != t.charAt(i)){
                    return false;
                }
            }else if(tMap.containsKey(t.charAt(i))){
                    return false;
                }
                else{
                    sMap.put(a, t.charAt(i));
                    tMap.put(t.charAt(i),a);
                }
            }  
        return true;
