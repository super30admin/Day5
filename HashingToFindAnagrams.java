class Solution {
    
    //Time Complexity & Spae complexity is O(NK) where is the N is the number of string in array and K is the calculation of key using prime factor
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //Use primefactor to calculate the prime product for each string in array and use it as key 
        
        if(strs == null || strs.length==0)
            return new ArrayList<>();
        
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        
        Map<Long, List<String>> anagramMap = new HashMap<>();
         for(int i = 0; i < strs.length; i++){
             String s = strs[i];
             Long primeProduct = calculatePrimeProduct(s, primes);
             
             //Checking if calculated primeproduct key exists and put the key and value which is array list
             if(!anagramMap.containsKey(primeProduct))
                 anagramMap.put(primeProduct, new ArrayList<String>());
             
             //Adding string to anagram list
             anagramMap.get(primeProduct).add(s);
         }
        return new ArrayList<>(anagramMap.values());    
    }
    
    private Long calculatePrimeProduct(String s, int[] primes){
        Long primeProduct =1L;
        for(int i = 0; i < s.length(); i ++){
            primeProduct *= primes[s.charAt(i) - 'a'];
        }
        return primeProduct;
    }
}