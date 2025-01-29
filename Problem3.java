// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

import java.util.HashMap;
import java.util.HashSet;

public class Problem3 {

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] strArr = s.split(" ");

        if(pattern.length() != strArr.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap();
        HashSet<String> set = new HashSet();

        for (int i = 0; i < pattern.length(); i++) {

            char pChar = pattern.charAt(i);
            String str = strArr[i];

            if(map.containsKey(pChar)) {

                if(!map.get(pChar).equals(str)) {
                    return false;
                }

            } else {

                if(set.contains(str)) {
                    return false;
                } else {
                    map.put(pChar, str);
                    set.add(str);
                }

            }
        }

        return true;
    }
}
