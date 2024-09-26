// Time Complexity : O(N)
// Space Complexity :O(N). Ignore mapCharToWord since space is limited to 26 characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> mapCharToWord = new HashMap<>();//[(a,dog),(b,cat)]
        HashMap<String,Character > mapWordToChar = new HashMap<>();//[(dog,a),(b,cat)]
        String[] strings = s.split(" ");
        if (strings.length != pattern.length())
            return false;

        for(int i=0; i<pattern.length(); i++) {

            if(!mapCharToWord.containsKey(pattern.charAt(i))) {
                if(mapWordToChar.containsKey(strings[i])){
                    return false;
                }else {
                    mapCharToWord.put(pattern.charAt(i),strings[i]);
                    mapWordToChar.put(strings[i],pattern.charAt(i));
                }
            }else {
                if(!mapCharToWord.get(pattern.charAt(i)).equals(strings[i]))
                    return false;
            }
        }

        return true;
    }
}
