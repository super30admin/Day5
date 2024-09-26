// Time Complexity : O(nk)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        
        for (String str : strs) { // O(n)
            double primeProduct = primeProduct(str); // O(k)
            
            if (!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
    
    private Double primeProduct(String str) {
        double result = 1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int prime = primes[ch - 'a'];
            result *= prime;
        }
        
        return result;
    }
    
}