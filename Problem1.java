import java.util.*;
//import java.util.HashMap;

// Time Complexity
// With bruteforce solution: O(nk log k)
// With hashing: O(n)
// Where n = number of elements in array.
// Space Complexity
// With bruteforce solution: O(n^2)
// With hashing Optimization: O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) // Check for empty input array
            return new ArrayList<>();
        HashMap<Double, List> map = new HashMap<>(); // Create hashmap to store key as prime product and list of strings

        for (String s : strs) { // Iterate over the input : Time cimplexity for this iteration: O(n)
            // char [] splitArr = s.toCharArray();
            // Arrays.sort(splitArr); // k log K
            // String sorted = String.valueOf(splitArr);
            double primeProduct = primeProduct(s); // Calculate Prime product
            if (!map.containsKey(primeProduct)) { // Check if the key for the prime product exists: Time cpmlexity for
                                                  // .cotainsKey: O(k)
                map.put(primeProduct, new ArrayList<>()); // Add the primeProduct and empty list in map if not found
            }
            map.get(primeProduct).add(s); //// Append the list of the map if found
        }
        return new ArrayList(map.values()); // At the end return the List of all values of map.
    }

    public double primeProduct(String s) {
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };
        double result = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }
}

/*
 * class Solution {
 * public List<List<String>> groupAnagrams(String[] strs) {
 * if(strs == null || strs.length == 0) return new ArrayList<>();
 * HashMap<String,List> map = new HashMap<>();
 * 
 * for(String s: strs){ // O(n)
 * char [] splitArr = s.toCharArray();
 * Arrays.sort(splitArr); // k log K
 * String sorted = String.valueOf(splitArr);
 * 
 * if(!map.containsKey(sorted)){ // O(k)
 * map.put(sorted, new ArrayList<>());
 * }
 * map.get(sorted).add(s);
 * }
 * return new ArrayList(map.values());
 * }
 * }
 */