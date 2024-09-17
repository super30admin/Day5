// Time Complexity : O(n2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : have doubt regarding time complexity


class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String[] split= str.split(" "); //split the str and store in string array
        
        if(split.length!= pattern.length())
        {
            return false;
            
        }  
        
        HashMap<Character, String> map = new HashMap<Character, String>();
        
        for(int i=0;i<split.length;i++)
        {
            char pat = pattern.charAt(i);
            
            if(!map.containsKey(pat))
            {
                
                if(map.containsValue(split[i])){
                    
                    return false;
                }
                
                map.put(pat,split[i]);
            }
            else{
                
                if(!map.get(pat).equals(split[i]))
                {
                
                    return false;
                
                }

                
            }
            
            
            
        }    
        
        return true;
    }
}