// Time Complexity :O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: Have to understand what isomorphic means. 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> left = new HashMap<>();
        HashMap<Character,Character> right = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char leftChar = s.charAt(i);
            char rightChar = t.charAt(i);
            
            if(left.containsKey(leftChar)){
                char currChar = left.get(leftChar);
                if(currChar == rightChar){
                    continue;
                }else{
                    return false;
                }
            }else{
                left.put(leftChar,rightChar);
            }
            
            if(right.containsKey(rightChar)){
                char currChar = right.get(rightChar);
                if(currChar == leftChar){
                    continue;
                }else{
                    return false;
                }
            }else{
                right.put(rightChar,leftChar);
            }
            
        }
        

        return true;
    }
}