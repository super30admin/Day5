class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long, List<String> > hsMap = new HashMap<>();
        for(String s: strs){
            long primeVal = calculatePrime(s);
            if(! hsMap.containsKey(primeVal)){
                hsMap.put(primeVal, new ArrayList<>());
            }
            hsMap.get(primeVal).add(s);
        }
        return new ArrayList<>(hsMap.values());
    }
    
    public long calculatePrime(String s){
        
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        long ans =1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            ans = ans*primes[ch-'a'];
            
        }
        return ans;
    }
}

//TC: O(nk)
//n: no of strings in the list, k- the average length of each string
//SC: O(n) for the hashmap that is used to store the strings.
