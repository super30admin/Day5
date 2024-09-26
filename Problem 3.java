//Time Complexity: O(N) where N is the length of the pattern string or String s
//Space Complexity: O(K) where K is the average length of each string in s.

import java.util.*;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(s.length() == 0 || s == null || pattern.length() == 0 || pattern == null) return false;
        
        String[] splitS = s.split(" ");
        if(splitS.length != pattern.length()) return false;
        
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        
        char[] sChar = pattern.toCharArray();
        
        for(int i = 0; i < pattern.length(); i++)
        {
            if(map1.containsKey(sChar[i]))
            {
                if(!map1.get(sChar[i]).equals(splitS[i])) return false;
            }
            
            map1.put(sChar[i], splitS[i]);
            
            if(map2.containsKey(splitS[i]))
            {
                if(map2.get(splitS[i]) != sChar[i]) return false;
            }
            
            map2.put(splitS[i], sChar[i]);
        }
        return true;
        
    }
}
