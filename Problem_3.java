// Time Complexity :O(l)
// Space Complexity : O(l)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        if(pattern == null || pattern.length()==0 ) return false;
        
        Map<Character,String> pMap = new HashMap<>();
        Map<String,Character> sMap = new HashMap<>();
        
        String[] sarr = s.split(" ");
        
        if(pattern.length()!= sarr.length) return false;
        
        // logic similar to isomorphic strings
        for(int i=0;i<pattern.length();i++){
            
            if(!pMap.containsKey(pattern.charAt(i))){
                pMap.put(pattern.charAt(i),sarr[i]);
            }else{
                String sv = pMap.get(pattern.charAt(i));
                if(!sv.equals(sarr[i])) return false;
            }
            
             if(!sMap.containsKey(sarr[i])){
                sMap.put(sarr[i],pattern.charAt(i));
            }else{
                char sv = sMap.get(sarr[i]);
                if(sv!=pattern.charAt(i)) return false;
            }
            
            
        }
        
        return true;
        
    }
}