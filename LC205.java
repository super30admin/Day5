// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Same as Word Pattern Problem(LC290).

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int sLen = s.length();
        int tLen = t.length();
        
        if(sLen != tLen){
            return false;
        }
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for(int i = 0; i < sLen; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if(!map1.containsKey(ch1)){
                map1.put(ch1, ch2);
            }
            else{
                if(!map1.get(ch1).equals(ch2)){
                    return false;
                }
            }
            
            if(!map2.containsKey(ch2)){
                map2.put(ch2, ch1);
            }
            else{
                if(!map2.get(ch2).equals(ch1)){
                    return false;
                }
            }
        }
        return true;
    }
}