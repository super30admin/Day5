import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(str.length != pattern.length()){
            return false;
        }
//         
        HashMap<Character,String> pMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < pattern.length(); i++){
            char p = pattern.charAt(i);
            String st = str[i];

            if(pMap.containsKey(p)){
                if(!pMap.get(p).equals(st)){
                    return false;
                }
            }
            else{
                pMap.put(p,st);
                if(set.contains(st)){
                    return false;
                }
                set.add(st);
            }

        }
        return true;
    }
}