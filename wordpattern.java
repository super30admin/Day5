// wordPattern 
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> hMap = new HashMap<Character, String>();
        
        String[] words = s.split(" ");

        if(words.length != pattern.length()) {
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++) {
            
            char temp1 = pattern.charAt(i);
            String temp2 = words[i];
            
             if(hMap.containsKey(temp1)) {
                if(hMap.get(temp1).equals(temp2)) continue;
                else {
                    return false;
                }
            } else if(hMap.containsValue(temp2))
             {
                 
                 return false;
             }
            else {
                hMap.put(temp1, temp2);
            }  
            
        }
        return true;
        
    }
}