import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() != t.length()){
        return false;
        }
        HashMap<Character,Character> sMap = new HashMap<>();
        // HashMap<Character,Character> tMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            }
            else{
                sMap.put(sChar,tChar);
                if(set.contains(tChar)){
                    return false;
                }
                set.add(tChar);
                
            }
  
    }
    return true;
}
}
