import java.util.HashMap;
import java.util.Map;

// Single HashMap
// Time Complexity: O(1)
// Space Complexity: O(n) as the character mappings are stored in map as key value.

// For 2 Arrays
// Time Complexity: O(1)
// Space Complexity: O(1)

// Used two approaches: 1) With Single HashMap 2) Using 2 Arrays with size 256. 
public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // true
        System.out.println(isIsomorphic("foo", "bar")); // false
        System.out.println(isIsomorphic("paper", "title")); // true
        System.out.println(isIsomorphic("badc", "baba")); // false
    }

    public static boolean isIsomorphic(String s, String t) {
        // Using HashMap
        /*
         * if (s.length() != t.length())
         * return false;
         * Map<Character, Character> map = new HashMap<>();
         * for (int i = 0; i < s.length(); i++) {
         * if (!map.containsKey(s.charAt(i))) {
         * if (!map.containsValue(t.charAt(i))) {
         * map.put(s.charAt(i), t.charAt(i));
         * } else
         * return false;
         * } else if (map.get(s.charAt(i)) != t.charAt(i)) {
         * return false;
         * }
         * }
         * return true;
         */

        // Using 2 Arrays
        if (s.length() != t.length())
            return false;
        int sArray[] = new int[256]; // total ascii character are 256 (0 to 255)
        int tArray[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if (sArray[s1] != tArray[t1])
                return false;

            sArray[s1] = i + 1;
            tArray[t1] = i + 1;
        }
        return true;
    }

}