//WordPattern 1
// Time Complexity : O(n) , n is string length
// Space Complexity : O(1)-constant space because only 26 characters are used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Create Two maps for keeping mapping from both the sides , so that one character can be mapped to one word and vice versa 
*/

import java.util.*;
class Solution14 {
    public boolean wordPattern(String pattern, String s) {
        
        //TC->O(n), SC-> O(1);
        
        if(pattern==null || pattern.length()==0 || s==null || s.length()==0){
            return false;
        }
        
        Map<Character,String> mapP = new HashMap<>();
        Map<String,Character> mapS = new HashMap<>();
        
        String[] sArr = s.split(" ");
        
        if(pattern.length()!=sArr.length){
            return false;
        }
        
        for(int i=0;i<pattern.length();i++){
            
            char chP = pattern.charAt(i);
            String str = sArr[i];
            
            if(mapP.containsKey(chP)){
                if(!mapP.get(chP).equals(str)){
                    return false;
                }
            }else{
                mapP.put(chP,str);
            }
            
            
            if(mapS.containsKey(str)){
                if(!mapS.get(str).equals(chP)){
                    return false;
                }
            }else{
                mapS.put(str,chP);
            }
            
        }
        
        return true;
    }
}