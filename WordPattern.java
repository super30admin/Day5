/*
In this case m and n i.e. lengths of given string and pattern is going to be same so m == n
Time Complexity: O(m+n) -> O(2n) -> O(n) looping over given string and pattern in linear time
Space Complexity:  O(m+n) -> O(2n) -> O(n)  looping over given string and pattern in linear time
*/
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[] patternArr = pattern.toCharArray();
        String[] stringArr = s.split(" ");
        if(patternArr.length != stringArr.length) return false;
        
        Map<Character, Integer> patternMap = new HashMap<>();
        Map<String, Integer> stringMap = new HashMap<>();
        
        for(int i = 0; i < patternArr.length; i++){
            int indexPattern = patternMap.getOrDefault(patternArr[i], -1);
            int indexString = stringMap.getOrDefault(stringArr[i], -1);
            
            if(indexPattern != indexString) return false;
            patternMap.put(patternArr[i], i);
            stringMap.put(stringArr[i],i);
        }
        return true;
    }
}