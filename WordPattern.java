// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordPattern {

    public static boolean isWordPattern(String pattern, String s)
    {
        HashMap <Character ,String> sToTMap = new HashMap<Character, String>();
        Set<String> tSet = new HashSet<>();
        String[] splited = s.split(" ");

        if(pattern.length() != splited.length){return false;}
        for (int  i = 0 ; i < pattern.length() ; i ++){
            char sChar = pattern.charAt(i);
            String t = splited[i];

            if (sToTMap.containsKey(sChar)){
                if(!sToTMap.get(sChar).equals(t)){
                    return false;
                }
            }
            else{
                if (tSet.contains(t)){
                    return false;
                }
            }
            sToTMap.put(sChar, t);
            tSet.add(t);
        }
        return true;
    }

    public static void main(String [] args){
        WordPattern.isWordPattern("abba","dog cat cat dog");
    }
}
