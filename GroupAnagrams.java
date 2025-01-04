import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Classical way of sorting the string and checking for the key and updating values accordingly 
// Time Complexity: O(nk log k)
// Space Complexity: O(nk) as Map and temporary char array is used.

// Performing the unique prime product and setting it as a key.
// Time Complexity: O(nk)
// Space Complexity: O(n) as only Map is used

// Used two approaches: 1) Using key/sorted key and updating map 2) Using Prime product
// The 2nd solution is better because of efficient time and space complexity
public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" })); // [["bat"],["nat","tan"],["ate","eat","tea"]]
        System.out.println(groupAnagrams(new String[] { "" })); // [[""]]
        System.out.println(groupAnagrams(new String[] { "a" })); // [["a"]]
        System.out.println(groupAnagrams(
                new String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" }));
        // [["aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"],["aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"]]
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // Using Classical way of checking with sorting string as a key
        // if (strs.length == 0)
        // return new ArrayList<>();

        // Map<String, List<String>> map = new HashMap<>();
        // for (String str : strs) {
        // char array[] = str.toCharArray();
        // Arrays.sort(array);
        // if (!map.containsKey(String.valueOf(array))) {
        // map.put(String.valueOf(array), new ArrayList<>());
        // }
        // map.get(String.valueOf(array)).add(str);
        // }
        // return new ArrayList<>(map.values());

        // Using less time complexity by calculating unique hash of every string via
        // Prime Products
        if (strs.length == 0)
            return new ArrayList<>();

        Map<Double, List<String>> map = new HashMap<>();
        for (String str : strs) {
            double hashProduct = getHash(str);
            if (!map.containsKey(hashProduct)) {
                map.put(hashProduct, new ArrayList<>());
            }
            map.get(hashProduct).add(str);
        }
        return new ArrayList<>(map.values());

    }

    private static double getHash(String input) {
        int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };
        double product = 1;
        for (char c : input.toCharArray())
            product *= primes[c - 'a'];
        return product;
    }

}
