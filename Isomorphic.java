// Time Complexity : O(N) 
// Space Complexity : O(N) - Having HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        // Base Case
        if(s.length() != t.length()){
            return false;
        }
        
        // Creating Hashmap for storing key as character of s and value of t as value
        HashMap<Character, Character> map = new HashMap<>();
        
        // Iterating through the length of the string s
        for(int i = 0; i< s.length(); i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            
            // if map contains char of s, then we will check the value of it with the char of t
            if(map.containsKey(s1)){
                if(!map.get(s1).equals(t1)){
                    return false;
                }
            }
            else{
                if(!map.containsValue(t1)){
                    map.put(s1,t1);
                }
                else{
                    return false;
                }
            }
            
        }
        return true;
        
    }
}