// Time Complexity : O(nk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<Double, List<String>> anagramsMap = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++) {
            String word = strs[i];
            double primeKey = getPrimeProductKey(word);
            
            if(!anagramsMap.containsKey(primeKey)) 
                anagramsMap.put(primeKey, new ArrayList<>());
            anagramsMap.get(primeKey).add(word);
        }
        return new ArrayList<List<String>>(anagramsMap.values());
    }
    
    private double getPrimeProductKey(String word) {
        double[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double product = 1;
        for(int j = 0; j < word.length(); j++) {
            double currentPrime = primes[word.charAt(j) - 'a'];
            product = product * currentPrime;
        }
        return product;
    }
}