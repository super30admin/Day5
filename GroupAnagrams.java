import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// TC : O(n)
// SC : O(1)
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<Double, List<String>> map = new HashMap<>();

        // iterates over the every string in string array and inserts the primeproduct
        // in each key of hashmap

        for (String str : strs) {
            double primeproduct = primeProduct(str);
            // if for the first time the key is seen creates new arraylsit
            if (!map.containsKey(primeproduct)) {
                map.put(primeproduct, new ArrayList<>());
            }
            // adding the string into the value arraylsit
            map.get(primeproduct).add(str);

        }
        return new ArrayList<>(map.values());
    }

    // assigns each character a prime number and returns the product of all
    // characters of hte string
    private double primeProduct(String str) {
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101 };
        double product = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            product = product * primes[ch - 'a'];
        }
        return product;
    }
}
