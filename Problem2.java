
/**
 * Time Complexity -> O(N), where N is the size of the String
 * Space Complexity -> O(N), as we are using a hashmap to store seen values
 * Approach -> We convert 's' string into a character array, and put each character into
 *             a hashmap associating it with the character from the 't' string. We maintain two
 *             hashmaps, and check whether each hashmap to returns the same value
 */

import java.util.HashMap;

public class Problem2 {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> seen = new HashMap<>();
            HashMap<Character, Character> seen2 = new HashMap<>();
            int j = 0;
            for (char c : s.toCharArray()) {
                char tChar = t.charAt(j);
                if (seen.get(c) == null) {
                    seen.put(c, tChar);
                    if (seen2.get(tChar) == null)
                        seen2.put(tChar, c);
                    else if (seen2.get(tChar) != c)
                        return false;
                } else if (seen.get(c) == tChar)
                    continue;
                else
                    return false;
                j++;
            }
            return true;
        }
    }

    public static void main(String args[]) {
        Solution s = new Problem2().new Solution();
        boolean result = s.isIsomorphic("egg", "add");
        System.out.println(result);
    }
}