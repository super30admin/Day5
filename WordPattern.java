// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
// Isomorphic String
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(sMap.containsKey(s.charAt(i))) {
                if(sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            else {
                sMap.put(s.charAt(i), t.charAt(i));
            }
            if(tMap.containsKey(t.charAt(i))) {
                if(tMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
            else {
                tMap.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
