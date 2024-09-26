// Time Complexity :  O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

import java.util.HashMap;

class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern==null || pattern.length()==0 || s==null ||
          s.length()==0)
            return false;
        
        HashMap<Character ,String> pMap=new HashMap<>();
        HashMap<String , Character> sMap=new HashMap<>();
        
        String[] withouSpace=s.split(" ");
        if(pattern.length()!=withouSpace.length)
            return false;
        
         for(int i=0; i<withouSpace.length;i++){
             
            String sChar=withouSpace[i];
            char tChar=pattern.charAt(i);
             
            if(!pMap.containsKey(tChar)){
                if(sMap.containsKey(sChar)){
                    return false;
                }
                else{
                    pMap.put(tChar,sChar);
                    sMap.put(sChar,tChar);                    
                }

            }
             else{
                String tempCheck=pMap.get(tChar);
                if(!tempCheck.equals(sChar))
                    return false;                
            }
             

        } 
        return true;
        
    }
}