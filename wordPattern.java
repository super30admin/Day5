import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : Yes, couple of dry runs


// Your code here along with comments explaining your approach
/*
Approach: 1) checked for nulls and unequals
2) mapped character to String 
from s string to array of strings string
also check if the value of character in string exists in Map or not. If yes then we know this character has already occured and thus we return false.
else we just keep on continuing with the string.
*/







class Solutions {
    public boolean wordPattern(String pattern, String s) {
       
        Map<Character,String> map = new HashMap<>();
        
        String[] arr = s.split(" ");
        
        
       if(pattern.length()!=arr.length)
        {
            return false;
        }
        else
            if(pattern==null || arr==null)
            {
                return false;
            }
        
        
        for(int i=0;i<pattern.length();i++)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(!map.get(pattern.charAt(i)).equals(arr[i]))
                {
                    return false;
                }
                else
                {
                    continue;
                }
            }
            else if(map.containsValue(arr[i]))
            {
                return false;
            }
            else
            {
                map.put(pattern.charAt(i),arr[i]);
            }
            
        }
        
       
        
       return true; 
    }
}