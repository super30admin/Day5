// Time complexity : O(n)
//Space complexity: O(n)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] sMap = new char[100];
        char[] tMap = new char[100];
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(sMap[c1 - ' ']!=0){
                if(sMap[c1-' ']!=c2){
                    return false;
                }
            }
            else{
                sMap[c1-' '] = c2;
            }
            
             if(tMap[c2 - ' ']!=0){
                if(tMap[c2-' ']!=c1){
                    return false;
                }
            }
            else{
                tMap[c2-' '] = c1;
            }
        }
        return true;
    }
}