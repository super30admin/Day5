import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Time Complexity : O(NK) where n is the number of strings and k is the average length of each string
 * Space Complexity : O(1) because there are only 26 alphabets
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        // base condtion
        if (strs.length == 0 || strs == null) {
            return new ArrayList<>();
        }

        // Iterating through strs array
        for (int i = 0; i < strs.length; i++) {
            // Calculating prime product
            double primeProduct = primeProduct(strs[i]); // double - To avoid integer overflow
            // Checking if the key is not present add the key , and empty arrayList
            if (!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            // Adding value against the key(primeProduct)
            map.get(primeProduct).add(strs[i]);

        }
        return new ArrayList<>(map.values());
    }

    private double primeProduct(String str) {
        int[] primeArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double product = 1;
        for (int i = 0; i < str.length(); i++) {
            product = product * primeArray[str.charAt(i) - 'a'];
        }
        return product;
    }
}
