// Time Complexity : O(n) + O(n), where n is the length of the string. Beacuse of the for loop and contain values
// Space Complexity : The keys and values are character so O(1) for 26 char in the hashmap.
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

import java.util.HashMap;

public class Isomorphic {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> hm = new HashMap<>();
        char[] arr_input = s.toCharArray();
        char[] arr_output = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char ch_s = arr_input[i];
            char ch_t = arr_output[i];
            // if hashmap contains already then check if it is what it should have been
            if (hm.containsKey(ch_s)) {

                if (hm.get(ch_s) == ch_t)
                    continue;
                // look next iteration
                else
                    // if not what we expected return false
                    return false;
            }
            // put this into hashmap if key is also seen for the first time else return
            // false;
            else if (!hm.containsValue(ch_t))
                hm.put(ch_s, ch_t);
            else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Isomorphic test = new Isomorphic();
        String s = "anin";
        String t = "xcif";
        String n = "xcic";
        System.out.println(test.isIsomorphic(s, t));
        System.out.println(test.isIsomorphic(s, n));

    }

}
