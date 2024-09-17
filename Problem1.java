
/**
 * Time Complexity -> O(N K log K), where N is the size of the array, and
 *                      K is the size of the longest string.
 * Space Complexity -> O(N), as we are using a hashmap to store seen values
 * Approach -> We go through each string in the array (this would take O(N) time), and
 *             convert each string a char array, and sort the characters(takes K log K time), and convert
 *             it back to string, and store it in a hashmap. We store each string with the same
 *             sorted structure in a list, and return these lists as a new list.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem1 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> hmap = new HashMap<>();
            for (String str : strs) {
                char[] strArr = str.toCharArray();
                Arrays.sort(strArr);
                String sortedStr = new String(strArr);

                if (hmap.get(sortedStr) == null) {
                    hmap.put(sortedStr, new ArrayList<>());
                    hmap.get(sortedStr).add(str);
                } else {
                    hmap.get(sortedStr).add(str);
                }
            }
            return new ArrayList<>(hmap.values());
        }
    }

    public static void main(String args[]) {
        Solution s = new Problem1().new Solution();
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> result = s.groupAnagrams(strs);

        result.forEach(list -> {
            list.forEach(val -> System.out.println(val));
        });
    }
}