// T.C- O(n)
//S.C- O(1)
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t== null){
            return true;
        }
        if(s.length()!= t.length()){
            return false;
        }
        HashMap <Character,Character> smap= new HashMap<>();
        HashSet<Character> set= new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char schar= s.charAt(i);
            char tchar= t.charAt(i);
            if(smap.containsKey(schar)){
                if(tchar != smap.get(schar)){
                    return false;
                }
            }else{
                if(set.contains(tchar)){
                    return false;
                }
                set.add(tchar);
                smap.put(schar, tchar);
            }
        }
        return true;
    }
}