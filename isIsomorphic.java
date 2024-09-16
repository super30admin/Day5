// Time Complexity : O(N^2) because of containsValue() method
// Space Complexity : O(N + K) //for hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //base case to check if s is empty or if it is just one character
        if(s == null || s.length() <= 1)
            return true;
    
        HashMap<Character, Character> map = new HashMap<Character, Character>();

        for(int i = 0; i < s.length(); i++){
            //we shall loop through each character of the strings one by one
            char first = s.charAt(i);
            char second = t.charAt(i);
            
            //if the map already contains the character
            if(map.containsKey(first)){
                //if the pair matches with the char that already exists in the map
                if(map.get(first).equals(second))
                    continue;
                //if it doesn't match, then not isomorphic
                else
                    return false;
            }
            //if the char doesn't exist in the map already
            else{
                //if the second value also does not exist in the map anywhere
                if(!map.containsValue(second)){
                    //we put the pair on the map for future comparisons
                    map.put(first, second);
                }
                else
                    return false;
            }   
        }
        return true;    
    }
}