import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        String[] sentence = s.split(" ");
        if(pattern.length() != sentence.length){
            return false;
        }
        for(int i = 0; i < sentence.length; i++) {
            
            char b = pattern.charAt(i);
            String a = sentence[i];
            if(! patternMap.containsKey(b)){
                patternMap.put(b, a);
            }else{
                if(! patternMap.get(b).equals(a)){   
                    return false;
                }
            }  
               
            if(! sMap.containsKey(a)){
                sMap.put(a, b);
            }else{
                if(! sMap.get(a).equals(b)){   
                    return false;
                }
            }   
            
        }
        return true;      
    }
}