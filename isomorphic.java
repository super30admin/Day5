// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

import java.util.HashMap;

class isomorphic {
    public boolean isIsomorphic(String s, String t) {
        
        if(s==null || t==null || s.length()==0 || t.length()==0)
            return false;
        
        HashMap<Character, Character> sMap=new  HashMap<>();
        HashMap<Character, Character> tMap=new  HashMap<>();
        
        for(int i=0; i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
            }else{
                if(sMap.get(sChar)!=tChar)
                    return false;                
            }
            
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar,sChar);
            }else{
                if(tMap.get(tChar)!=sChar)
                    return false;                
            }  
        }
        return true;
    }
}