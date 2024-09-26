// Time Complexity : O(nk) --> where n is length of string array and k is length of a particular string in string array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode (49): Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    int primes[];
    
    public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length() == 0) return new ArrayList<>();
			
        primes = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        HashMap<Long, List<String>> map = new HashMap<>();
        for (String s: strs) {
            long hash = primeProduct(s);
            if(!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
    private long primeProduct(String s) {
        long result = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result *= primes[c - 'a']; 
        }
        return result;
    }
}