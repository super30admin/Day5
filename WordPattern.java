/*
Time Complexity - O(n)
Space Complexity - O(n)
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<String,String> sMap = new HashMap<String, String>();
         Map<String,String> tMap = new HashMap<String, String>();
        
        for(int i=0;i<s.length();i++)
        {
            if(sMap.containsKey(s) && sMap.get(s)!=pattern) return false;
            sMap.put(s,pattern);
            if(tMap.containsKey(pattern) && tMap.get(pattern)!=s) return false;
            tMap.put(pattern,s);
        }
        return true;
    }
        
}
