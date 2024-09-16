// https://leetcode.com/problems/group-anagrams/

// Time Complexity : O(nk) where k = average length of each string & n is length of our array
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this: Initially faced issues with selecting data structure and reducing on TC

public class problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();

        for (String s : strs) {
            double primeProduct = calPrimeProduct(s);
            if (!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private double calPrimeProduct(String s) {
        double result = 1;
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int prime = primes[c - 'a'];
            result *= prime;
        }
        return result;
    }
}
