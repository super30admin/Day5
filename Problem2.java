// Time Complexity : O (s)
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

public class Problem2 {
   
        public boolean isIsomorphic(String s, String t) {
            
            if(s.length()!=t.length())
                return false;

            // Have 2 HashMaps to create Mappings. Check at reentry whether new value ==old value
            HashMap<Character,Character>sMap=new HashMap<>();
            HashMap<Character,Character>tMap=new HashMap<>();            
            for(int i=0;i<s.length();i++)
            {
             
                char sChar=s.charAt(i);
                char tChar=t.charAt(i);
                
                if(!sMap.containsKey(sChar))
                {
                    sMap.put(sChar,tChar);
                }
                else if(tChar!=sMap.get(sChar))
                {
                    return false;
                }
                
                if(!tMap.containsKey(tChar))
                {
                    tMap.put(tChar,sChar);
                }
                else if(sChar!=tMap.get(tChar))
                {
                    return false;
                }
                
                
                
            }
            
            return true;
            
        }
    }  

