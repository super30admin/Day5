package WordPattern;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String t, String str) {
        if(str.length() ==0 && t.length() ==0){
            return true;
        }
        Map<Character,String> map = new HashMap<>();
        String[] strArray = str.split(" ");

        if(strArray.length !=t.length()){
            return false;
        }else{
            for(int i=0;i<t.length();i++){
                char a = t.charAt(i);
                String b = strArray[i];
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