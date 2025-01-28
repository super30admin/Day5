import java.util.HashMap;
import java.util.HashSet;

//Time complexity o(n);
//Space complexity o(1);


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        int pl = pattern.length();
        HashMap<Character,String> sMap = new HashMap<>();
        HashSet<String> tMap = new HashSet<>();
        if(pl != word.length) return false;

        for(int i =0; i<pl;i++){
            char sChar = pattern.charAt(i);
            String tChar = word[i];

            if(sMap.containsKey(sChar)){
                 if (!sMap.get(sChar).equals(tChar)) return false;
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