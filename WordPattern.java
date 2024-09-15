/*
 
m = pattern.length
n = s.length
k = max size of words in strArr

TC = O(n) + O(m*k)
Space Complexity : O(n)

executed on leetcode : Yes

 */


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        
        if(pattern.length() != strArr.length) 
            return false;
        
        HashMap<Character, String> pMap = new HashMap<Character, String>();
        HashMap<String, Character> sMap = new HashMap<String, Character>();
        
        
        for(int i=0;i<pattern.length();i++)
        {
            char pChar = pattern.charAt(i);
            String str = strArr[i];
            
            if(pMap.containsKey(pChar))
            {
                if(!str.equals(pMap.get(pChar)))
                    return false;     
            }
            else
            {
                pMap.put(pChar,str);
            } 
            
            if(sMap.containsKey(str))
            {
                if(sMap.get(str) != pChar)
                    return false;   
            }
            else
            {
                sMap.put(str,pChar);
            }
        }
        return true;
    }
}