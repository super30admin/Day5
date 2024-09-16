// Time Complexity : O(1)
// Space Complexity : Not sure
// Did this code successfully run on Leetcode : --
// Any problem you faced while coding this : 

//Solved using a single hashmap by storing pattern's character and string's word as ket, value pair. If pattern is available then checked if pattern;s value matches the array's value. If no return false and allowed the loop to run until we found either true or false

import java.util.HashMap;

public class pattern {

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog dog dog dog";

        System.out.println(pattern_follow(pattern, str));

    }

    public static boolean pattern_follow(String pattern, String str) {

        String[] words = str.split("\\s+");
        HashMap<Character, String> hm = new HashMap<Character, String>();
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String value = words[i];
            if (hm.containsKey(key)) {
                String s1 = hm.get(key);
                if (!s1.equals(value)) {
                    return false;
                }
            } else {
                if (!hm.containsValue(value)) {
                    hm.put(key, value);
                } else {
                    return false;
                }

            }
        }

        return true;

    }

}
