//Time Complexity: O(NK) 
//Space Complexity: O(NK)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList<>();
        
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
				101 };
        Map<Long, List<String>> aMap = new HashMap<>();
        
        for(int i=0; i<strs.length; i++) {
            long p = calculatePrimeProduct(strs[i], primes);   
            
            if(!aMap.containsKey(p)) {
                aMap.put(p, new ArrayList<String>());
            }
            
            aMap.get(p).add(strs[i]);
         }
        System.out.println(aMap);
        return new ArrayList<>(aMap.values());
    }
    
    private long calculatePrimeProduct(String s, int[] primes) {
        Long i = 1L;
        for(int j=0; j<s.length(); j++) {
            i = i * (primes[s.charAt(j) - 'a']);
        }
        return i;
    }
}