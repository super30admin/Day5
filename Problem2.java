import java.util.HashMap;
import java.util.HashSet;

//Time complexity o(n);
//Space complexity o(1);

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // int sl = s.length(); int tl = t.length();
        // HashMap<Character,Character> sMap = new HashMap<>();
        // HashMap<Character,Character> tMap = new HashMap<>();
        // if(sl != tl) return false;

        // for(int i=0;i<sl;i++){
        //     char sChar = s.charAt(i);
        //     char tChar = t.charAt(i);

        //     if(!sMap.containsKey(sChar)){
        //         sMap.put(sChar,tChar);
        //     }else{
        //         if(sMap.get(sChar) != tChar) return false;
        //     }

        //     if(!tMap.containsKey(tChar)){
        //         tMap.put(tChar,sChar);
        //     }else{
        //         if(tMap.get(tChar) != sChar) return false;
        //     }
        // }
        // return true;

         int sl = s.length(); int tl = t.length();
        HashMap<Character,Character> sMap = new HashMap<>();
        HashSet<Character> tMap = new HashSet<>();
        if(sl != tl) return false;

        for(int i=0;i<sl;i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            }else{
                if(tMap.contains(tChar)){
                    return false;
                }else{
                    sMap.put(sChar,tChar);
                    tMap.add(tChar);
                }
            }    

        }
        return true;

    }
}