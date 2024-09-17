// Time Complexity : O(nk)
// Space Complexity : O(m)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Assign prime numbers to each unique character. 
// On receiving a string, mulitply the prime numbers, and store it in the map
// If two strings have the same product, they are anagrams

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // O(nk)
        Map<Double, List<String>> map = new HashMap<>();
        for(String s: strs) { //O(n)
            double primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct)) { //O(k)
                map.put(primeProduct, new ArrayList<>());
            }
                map.get(primeProduct).add(s);
            
        }
        
        return new ArrayList<>(map.values());
    }
    
    private double primeProduct(String s) {
        double result = 1;
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int prime = primes[c - 'a'];
            result = result * prime;
        }
        return result;
    }
}