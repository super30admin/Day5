
/*

Time Complexity:  O(n) where n is the length of the String pattern.
Space Complexity : O(n +m) where n is unique elements in hashmap and m is the all string in split array

*/
import java.util.*;

public class Solution_word {

    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map = new HashMap<>();
        // created set for finding the duplicate string.

        HashSet<String> set = new HashSet<>();

        String st[] = s.split(" ");

        if (pattern.length() != st.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {

            if (map.containsKey(pattern.charAt(i))) {

                String temp = map.get(pattern.charAt(i));

                if (temp.equals(st[i])) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if (set.contains(st[i])) {

                    return false;
                }
                map.put(pattern.charAt(i), st[i]);
                set.add(st[i]);
            }

        }

        return true;
    }
}
