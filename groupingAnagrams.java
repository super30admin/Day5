// Time Complexity :O(NK) where K is length of a string
// Space Complexity :O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    // Array containing the first 26 prime numbers, each corresponding to a letter in the alphabet
    int[] primes = {
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
        31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
        73, 79, 83, 89, 97, 101
    };


    private double stringProduct(String s) {
        double result = 1;
        for (int i = 0; i < s.length(); i++) {
            result *= primes[s.charAt(i) - 'a'];
        }
        return result;
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to store the product of prime numbers as the key and list of anagrams as the value
        HashMap<Double, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Calculate the product of primes for the current string
            double keyStringProduct = stringProduct(s);
            // If the product is not already a key in the map, add it with an empty list
            if (!map.containsKey(keyStringProduct)) {
                map.put(keyStringProduct, new ArrayList<>());
            }
            // Add the current string to the list corresponding to its product key
            map.get(keyStringProduct).add(s);
        }
        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
}
