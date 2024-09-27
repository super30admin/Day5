// Time Complexity : O(n) where n = length of string pattern or number of words in s
// Space Complexity : O(m) where m = number of unique words in s
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.*;

public class Problem_3 {

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> ptos = new HashMap<Character, String>(); // Hashmap to store mapping of each character from pattern to corresponding word in s
        HashMap<String, Character> stop = new HashMap<String, Character>(); // Hashmap to store mapping of each word in s to corresponding character in pattern
        String[] splitted = s.split("\\s+"); // Convert the string s to array of words
        if (pattern.length() != splitted.length) {
            return false; // Return false if number of characters in pattern does not match with the number of words in s
        }
        for (int i = 0; i < pattern.length(); i++) {
            char key1 = pattern.charAt(i); // Current character at pattern is the key for pattern to s mapping
            String key2 = splitted[i]; // Current word at splitted is the key for s to pattern mapping
            if (!ptos.containsKey(key1) && !stop.containsKey(key2)) { // If both the keys are absent in their corresponding hashmaps, then put the keys and values in both the hashmaps
                ptos.put(key1, key2);
                stop.put(key2, key1);
            } else { // If either of the hashmaps contain the respective key
                if ((ptos.containsKey(key1) && !ptos.get(key1).equals(key2)) || 
                (stop.containsKey(key2) && stop.get(key2) != key1)) { // If the previous value corresponding to the key for either of the hashmaps doesn't match the new value, return false
                    return false;
                }
            }
        }
        return true; // Return true once we reach the end of pattern and splitted
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}