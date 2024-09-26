import java.util.HashMap;
import java.util.HashSet;

/**
 * TC: O(n) where n is length of characters in pattern
 * SC: O(n) to store string values after splitting, n is total number of strings
 */
public class WordPattern {

        public boolean wordPattern(String pattern, String s) {
            String[] patternSplit = s.split(" ");

            if (pattern.length() != patternSplit.length) {
                return false;
            }

            HashMap<Character, String> patternStringMap = new HashMap();

            HashSet<String> patternStringSet = new HashSet();

            for(int i=0; i < pattern.length(); i++) {

                char patternChar = pattern.charAt(i);
                String patternString = patternSplit[i];

                if(patternStringMap.containsKey(patternChar)) {

                    if(!patternStringMap.get(patternChar).equals(patternString)) {
                        return false;
                    }

                } else {
                    if (patternStringSet.contains(patternString)) {
                        return false;
                    }
                    patternStringMap.put(patternChar, patternString);
                    patternStringSet.add(patternString);
                }

            }

            return true;
        }
}
