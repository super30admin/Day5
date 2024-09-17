// Time Complexity : O(N K)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length ==0){
            return new ArrayList();
        }
        HashMap<Long, List<String>> map = new HashMap<Long, List<String>>();
        for(String s: strs){
            long key = primeProduct(s);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
    public long primeProduct(String s){
        long result = 1;
        int[] primes = {2,3,5,7,11,13,17,19,23,31,37,41,43,47,53,59,61,67,71,79,83,87,89,97,101,103};
        for(int i =0 ;i < s.length();i++){
            char c = s.charAt(i);
            long prime = primes[c - 'a']; // corresponding prime to char
            result *= prime;
        }
        return result;
    }
}