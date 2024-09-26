// Time Complexity : O(n) 
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
//keep a hashmap of mapping chars from a to b, if exists but unequal at any point return false, else continue, 
// maintain rev mapping from b to a to check 2 chars from a not mapped to a char in b 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //base cases
        if(s==null || t==null)
            return s.equals(t);
        
        if(s.length()!=t.length())
            return false;
        
        //initialize hashmap
        HashMap<Character, Character> aToB = new HashMap<>();
        HashMap<Character, Character> bToA = new HashMap<>();
        
        //iterate over strings
        //check if mapping exists, if yes then verify, else put
        int n = s.length();
        for(int i=0; i<n; i++){
            char chA = s.charAt(i);
            char chB = t.charAt(i);
            
            if(!aToB.containsKey(chA)){
                if(!bToA.containsKey(chB)){
                    aToB.put(chA, chB);
                    bToA.put(chB, chA);
                }
                else 
                    return false;
            }
            else if(aToB.get(chA)!=chB)
                return false;
        }
               
        //return true default
        return true;
    }
}