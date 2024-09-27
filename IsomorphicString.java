// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    We define two maps for two Strings A,B. 
    The first map, maps each element from A->B.
    The second map, maps each element from B->A.
    For every charecter if that mapping is valid or not.
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) return false;
        else if(s.length() != t.length()) return false;

        Map<Character, Character> chars = new HashMap<Character, Character>();
        Map<Character, Character> reverse = new HashMap<Character, Character>();

        for(int ind = 0; ind < s.length(); ind++) {

            char src = s.charAt(ind);
            char des = t.charAt(ind);

            if(!chars.containsKey(src) && !reverse.containsKey(des)) {
                chars.put(src, des);
                reverse.put(des, src);
            } 
            else if((chars.containsKey(src) && chars.get(src) != des) || (reverse.containsKey(des) && reverse.get(des) != src)) 
                    return false;
        }
        return true; 
    }
}