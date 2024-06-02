// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : nO

/* Approach: We create an array of the first 26 prime numbers and indirectly map each letter to it, this gives unique products with every 
 * multiplcation done, we then store this product and map it to respective strings. By this we group all the anagrams together as they'll
 * have the same product.
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs == null || strs.length == 0){
        return new ArrayList<>();
       }  // base case if nothing is there
       HashMap<Double,List<String>> map = new HashMap<>(); // creating a hashmap of double mapped to list of strings
       for(int i = 0; i < strs.length; i++){
        String s = strs[i];
        double primeProduct = primeProduct(s); // calling the prime product function to get thr product

        if(!map.containsKey(primeProduct)){ // check to see if it is in the hashmap
            map.put(primeProduct, new ArrayList<>()); // if not then create a new key with the product and make an empty list
        }
        map.get(primeProduct).add(s); // adding the string
       }
       return new ArrayList<>(map.values());
    }

    private double primeProduct(String s){
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101}; // array of first 26 prime numbers
        double result = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            result = result * primes[c - 'a']; // checking the product, subtracting the ascii values
        }
        return result;
    }
}