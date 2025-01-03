import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    /**
     * Time complexity: O(Nklogk) where k is the length of each string (klogk for sorting strings)
     * Space complexity: O(N)
     * Did this code successfully run on Leetcode : Yes
     * Any problem you faced while coding this : no
     */
    public List<List<String>> groupAnagrams1(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String item: strs) {
            // sort key
            String key = sortString(item);
            // check if key exists in map, if not add new list and add string to list
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(item);
        }

        // convert map values to list
        return new ArrayList<>(map.values());
    }

    private String sortString(String str) {
        char[] sc = new char[26];
        for(char c: str.toCharArray()) sc[c-'a']++;
        return String.valueOf(sc);
    }

    /**
     * Time complexity: O(N*K) where k is the length of each string
     * Space complexity: O(N)
     * Did this code successfully run on Leetcode : Yes
     * Any problem you faced while coding this : no
     */
    public List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for (String item: strs) {
            // sort key
            double key = getPrimeProduct(item);
            // check if key exists in map, if not add new list and add string to list
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(item);
        }

        // convert map values to list
        return new ArrayList<>(map.values());
    }

    /**
     * For each string instead of sorting, generate a prime product
     *
     * NOTE: Since the product of primes is always unique, using this approach.
     * @param str string to generate prime product for
     * @return prime product for the given string
     */
    private double getPrimeProduct(String str) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double primeProduct = 1;
        for (char ch: str.toCharArray()) {
            primeProduct *= primes[ch - 'a'];
        }
        return primeProduct;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams obj = new GroupAnagrams();
        List<List<String>> result = obj.groupAnagrams1(strs);
        System.out.println("Result: " + result);

        result = obj.groupAnagrams2(strs);
        System.out.println("Result: " + result);
    }
}
