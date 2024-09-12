// Time Complexity : O(n)
// Space Complexity : O(m) m is number of unique strings
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes I got an error in checking already mapped or not. 

import java.util.*;

class Main {

    public static boolean wordPattern(String pattern, String s) {
        // here we split string by space and store it in array
        String[] splited = s.split(" ");

        // if pattern length and spitted array length is not same than we return false
        if (pattern.length() != splited.length)
            return false;

        // create two hashmap for mapping
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        // here we are checking for each character in pattern are mapped correcly or not
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = splited[i];

            // here we first check pattern character is mapped to word in the string
            if (!map1.containsKey(c)) {
                // than check word to pattern character is mapped or not. if mapped that means
                // word is already mapped to another character that means same word is mapped to
                // two different pattern character so we return false
                if (map2.containsKey(str)) {
                    return false;
                }

                // mapping pattern character to word in string and word to pattern character
                map1.put(c, str);
                map2.put(str, c);
            } else {

                // else check that it is correctly mapped ot not. if not we return false
                if (!map1.get(c).equals(str) || !(map2.get(str) == c)) {
                    return false;
                }

            }
        }

        // if all the pattern character in the string are correctly mapped than we
        // return true
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));

    }
}