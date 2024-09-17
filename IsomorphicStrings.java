import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(L) where L is the length of  the string
// Space Complexity : O(1) Even if we are using 2 Hash Maps, still space complexity is
//O(1) because max there will be 26 small case characters.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// The approach is to use 2 Hash Map. One hash map for each string.
//In 1st hash map we will store 1st string  character as key and value as the character of 2nd string at same index.
//In 2nd hash map we will store 2nd string character as key and value as the character of 1st string at the same index.
//We will traverse for each character in the string and put in the map if not present, incase it is present, we will
//check if the value for that key is same as the charater in another string
//Remember 2 Hash map are required for case like below
//S1=eggc : S2=adda where it it will for 1st map where c = a but return false for 2nd map


public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        Map<Character, Character> sMap = new HashMap<Character, Character>();
        Map<Character, Character> tMap = new HashMap<Character, Character>();

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar) && sMap.get(sChar)!=tChar){
                return false;
            }
            else {
                sMap.put(sChar,tChar);
            }

            if(tMap.containsKey(tChar) && tMap.get(tChar)!=sChar){
                return false;
            }
            else {
                tMap.put(tChar,  sChar);
            }
        }
        return true;
    }
}