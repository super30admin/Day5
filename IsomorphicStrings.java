import java.util.HashMap;

/**
Time Complexity - O(n)

Space Complexiy - O(26)- constant - O(1)(26 characters are present max)
Irrespective of length of Sring, Map size is always 26.

Store mapping of s->t in hashMap 1
Store mapping of t->s in hashMap 2
Check if already mapping present and the value is diff return false;
 */

 class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length() || s.length()==0 || t.length()==0) return false;
        HashMap <Character, Character> sMap = new HashMap<>();
        HashMap <Character, Character> tMap = new HashMap<>();

        for(int i =0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
            } else {
                if(sMap.get(sChar)!=tChar){
                    return false;
                }
            }
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar,sChar);
            } else {
                if(tMap.get(tChar)!=sChar){
                    return false;
                }
            }            

        } 
        return true;  

    }
}