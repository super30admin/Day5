package HashFunction;

import java.util.HashMap;

/*
 -------------------------------------------------------------------------------------------------------
Time complexity : o(n) - n * traversing each element o(n) and time complexity of map is 0(1) since there are only maximum of 26 characters(constant) that go as key in map. 
space complexity: o(n) --> o(n) the values in map takes up space equal to number of characters in string s1 and s2
Did this code run successfully in leetcode : yes
problems faces : no
create a map to store each character of s1  as key and and character of s2 as it corresponding value.
for the repeated characters ,as key already exists in the map, get the value and it should match with character in s2. else words are not isomorphic.
Repeat the above steps with characters of s2 as key and characters of s1 as corresponding values.
*/
public class Isomorphic {

    public boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        HashMap<Character, Character> s1Map = new HashMap<Character, Character>();
        HashMap<Character, Character> s2Map = new HashMap<Character, Character>();
        for (int i = 0; i < s1.length(); i++) {
            if (!s1Map.containsKey(s1.charAt(i))) {
                s1Map.put(s1.charAt(i), s2.charAt(i));
            }
            if (s2.charAt(i) != s1Map.get(s1.charAt(i))) {
                return false;
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!s2Map.containsKey(s2.charAt(i))) {
                s2Map.put(s2.charAt(i), s1.charAt(i));
            }

            if (s1.charAt(i) != s2Map.get(s2.charAt(i))) {
                return false;
            }
        }

        return true;
    }

}
