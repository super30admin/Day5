/**
 * Time Complexity: O(N * K) where N is the total strings in strs array, K is the length if the longest string
 * Space Complexity: O(N * K) i.e. total information stored in the hashmap
 * LeetCode: Y(https://leetcode.com/problems/group-anagrams/)
 * Approach: Create a HashMap of <Long, List<String>> 
    where key is the product of the ith prime number -> ith character of strings calculated over the entire str, 
    value is all of its anagrams
    This way all the anagrams of a str are mapped uniquely into the hashmap
    So poulate the hashmap by iterating over the strs array
    return the hashmap values at last
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Initialize HashMap
        Map<Long, List<String>> anagrams = new HashMap<>();
        
        // Iterate over strs array
        for(String str : strs) {
            // generate key for current string str
            long key = generateKey(str);
            
            // if the generated key does not exists then insert a new key,value pair of key, empty arraylist
            // add str to the value arraylist of generated key
            anagrams.computeIfAbsent(key, k -> new ArrayList<String>()).add(str);
        }
        
        // return arraylist of mapped values
        return new ArrayList<>(anagrams.values());
        
    }
    
    /** Helper function to generate key of each string */
    private long generateKey(String str) { 
        
        // First 26 prime numbers
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        // Intialize product
        long key = 1;
        
        // calculate key by iterating over str
        for(int i = 0 ; i < str.length() ; i++) {
            key *= primes[str.charAt(i) - 'a'];
        }
        
        // return generated key
        return key;
    }
}
