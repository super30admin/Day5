// Time Complexity: O(n * m) where n is the number of string and m is the length of each string
// Space Complexity: O(n * m)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Your code here along with comments explaining your approach in three sentences only
/**
 * Approach: 
 * This problem is to group anagrams from a list of strings. 
 * I calculated the the product of prime numbers for each string by mapping its characters to prime numbers 
 * using helper method(primeProduct()). If the prime product doesn't exist in the map, create a new list for 
 * that product and if it exist then add the current string to the list corresponding to its prime product.
 */ 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // If array is null or empty return empty list
        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        // Create HashMap to store groups of anagrams based on their prime product value
        // In this HashMap key is unique product of prime numbers for each group of anagram
        HashMap<Double, List<String>> map = new HashMap<>();
       
        // Iterate through each String in the array
        for(int i = 0; i < strs.length; i++) {

            String s = strs[i];
            // Calculate the prime product for the current string
            double primeProduct = primeProduct(s);

            // If the prime product doesn't exist in the map, create a new list for that product
            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }

    // Helper method to calculate a unique product of prime numbers for given String
    private double primeProduct(String s) {
        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double result = 1;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }
}