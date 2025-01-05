// Time Complexity : O (n) where n = number of words
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach
/*
 * Since the product of any two primes is always unique, use this property to
 * map each letter to a corresponding prime and then take the product of each incoming word
 * Use this product as a key in a map to group the anagrams, return the values as the groups.
 * Note: use double in java to prevent integer overflow (long is not enough)
 */
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        Map<Long, List<String>> groups = new HashMap<>();

        for(String str: strs) {
            long product = 1;
            for(int i = 0; i < str.length(); i++) {
                product *= primes[str.charAt(i) - 'a'];
            }
            groups.putIfAbsent(product, new ArrayList<>());
            groups.get(product).add(str);
        }
        return new ArrayList<>(groups.values());
    }
}
