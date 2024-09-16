import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : Yes, couple of dry runs


// Your code here along with comments explaining your approach
/*
Approach: 1) checked for nulls and unequals
2) mapped character to character 
from s string to t string
also check if the value of character in t exists in Map or not. If yes then we know this character has already occured and thus we return false.
else we just keep on continuing with the string.
*/



class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        
       if(s==null || t==null)
       {
           return false;
       }
        else if(s.length()!=t.length())
        {
            return false;
        }
        
        
       Map<Character,Character> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i))!=t.charAt(i))
                {
                    return false;
                }
                else 
                {
                    continue;
                }
            }
            else if(map.containsValue(t.charAt(i)))
            {
                return false;
            }
            else
            {
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        
        return true;
    }
}