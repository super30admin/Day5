// Time Complexity : O(n) --> where n is length of string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (290): Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    HashMap<Character, String> pMap;
    HashMap<String, Character> sMap;
    
    Solution() {
        pMap = new HashMap<>();
        sMap = new HashMap<>();
    }
    
    public boolean wordPattern(String pattern, String str) {
        String strArray[] = str.split(" ");
        
        if (pattern.length() != strArray.length) return false;
        
        for (int i = 0; i < strArray.length; i++) {
            char pChar = pattern.charAt(i);
            String sChar = strArray[i];
            
            if (pMap.containsKey(pChar)) {
                if (!pMap.get(pChar).equals(sChar)) return false;
            }
            else {
                pMap.put(pChar, sChar);
            }
            
            if (sMap.containsKey(sChar)) {
                if (!sMap.get(sChar).equals(pChar)) return false;
            }
            else {
                sMap.put(sChar, pChar);
            }
        }       
        return true;
    }
}