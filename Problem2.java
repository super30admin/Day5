// Time Complexity :  n - String length
// Space Complexity : O(N) - for 2 hashmap (N + N = 2N = N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach
// 1) check if the length of both strings are same
// 2) iterate through first string - Store the character in the key for the first time and second string charater as value
// 3) next time if the same charater comes it checks the map and for the key and checks if the same value is present or returns false
// 4) Now other String is considered as key and same process is repeated to avoid the vice versa failing scenario 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        if(s.length() != t.length()){
            return false;
        }
        
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            
            if(!sMap.containsKey(c)){
                sMap.put(c,t.charAt(i));
            }else{
                if(!sMap.get(c).equals(t.charAt(i))){
                    return false;
                }
            }
        }
        
        for(int i =0; i<s.length();i++){
            char c = t.charAt(i);
            
            if(!tMap.containsKey(c)){
                tMap.put(c,s.charAt(i));
            }else{
                if(!tMap.get(c).equals(s.charAt(i))){
                    return false;
                }
            }
        }
        
        return true;
    }
}
