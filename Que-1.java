//O(n*k)+O(n) -> O(n^2)
//O(1)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long , List<String>> hashMap = new HashMap<>();
        
        for(String s: strs)
        {
            long prime = calcPrime(s);
        
        if(!hashMap.containsKey(prime))
        {
            hashMap.put(prime, new ArrayList<>());
        }
        hashMap.get(prime).add(s);
        }
        return new ArrayList<>(hashMap.values());
    }
    
    private long calcPrime(String s)
    {
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        long ans = 1;
        for ( int x=0;x<s.length();x++)
        {
            char ch= s.charAt(x);
            ans = ans * primes[ch-'a'];
        }
        return ans;
    }
}