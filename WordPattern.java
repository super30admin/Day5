// Time Complexity : O(n), n = length pf pattern or string array
// Space Complexity : O(n), n = length pf pattern or string array
// Did this code successfully run on Leetcode : Yes

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> pMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
        String[] splitArray = s.split("\\s");
        
        if(splitArray.length != pattern.length())
            return false;
       
        for(int i=0; i<splitArray.length; i++) {
            String str = splitArray[i];
            char c = pattern.charAt(i);
            if(!pMap.containsKey(c)) 
                pMap.put(c, str);
            
            if(!sMap.containsKey(str)) 
                sMap.put(str, c);
            if(!(pMap.get(c).equals(str)) || sMap.get(str) != c)
                return false;
        }
        return true;
    }
}