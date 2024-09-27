// Time Complexity : O(n*c)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    Any number can be represented as a product of primes, and this set of primes is unique for each number.
    Hence, for eachh alphabet, we pre-define a prime number and find the prime product for each string.
    Hence, each anagram, would have a unique prime product.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
        Map<Long, List<String>> result = new HashMap<>();
        for (int i=0; i<strs.length; i++){
            Long hashKey = hashKey(strs[i]);
            List<String> stringArray = result.getOrDefault(hashKey, new ArrayList<>());
            stringArray.add(strs[i]);
            result.put(hashKey, stringArray);
        }
        return new ArrayList(result.values());   
    }
    
    public Long hashKey(String str){
        
        int primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        long result = 1;
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            result *= primes[c-'a'];
        }
        return result;
    }
}