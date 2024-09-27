//T.C- O(n)
//S.c - O(n+m)
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strarray= s.split(" ");
        if(pattern.length() != strarray.length){
            return false;
        }
        HashMap<Character, String> pmap= new HashMap<>();
        HashMap<String, Character> smap= new HashMap<>();
        
        for(int i=0; i<pattern.length();i++){
            String str= strarray[i];
            char c= pattern.charAt(i);
            if(pmap.containsKey(c)){
                if(!str.equals(pmap.get(c))){
                    return false;
                }
            }else{
                pmap.put(c, str);
            }
            if(smap.containsKey(str)){
                if(c!= smap.get(str)){
                    return false;
                }
            }else{
                smap.put(str,c);
            }
                
        }
        return true;
    }
}