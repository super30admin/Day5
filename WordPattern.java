import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Maintain two hashmaps, one which maps character to string and other which maps string to character
// and check if the respective values match for each other

public class WordPattern {
        public boolean wordPattern(String pattern, String s) {
            String[] words = s.split(" ");
            if(words.length != pattern.length()){
                return false;
            }
            HashMap<Character, String> hmapPattern = new HashMap<>();
            HashMap<String, Character> hmapWords = new HashMap<>();
            for(int i=0;i<pattern.length();i++){
                if(hmapPattern.containsKey(pattern.charAt(i))){
                    if(!hmapPattern.get(pattern.charAt(i)).equals(words[i])){
                        return false;
                    }
                }else{
                    if(hmapWords.containsKey(words[i]) && (!hmapWords.get(words[i]).equals(pattern.charAt(i)))){
                        return false;
                    }else{
                        hmapPattern.put(pattern.charAt(i), words[i]);
                        hmapWords.put( words[i], pattern.charAt(i));
                    }
                }
            }
            return true;
        }

}
