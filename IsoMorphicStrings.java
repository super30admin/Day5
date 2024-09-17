// Time Complexity : O(N) - Length of String
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() == 0) return true;
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!smap.containsKey(s.charAt(i))){
                smap.put(s.charAt(i), t.charAt(i));//f -> b, o-> a,
            }
            else{
                if(smap.get(s.charAt(i)) != t.charAt(i) )
                    return false;
            }
            //tmpa
            if(!tmap.containsKey(t.charAt(i))){
                tmap.put(t.charAt(i), s.charAt(i));//f -> b, o-> a,
            }
            else{
                if(tmap.get(t.charAt(i)) != s.charAt(i) )
                    return false;
            }
        }
        return true;
    }
}