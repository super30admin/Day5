/**
// Time Complexity : O(n) 
// Space Complexity : O(1) (total number of alphabets will always be same)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :N/A
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap hm = new HashMap();
        
        String word[] = s.split(" ");
        
        if(word.length!=pattern.length())
            return false;
        
        for(Integer i=0; i<word.length; i++)
        {
            char c = pattern.charAt(i);
            String ss = word[i];
            
            if(!hm.containsKey(c))
                hm.put(c,i);
            if(!hm.containsKey(ss))
                hm.put(ss,i);
            
            if(hm.get(c)!=hm.get(ss))
                return false;
        }
        return true;
    }
}