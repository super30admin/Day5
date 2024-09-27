// Time Complexity : O(n) where n = length of string s or t
// Space Complexity : O(1) since number of characters in ASCII are fixed
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.*;

public class Problem_2 {
    
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> stot = new HashMap<Character, Character>(); // Hashmap to store mapping of characters from s to t
        HashMap<Character, Character> ttos = new HashMap<Character, Character>(); // Hashmap to store mapping of characters from t to s
        for (int i = 0; i < s.length(); i++) {
            char key1 = s.charAt(i); // Current character at s is the key for s to t mapping
            char key2 = t.charAt(i); // Current character at t is the key for t to s mapping
            if (!stot.containsKey(key1) && !ttos.containsKey(key2)) { // If both the keys are absent in their corresponding hashmaps, then put the keys and values in both the hashmaps
                stot.put(key1, key2);
                ttos.put(key2, key1);
            } else { // If either of the hashmaps contain the respective key
                if ((stot.containsKey(key1) && stot.get(key1) != key2) || 
                    (ttos.containsKey(key2) && ttos.get(key2) != key1)) { // If the previous value corresponding to the key for either of the hashmaps doesn't match the new value, return false
                    return false;
                }
            }
        }
        return true; // Return true once we reach the end of the strings
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
