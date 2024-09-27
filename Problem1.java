// Time Complexity : O(n.k)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.*;

public class Problem1 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        int[] charKeys = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
                83, 89, 97, 101 };
        List<List<String>> result = new ArrayList<>();
        HashMap<Double, List<String>> map = new HashMap<>();
        for (String s : strs) {
            double prod = 1;
            for (int i = 0; i < s.length(); i++) {
                prod *= charKeys[s.charAt(i) - 'a'];
            }
            List<String> temp;
            if (!map.containsKey(prod)) {
                temp = new ArrayList<>();
            } else {
                temp = map.get(prod);
            }
            temp.add(s);
            map.put(prod, temp);
        }
        for (List<String> list : map.values()) {
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] input = new String[] { "ate", "tea", "tan", "nat", "fig", "gif" };
        System.out.println(groupAnagrams(input));
    }
}