// isIsomorphic 
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hMap = new HashMap<Character, Character>();
        if(s.length() != t.length()) {
            return false;
        }
        
        for(int i = 0; i<s.length(); i++) {
            
            char temp1 = s.charAt(i);
            char temp2 = t.charAt(i);
            
            if(hMap.containsKey(temp1)) {
                if(temp2 == hMap.get(temp1)) continue;
                else return false;
            } else if(hMap.containsValue(temp2)) return false;
            else {
                hMap.put(temp1, temp2);
            }    
            
        }
        return true;
        
    }
}