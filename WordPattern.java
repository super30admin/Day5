// Time Complexity : O(n) Traverse through the length of the pattern once
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String st) {
        String[] str = st.split(" "); 
        //edge
        if(pattern.length() != str.length){
            return false;
        }        
        
        HashMap<Character,String> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                if(map.get(pattern.charAt(i)).equals(str[i])){
                    continue;
                }else {
                    return false;
                }
            }else if(map.containsValue(str[i])){
                return false;
            }else {
                map.put(pattern.charAt(i),str[i]);
            }
        }
        return true;
    }         
}