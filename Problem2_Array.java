// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null){
            return true;
        }else if(s==null || t==null){
            return false;
        }
        char[] sChar = new char[256];
        char[] tChar = new char[256];

        for(int i=0;i<s.length();i++){
            Character key = s.charAt(i);
            Character value = t.charAt(i);
            if(sChar[key-' ']==0){
                sChar[key-' '] = value;
            }else{
                if(sChar[key-' ']!=value)
                    return false;
            }
        }

        for(int i=0;i<t.length();i++){
            Character key = t.charAt(i);
            Character value = s.charAt(i);
            if(tChar[key-' ']==0){
                tChar[key-' '] = value;
            }else{
                if(tChar[key-' ']!=value)
                    return false;
            }
        }
        return true;
    }
}
