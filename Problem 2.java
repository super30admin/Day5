// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none


class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        
        if(s.length()!=t.length())
            return false;
        
        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!map.containsKey(c1)){ //if key is unique
                if(map.containsValue(c2)) // checks if one to one maping is violated
                    return false;
                map.put(c1, c2); 
            }else{
                char c = map.get(c1);
                if(c!=c2) // checks if the maping is correct
                    return false;
            }
        }
        return true;
    }
}