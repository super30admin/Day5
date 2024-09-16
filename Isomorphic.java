/**
 * Time complexity: O(N) where N is length of the input string
 * Space complexity : O(N) where N is length of the input string
 */
import java.util.*;
public class Isomorphic {
    public static void main(String args[]){
        String str = "eggsa", pattern = "affye";
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

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> pMap = new HashMap<>();
        
        for(int i=0; i<str.length(); i++){
            char sKey = str.charAt(i);
            char pKey = pattern.charAt(i);

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
