// Time Complexity :O(n*k), where is the number of words and k is the average length of the words.
// Space Complexity : O(n*k), where is the number of words and k is the average length of the words. same for both
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

import java.util.HashMap;
import java.util.Arrays;

public class Main {

    public boolean isPattern(String s, String t) {

        HashMap<Character, String> hm = new HashMap<>();
        // create a list of char and strings
        char[] arr_input = s.toCharArray();
        String[] arr_output = t.split(" ");

        // for each word in the patter see if it has a value in the hashmap
        for (int i = 0; i < s.length(); i++) {
            char ch = arr_input[i];
            String str = arr_output[i];

            if (hm.containsKey(ch)) {
                // if it has the value, check if it has the key that it should have
                if (hm.get(ch).equals(str))
                    // if yes continue
                    continue;
                else
                    return false;
            } else if (!hm.containsValue(str))
                hm.put(ch, str);
            else
                return false;

        }

        return true;
    }

    public static void main(String[] args) {

        Main test = new Main();
        String s = "abba";
        String t = "dog dog dog dog";

        System.out.println(test.isPattern(s, t));

    }

}
