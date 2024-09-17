//Problem 1: Group Anagrams

// Time Complexity: O(nk)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long, List<String>> hashMap = new HashMap<>();

        for (String s : strs) {
            long primevalue = calculatePrime(s);

            // check if primeval is already in map if not add to hash map
            if (!hashMap.containsKey(primevalue)) {
                hashMap.put(primevalue, new ArrayList<>());
            }
            hashMap.get(primevalue).add(s);// if already exists just add new string to list corresssponding to prive
                                           // value
        }
        return new ArrayList<>(hashMap.values());
    }

    private long calculatePrime(String s) {
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };

        long ans = 1;
        // iterating through string to calculate prime vale
        for (int x = 0; x < s.length(); x++) {
            char ch = s.charAt(x);
            ans = ans * primes[ch - 'a'];
        }
        return ans;
    }
}

