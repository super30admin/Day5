// Problem 2: 

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() == 0 && s.length() == 0) return true;
        
        HashMap<Character, Character> smap = new HashMap<Character, Character>();
        HashMap<Character, Character> tmap = new HashMap<Character, Character>();
	
	    for(int i = 0;i<s.length();i++)
	    {
            if(!smap.containsKey(s.charAt(i))) {
                smap.put(s.charAt(i), t.charAt(i));
            } else {
                if(smap.get(s.charAt(i)) != t.charAt(i)) {
            	    return false;
                }
            }
            if(!tmap.containsKey(t.charAt(i))) {
                tmap.put(t.charAt(i), s.charAt(i));
            } else {
                if(tmap.get(t.charAt(i)) != s.charAt(i)) {
            	    return false;
                }
            }
        }
        return true;
    }
}