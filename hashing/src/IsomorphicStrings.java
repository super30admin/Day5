import java.util.HashMap;

class class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sTotMap = new HashMap<>(26);
        HashMap<Character,Character> tTosMap = new HashMap<>(26);

        for (int x=0;x<s.length();x++){
            char chs = s.charAt(x);
            char cht = t.charAt(x);
            //S TO T MAP
            if(sTotMap.containsKey(chs) && sTotMap.get(chs)!=cht){
                return false;
            }
            else{
                sTotMap.put(chs,cht);
            }

            //T TO S MAP
            if(tTosMap.containsKey(cht) && tTosMap.get(cht)!=chs){
                return false;
            }
            else{
                tTosMap.put(cht,chs);
            }
        }
        return true;
    }
}