// Time Complexity : O(n)
// Space Complexity :0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int sSize=s.length();
        int tSize=t.length();
        if(sSize != tSize){
            return false;
        }
        
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i=0;i<sSize;i++){
            
            char sChar = s.charAt(i);
            
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, t.charAt(i));
            }else{
                if(!sMap.get(sChar).equals(t.charAt(i))){
                    return false;
                }
            }
            
            if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i), sChar);
            }else{
                if(!tMap.get(t.charAt(i)).equals(sChar)){
                    return false;
                }
            }
        }
        
        return true;
        
    }
}