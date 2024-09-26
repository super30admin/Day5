import java.util.*;
public class problem3 {
    class Solution {
        public  boolean wordPattern(String pattern, String s) {
            HashMap <Character, String> map_char = new HashMap<>();
            HashMap <String, Character> map_word = new HashMap<>();
            String[] words = s.split(" ");
    
            if (words.length != pattern.length())
                return false;
    
            for (int i = 0; i < words.length; i++) {
                char c = pattern.charAt(i);
                String w = words[i];
                if (map_char.containsKey(c) && !map_char.get(c).equals(w)){
                    return false;
                }
                else{
                    map_char.put(c, w);
                }
                if (map_word.containsKey(w) && map_word.get(w) != c){
                    return false;
                }
                else{
                    map_word.put(w, c);
                }
            }
    
            return true;
        }
    }
}
