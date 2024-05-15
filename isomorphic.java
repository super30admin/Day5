// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char sCurr=s.charAt(i);
            char tCurr=t.charAt(i);
            
            if(sMap.containsKey(sCurr)){
                if(tCurr!=sMap.get(sCurr))
                    return false;
            }
            else
                sMap.put(sCurr,tCurr);
            
            if(tMap.containsKey(tCurr)){
                if(sCurr!=tMap.get(tCurr))
                    return false;
            }
            else
                tMap.put(tCurr,sCurr);
        }
        return true;
    }
}class isomorphic {
    
}