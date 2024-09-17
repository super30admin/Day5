import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(k) where k is the number of characters/no of words in the input
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach

public class PatternMatching {
    public boolean isPatternMatching(String pattern, String str)
    {
        if(pattern==null||pattern.length()==0)
        return false;
        if(str==null||str.length()==0)
        return false;
        String[] strArray=str.split(" ");
        if(strArray.length!=pattern.length())
        return false;
         //maintaining two Maps for Pattern Character to word Map and a Word to character Map.
        Map<Character,String> patternMap=new HashMap<>();
        Map<String,Character> strMap=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            //creating a mapping and checking if a mapping already exists whether it's being followed or not 
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

    public static void main(String[] args)
    {
        PatternMatching obj=new PatternMatching();
      System.out.println(obj.isPatternMatching("abba","dog cat cat fish"));
    }
}