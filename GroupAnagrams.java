// Time Complexity : O(n*k), n = total number of strings, k = length of each string
// Space Complexity : O(n*k), n = total number of strings, k = length of each string
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<List<String>>();
        
        //array of prime numbers
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        Map<Long, List<String>> anagramMap = new HashMap<>();
        
        for(int i=0; i<strs.length; i++) {
            String s = strs[i];
            Long primeProduct = calculatePrimeProduct(s, primes);
            if(!anagramMap.containsKey(primeProduct))
                anagramMap.put(primeProduct, new ArrayList<String>());
            anagramMap.get(primeProduct).add(s);
        }
        return new ArrayList<>(anagramMap.values());  
    }
    private Long calculatePrimeProduct(String s, int[] primes) {
        Long primeProduct = 1L;
        for(int i=0; i<s.length(); i++) {
            primeProduct *= primes[s.charAt(i) - 'a'];
        }
        return primeProduct;
    }
}  