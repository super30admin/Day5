// Time Complexity: O(1)
// Space Complexity: O(k log n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No problem while coding

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {

    public static List<List<String>> grpAnagram(String[] st) {
        HashMap<Double, List<String>> map = new HashMap<>();

        for (String strs : st) {
            double primeP = primeProduct(strs);
            if (!map.containsKey(primeP)) {
                map.put(primeP, new ArrayList<>());
            }
            map.get(primeP).add(strs);
        }
        return new ArrayList<>(map.values());
    }

    private static double primeProduct(String s) {
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97, 101,
                103 };
        double result = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(grpAnagram(strs));
    }
}
