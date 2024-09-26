///time complexity : O(NK)
//Space complexity : O(N)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length ==0)
            return new ArrayList<>();
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        Map<Long, List<String>> anagram = new HashMap<>();
        for(int i =0;i<strs.length;i++)
        {
            String s = strs[i];
            Long primes = primeproduct(s,prime);
                if(!anagram.containsKey(primes))
                    anagram.put(primes , new ArrayList<String>());
                
                anagram.get(primes).add(s);
        }
        return new ArrayList<>(anagram.values());
        
    }
    private Long primeproduct(String s,int[] prime)
    {
        Long primes =1L;
        for(int i=0;i<s.length();i++)
        {
            primes*= prime[s.charAt(i)-'a'];
        }
        return primes;
    }
}