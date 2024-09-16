package S30_Codes.Hashing_1;

// Time Complexity = O(n) // n = length of string s
// Space Complexity = O(1)
// Hashing-1

import java.util.HashMap;
import java.util.Map;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String strArr[] = s.split(" ");

        if(pattern.length() != strArr.length)
            return false;

        Map<Character, String> patternToStr = new HashMap<>();
        Map<String, Character> strToPattern = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char currentChar = pattern.charAt(i);
            String currentStr = strArr[i];

            if( patternToStr.containsKey(currentChar) ){
                if( !patternToStr.get(currentChar).equals(currentStr) )
                    return false;
            }
            else{
                if( strToPattern.containsKey(currentStr) )
                    return false;
                else{
                    patternToStr.put(currentChar, currentStr);
                    strToPattern.put(currentStr, currentChar);
                }
            }
        }
        return true;
    }
}