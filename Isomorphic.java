// Time Complexity : O(n^2), n is length of string. 
// for loop --- n || containsValue --- n . Therefore total runtime is O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() == 1 ) return true;
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(map.containsKey(cs)) {
                if(map.get(cs).equals(ct)) continue; 
                else return false; 
            }
            else{
                if(!map.containsValue(ct)) {
                    map.put(cs,ct);
                }
                else return false;
            }   
        }return true; 
    }
}





