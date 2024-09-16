// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){//if length not equal then false
            return false;
        }
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            //we check if the key is present in map but if its value 
            //doesnt match the second string return false
            //we check both maps like this
            if((smap.containsKey(sc) && smap.get(sc)!=tc) || 
            (tmap.containsKey(tc) && tmap.get(tc)!=sc)){
                return false;
            }else{
                //or we add
                smap.put(sc,tc);
                tmap.put(tc,sc);
            }
        }
        return true;
    }   
}