// Time complexity: O(n * m)
// Space complexity: O(n)
// Program ran successfully on Leetcode. 

class Anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
	HashMap<Double, List<String>> anagramMap = new HashMap<>(); 
	for (int i = 0; i < strs.length; i++){
		double primeKey = computePrimeKey(strs[i]);
        if(!anagramMap.containsKey(primeKey)){
            anagramMap.put(primeKey, new ArrayList<>());
        }
        anagramMap.get(primeKey).add(strs[i]);
	}
    return new ArrayList<>(anagramMap.values());
}

    private double computePrimeKey(String str){
        double res = 1; 
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        for (int i = 0; i < str.length(); i ++){
            res *= primes[str.charAt(i) - 'a'];
        }
        return res;
        
    }
}