// Time Complexity :o(n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        char [] sMap = new char [100];
        char [] tMap = new char [100];
        for(int i = 0 ; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            //S-->T mapping
            if(sMap[sChar - ' '] == 0){
                sMap[sChar - ' '] = tChar;
            }else{
                if(sMap[sChar - ' '] != tChar){
                    return false;
                }
            }
            //T-->S Mapping
            if(tMap[tChar - ' '] == 0){
                tMap[tChar - ' '] = sChar;
            }else{
                if(tMap[tChar - ' '] != sChar){
                    return false;
                }
            }
        }
        return true;
    }
}