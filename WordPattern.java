import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray =s.split(" ");
        if(pattern.length()!= strArray.length) return false;
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set= new HashSet<>();
        for(int i=0;i<pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
               if(!strArray[i].equals(map.get(pattern.charAt(i)))){
                     return false;
               }
            } else {
                map.put(pattern.charAt(i),strArray[i]);
                if(set.contains(strArray[i])){
                    return false;
                }
                 set.add(strArray[i]);
            }           
        }
        return true;
    }
}