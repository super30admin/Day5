class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()==1) return true;
        
        HashMap<Character,Character> sMap=new HashMap<>();
        HashMap<Character,Character> tMap=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sMap.containsKey(sChar))
            {
                if(!tMap.containsKey(tChar))
                    return false;
                
                if(tMap.get(tChar)!=sChar)
                    return false;
            }
            else{
                if(tMap.containsKey(tChar))
                    return false;
                sMap.put(sChar,tChar);
                tMap.put(tChar,sChar);
                
            }
        }
        
        return true;
        
        
    }
}

// Time Complexity : O(n) -- n is length of string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
