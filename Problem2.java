// Time Complexity : O(n) where n is the number of characters of string
// Space Complexity : O(n) where n is the number of characters of string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            Character ch1 = s.charAt(i);   
            Character ch2 = t.charAt(i); 
            
            if((map1.containsKey(ch1) && map1.get(ch1) !=ch2 ))
                return false;
            
             if((map2.containsKey(ch2) && map2.get(ch2) !=ch1 ))
                return false;
            
            map1.put(ch1,ch2);
            map2.put(ch2,ch1);
        }
        
        return true;
    }
}