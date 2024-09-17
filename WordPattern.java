import java.util.Map;

// Time Complexity : O(L) where L is the length of  the pattern string
// Space Complexity : O(1) Even if we are using 2 Hash Maps, still space complexity is
//O(1) because max there will be 26 small case characters.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*Approach
 * Idea over here is to use two hash maps, 1st map will store character to string relationship and
 * 2nd map will store string to char relation.
 * We will check for each character in string pattern if key value relations in both the map
 * */

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        //edge case
        if(pattern==null || pattern.length()==0 || s==null || s.length()==0) return false;

        String [] sArr = s.split(" ");
        //edge case
        if(pattern.length()!=sArr.length) return false;

        Map<Character, String> charToStringMap = new HashMap<>();
        Map<String, Character>  stringToCharMap = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String t = sArr[i];

            //check if the key c is there and corresponding value equal string t
            if(charToStringMap.containsKey(c) && !charToStringMap.get(c).equals(t)){
                return false;
            }
            else{
                charToStringMap.put(c,t);
            }

            //check if key string t is present and corresponding value equal char c
            if(stringToCharMap.containsKey(t) && !stringToCharMap.get(t).equals(c)){
                return false;
            }
            else {
                stringToCharMap.put(t,c);
            }
        }
        return true;
    }
}
