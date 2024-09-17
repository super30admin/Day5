
/**
 * Time Complexity -> O(N), where N is the size of the String
 * Space Complexity -> O(N), as we are using a hashmap to store seen values
 * Approach -> We convert 'pattern' string into a character array, and put each character into
 *             a hashmap associating it with a string from the 'str' string array (split on space).
 *             We maintain two hashmaps, and check whether each hashmap to returns the same value.
 */

import java.util.HashMap;

public class Problem3 {
    class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] strs = str.split("\\s+");
            if (pattern.length() < 1 || strs.length != pattern.length())
                return false;
            HashMap<Character, String> seen = new HashMap<>();
            HashMap<String, Character> seen2 = new HashMap<>();
            int i = 0;
            for (char c : pattern.toCharArray()) {

                if (seen.get(c) == null) {
                    seen.put(c, strs[i]);
                    if (seen2.get(strs[i]) == null)
                        seen2.put(strs[i], c);
                    else if (seen2.get(strs[i]) != c)
                        return false;
                } else if (seen.get(c).equals(strs[i]))
                    continue;
                else
                    return false;
                i++;
            }
            return true;
        }
    }

    public static void main(String args[]) {
        Solution s = new Problem3().new Solution();
        boolean result = s.wordPattern("abba", "dog cat cat dog");
        System.out.println(result);
    }
}