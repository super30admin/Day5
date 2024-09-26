// Time Complexity = O(k) 
// Space Complexity = O(n) 

import java.util.HashMap;
import java.util.Map;
class PatternMatching {
    public boolean wordPattern(String pattern, String str)
    {
        Map<Character,String> patternMap=new HashMap<>();
        Map<String,Character> strMap=new HashMap<>();
        if(pattern==null||pattern.length()==0)
        return false;
        if(str==null||str.length()==0)
        return false;
        String[] strArray=str.split(" ");
        if(strArray.length!=pattern.length())
        return false;
       
        for(int i=0;i<pattern.length();i++)
        {
            if(!patternMap.containsKey(pattern.charAt(i)))
            patternMap.put(pattern.charAt(i), strArray[i]);
            else {
                if(!patternMap.get(pattern.charAt(i)).equals(strArray[i]))
                return false;
            }
            if(!strMap.containsKey(strArray[i]))
            strMap.put(strArray[i],pattern.charAt(i));
            else {
                if(strMap.get(strArray[i])!=pattern.charAt(i))
                return false;
            }
        }

        return true;
    }
}