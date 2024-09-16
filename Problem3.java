// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> cMap = new HashMap<>();
        HashMap<String, Character> wMap = new HashMap<>();
        String[] str = s.split(" ");
        
        if(str.length != pattern.length()){
            return false;
        }
        for(int i=0; i<pattern.length(); i++){
            char patChar = pattern.charAt(i);
            String w = str[i];
            if(!cMap.containsKey(patChar)){
                if(wMap.containsKey(w)){
                    return false;
                }else {
                    cMap.put(patChar,w);
                    wMap.put(w,patChar);
                }
            }
            else{
                
                if(!cMap.get(patChar).equals(w)) return false;
            }
            
        }
        return true;
    }
}