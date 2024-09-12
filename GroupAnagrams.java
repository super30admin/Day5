class GroupAnagrams {
    
    // Time Complexity: O(nk)
    // Space Complexity: O(n)
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Long, List<String>> map = new HashMap<>();
        for(String s: strs){
            long primeVal = calculatePrimes(s);
            if(!map.containsKey(primeVal))
                map.put(primeVal, new ArrayList());
            map.get(primeVal).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
    private long calculatePrimes(String s){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        long ans = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            ans = ans * primes[c - 'a'];
        }
        
        return ans;
    }
}