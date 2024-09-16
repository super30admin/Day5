// Time Complexity :  O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length()==0)return false;
        if(t == null || t.length()==0)return false;
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap = new HashMap<>();
        for( int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!smap.containsKey(sChar)){
                smap.put(sChar,tChar);
            }else{
                if(smap.get(sChar)!=tChar)return false;
            }
             if(!tmap.containsKey(tChar)){
                tmap.put(tChar,sChar);
            }else{
                if(tmap.get(tChar)!=sChar)return false;
            }
        }
        return true;
    }
}