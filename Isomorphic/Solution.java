package Isomorphic;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() ==0 && t.length() ==0){
            return true;
        }
        Map<Character,Character> map = new HashMap<>();

        if(s.length() !=t.length()){
            return false;
        }else{
            for(int i=0;i<s.length();i++){
                char a = s.charAt(i);
                char b = t.charAt(i);
                if(map.containsKey(a)){
                    if(map.get(a).equals(b))
                        continue;
                    else
                        return false;
                }else{
                    if(!map.containsValue(b))
                        map.put(a,b);
                    else return false;

                }
            }
        }
        return true;
    }
}