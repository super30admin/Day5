// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        if(s.length()!=t.length()) return false;
        
        for(int i=0; i<s.length();i++){
           char sKey = s.charAt(i);
           char tKey = t.charAt(i);
            if(sMap.containsKey(sKey)){
                if(sMap.get(sKey)!=tKey){
                    return false;
                }
               }
              else{
                    sMap.put(sKey,tKey);
                }
              if(tMap.containsKey(tKey)){
                if(tMap.get(tKey)!=sKey){
                    return false;
                }
               }
              else{
                    tMap.put(tKey,sKey);
                }
            
        }
        return true;
    }
}