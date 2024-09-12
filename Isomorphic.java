class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] schar = new char[100];
        char[] tchar = new char[100];
        for(int i=0;i<s.length();i++){
            if(schar[s.charAt(i)-' '] != 0){
                if(schar[s.charAt(i)-' '] != t.charAt(i)){
                    return false;
                }
            }else{
                    schar[s.charAt(i)-' '] = t.charAt(i);
                }
            if(tchar[t.charAt(i)-' '] != 0){
                if(tchar[t.charAt(i)-' '] != s.charAt(i)){
                    return false;
                }
            }else{
                    tchar[t.charAt(i)-' '] = s.charAt(i);
                } 
        }
        return true;
    }
}