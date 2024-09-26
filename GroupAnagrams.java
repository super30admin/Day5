// Time complexity: O(nk) where n is the number of words and k is the average length of words.
// Space complexity: O(nk) where n is the number of words and k is the average length of words.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<Double, List<String>> map = new HashMap<>();            // For mapping prime products with strings.
        for(String str: strs) {
            double primeProduct = getPrime(str);
            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);             // Add the strings to the same product value.
        }
        return new ArrayList<>(map.values());
    }
    
    // Time complexity: O(k) where k is the length of the passed string.
    // Space complexity: O(1) since the primes array is always the same. 
    private double getPrime(String str) {
        double product = 1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int prime = primes[c - 'a'];        // If a - 'a',i.e., 97 - 97, it gives 0.
            product = product * prime;
        }
        return product;
    }
}