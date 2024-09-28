//Time Complexity = O(nk+mk)
//Space Complexity = O(nk)
import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        if(pattern.length()!=strArray.length)
            return false;
        HashMap<Character,String> patternMap = new HashMap();
        HashMap<String,Character> sMap = new HashMap();
        for(int i=0;i<pattern.length();i++){
            char patternChar = pattern.charAt(i);
            String str = strArray[i];
            if(patternMap.containsKey(patternChar)){
                if(!str.equals(patternMap.get(patternChar)))
                    return false;
            }else{
                patternMap.put(patternChar,str);
            }
            if(sMap.containsKey(str)){
                if(patternChar!=sMap.get(str))
                    return false;
            }else{
                sMap.put(str,patternChar);
            }
                
        }
        return true;
    }
}