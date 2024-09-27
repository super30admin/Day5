// Time Complexity : O(n) (length of pattern)
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    // Creating map to put character in pattern as key and corresponding string in str as value
    // Compaing key and values to decide the pattern
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            } else {
                if(map.containsValue(words[i])){
                    return false;
                } else{
                    map.put(pattern.charAt(i),words[i]);
                }
            }
        }

        return true;
    }

    public static void main(String args[]){
        String pattern = "abba", str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));

    }
}
