//time complexity: O(N^2)
//Space complexity: O(N)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        HashMap<Long, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            long prime = getPrime(strs[i]);

            if (!map.containsKey(prime)) {
                map.put(prime, new ArrayList<>());
            }
            map.get(prime).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }

    long getPrime(String s) {
        long prod = 1;
        int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            prod *= primes[c - 'a'];
        }
        return prod;

    }

}