// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        Map<Character, Character> map = new HashMap();
        
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)) {
                if(map.get(a).equals(b))
                    continue;
                else
                    return false;
            }
            else {
                if(!map.containsValue(b))
                    map.put(a, b);
                else
                    return false;
            }
        }
        return true;
    }
}