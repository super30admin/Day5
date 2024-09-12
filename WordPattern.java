package S30.Hashing1;

/*
* Successfully executed on leetcode
* Time complexity: iterated over both string only once, so it will be O(n) where n is size of string
* Space Complexity: here we are using 2 hashmaps space taken will be O(n+n) => O(n)
* */

/* Approach: we map both patterns letters to words in string and vice versa in two hashmaps
*           we check both maps while inserting element into maps. If it's already present compare with
*           current value with the one existing value in hashmap.
* */
import java.util.*;
public class WordPattern {
    public static void main(String args[]){
        System.out.print(wordPattern("abba", "cat cat cat cat"));
    }
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> mapPatternTostring = new HashMap<>();
        Map<String, Character> mapStringToPattern = new HashMap<>();
        StringTokenizer st = new StringTokenizer(s);

        if(pattern.length() != st.countTokens())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            Character tempChar = pattern.charAt(i);
            String nextToken = st.nextToken();
            if(mapPatternTostring.containsKey(tempChar)) {
                if (mapPatternTostring.get(tempChar).equals(nextToken))
                    continue;
                else
                    return false;
            } else{
                if(mapStringToPattern.containsKey(nextToken)){
                    if(mapStringToPattern.get(nextToken) != tempChar)
                        return false;
                }
                else {
                    mapPatternTostring.put(tempChar, nextToken);
                    mapStringToPattern.put(nextToken,tempChar);
                }
            }
        }
        return true;
    }
}
