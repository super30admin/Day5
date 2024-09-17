/**
 * Time Complexity: O(n) where n = number of characters in pattern
 */
import java.util.*;
class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        
        // Create a key for each char in pattern if it doesn't exist yet
        // check if the current str (value) maps to the key (char at pattern) 
        // Also check there is no value already if the key already exists
        
        Map<Character, String> map = new HashMap<>();
        char[] arr = pattern.toCharArray();
        String[] words = str.split(" ");
        
        if ( arr.length != words.length ) // Verify pattern and str is a bijection
            return false;
        
        for(int idx=0; idx<arr.length; idx++) {
            char ch = arr[idx];
            String word = words[idx];
            if ( !map.containsKey(ch) ) {
                if ( map.containsValue(word) )
                    return false;
                map.put(ch, word);
            } else {
                String value = map.get(ch);
                if ( !value.equals(word) )
                    return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        WordPattern obj = new WordPattern();
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(obj.wordPattern(pattern, str));
    }
}