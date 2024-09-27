// Time Complexity : O(n)  n= size of s or t
// Space Complexity : O(nm) n= number of char in s  m= number of char in t
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mapS=new HashMap<>(26);
        Map<Character,Character> mapT=new HashMap<>(26);
         
        
        for( int i=0;i<s.length();i++){
            
            char ss=s.charAt(i);
            char tt=t.charAt(i);
            
            if(mapS.containsKey(ss)){
                if(mapS.get(ss)!=tt ){
                    return false;
                } 
                
            } else {
                if(mapT.containsKey(tt) && mapT.get(tt) != ss){
                    return false;
                }
                mapS.put(ss,tt);
                mapT.put(tt,ss);
            }
            
        }
        
        return true;
        
    }
}