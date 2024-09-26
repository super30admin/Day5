// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        if(pattern.length() != strArray.length) return false;
        HashMap<Character,String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        
        for(int i= 0;i < strArray.length;i++)
        {
            String str = strArray[i];
            char c = pattern.charAt(i);
            
            if(pMap.containsKey(c))
            {
                if(!str.equals(pMap.get(c)))
                {
                    return false;
                }
            }
            else
            {
                pMap.put(c,str);
            }
            if(sMap.containsKey(str))
            {
                if( c != sMap.get(str))
                {
                    return false;
                }
            }
            else
            {
                sMap.put(str,c);
            }
        }
        return true;
        
    }
}