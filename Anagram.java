
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

// Naive approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());

    }
}

// Prinme number approach

class Solution_2 {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<Double, List<String>> map = new HashMap<>();

        for (String str : strs) {

            double primeProduct = getPrimeProduct(str);

            if (!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }
        return new ArrayList<>(map.values());

    }

    private double getPrimeProduct(String s) {
        double result = 1;

        // Generate prime numbers using Sieve of Eratosthenis function
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int prime = primes[c - 'a'];
            result = result * prime;
        }

        return result;
    }

}
