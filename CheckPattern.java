/**
 * Time complexity: O(N) where N is length of the input string
 * Space complexity : O(N) where N is length of the input string
 */

import java.util.*;
public class CheckPattern {
    public static void main(String args[]){
        String str = "eggs", pattern = "dog apple apple dog";
        System.out.println(checkPattern(str, pattern));
    }

    private static boolean checkPattern(String str, String pattern){
        
        if(str == null && pattern == null){
            return true;
        }

        if(str.length() == 0 && pattern.length() == 0){
            return true;
        }

        if(str == null || str.length() == 0 || pattern == null || pattern.length() == 0){
            return false;
        }

        String[] patternArray = pattern.split(" ");
        if(str.length() != patternArray.length){
            return false;
        }
        Map<Character, String> sMap = new HashMap<>();
        Map<String, Character> pMap = new HashMap<>();
        
        for(int i=0; i<str.length(); i++){
            char sKey = str.charAt(i);
            String pKey = patternArray[i];

            if(!sMap.containsKey(sKey)){
                sMap.put(sKey, pKey);
            }else{
                if(!sMap.get(sKey).equals(pKey)){
                    return false;
                }
            }

            if(!pMap.containsKey(pKey)){
                pMap.put(pKey, sKey);
            }else{
                if(!pMap.get(pKey).equals(sKey)){
                    return false;
                }
            }
        }

        return true;
    }
}
