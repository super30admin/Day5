import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> hmap1 = new HashMap<>();
        HashMap<Character,Character> hmap2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);
            if(hmap1.containsKey(s1)){
                if(hmap1.get(s1) != s2)
                    return false;
            }else{
                hmap1.put(s1,s2);
            }
            if(hmap2.containsKey(s2)){
                if(hmap2.get(s2) != s1)
                    return false;         
            }else 
                hmap2.put(s2,s1);
        }  
        return true;    
    }
        
}