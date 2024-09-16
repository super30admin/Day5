// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //checking null case
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> sm = new HashMap<>();
        HashMap<Character,Character> tm = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(!sm.containsKey(sc)) {
                sm.put(sc,tc);
            } else {
                if(sm.get(sc) != tc) return false;
            }
            if(!tm.containsKey(tc)) {
                tm.put(tc,sc);
            } else {
                if(tm.get(tc) != sc) return false;
            }
        }
        return true;
    }
}
