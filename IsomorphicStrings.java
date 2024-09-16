// Time Complexity : O(N) where N is length of the String. O(1) anyway for HashMaps
// Space Complexity : O(1) because it is still constant (maximum 26 characters or 256 including all ASCII)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        //base case
        if(s.length() != t.length() || s==null || t==null){
            return false;
        }

        //logic
        HashMap<Character, Character> sMap = new HashMap<>(); //Comparing s-> t
        HashMap<Character, Character> tMap = new HashMap<>(); //Comparing t-> s
        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){ //Check in the sMap first that sChar is tagged to tChar
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            }
            if(tMap.containsKey(tChar)){ //Check in the tMap first that tChar is tagged to sChar
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            }
            else{ //If not in the maps, add it here in both maps. This is to check unique mapping.
                sMap.put(sChar, tChar);
                tMap.put(tChar, sChar);
            }
        }
        return true; //If all above passes through, its a pass !
    }
}
