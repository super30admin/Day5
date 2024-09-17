
//
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//Mapping the characters to the words in the second string using hashmap.

import java.util.HashMap;
import java.util.Map;

public class WordPattern1 {
    public boolean wordPattern(String pattern, String s) {
        String[] StrList = s.split(" ");
        char[] patternChar = pattern.toCharArray();

        if(StrList.length!=patternChar.length){
            return false;
        }

        Map<Character,String> lookUpTable = new HashMap<>();

        for(int i=0; i<StrList.length;i++){
            if(!lookUpTable.containsKey(patternChar[i])){
                if(lookUpTable.containsValue(StrList[i])){
                    return false;
                }else{
                    lookUpTable.put(patternChar[i],StrList[i]);
                }
            }else{
                if(!lookUpTable.get(patternChar[i]).equals(StrList[i])){
                    return false;
                }
            }
        }

        return true;
    }
}
