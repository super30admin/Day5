class Solution {
    public boolean isIsomorphic(String s, String t) {
        char [] sMap = new char[100];
        char [] tMap = new char[100];
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);;
            if(sMap[sChar-' ']==0){
                sMap[sChar-' '] = tChar;
            }else{
                if(sMap[sChar-' ']!=tChar) return false;
            }
            if(tMap[tChar-' ']==0){
                tMap[tChar-' '] = sChar;
            }else{
                if(tMap[tChar-' ']!= sChar) return false;
            }
        }
        return true;
    }
}
