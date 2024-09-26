//Time Complexity  : O(n). Only once we'll parse through whole string. so O(n), n = length of the string
//Space Complexity : O(1)

import java.util.*;

public class LogestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashSet<Character> hset = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char eachChar = s.charAt(i);
            if (hset.contains(eachChar)) {
                count = count + 2;
                hset.remove(eachChar);
            } else {
                hset.add(eachChar);
            }
        }
        if (!hset.isEmpty()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        LogestPalindrome lp = new LogestPalindrome();
        System.out.println(lp.longestPalindrome(s));
    }
}
