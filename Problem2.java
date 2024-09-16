// Time Complexity : O(1)
// Space Complexity : Not sure
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Did not take into consideration the conditions where string s=ab and t=ba. My code gave wrong answer which was resolved later

// Your code here along with comments explaining your approach: Using a hashmap checked value of each and every character in both strings. if character ins string s is not present added it with character of string t as a key,value pair and if available then checked if the key has specified value. If not return false 

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {

            char val1 = s.charAt(i);
            char val2 = t.charAt(i);

            if (hm.containsKey(val1)) {

                if (Character.compare(hm.get(val1), val2) != 0) {
                    return false;
                }

            } else {
                if (!hm.containsValue(val2)) {
                    hm.put(val1, val2);
                } else {
                    return false;
                }

            }

        }

        return true;

    }
}