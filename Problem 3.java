// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        
        String[] st = str.split(" ");
        
        if(pattern.length()!=st.length) //if not same length then return false
            return false;
        
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(!map.containsKey(c)){
                if(map.containsValue(st[i])) //if one to one mapping is violated
                    return false;
                map.put(c, st[i]);
            }else{
                if(!map.get(c).equals(st[i])) // if element isn't same as mapped value
                    return false;
            }
        }
        return true;
    }
}