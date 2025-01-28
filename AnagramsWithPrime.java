// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// Calculating a unique "prime product" for each string and store these strings in a hash map, using the prime product as the key, and the values of the map as a list of anagrams

public class AnagramsWithPrime {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> sMap = new HashMap<>();

        for (String s : strs) {
            double pp = primeProduct(s);
            if (!sMap.containsKey(pp)) {
                sMap.put(pp, new ArrayList<>());
            }
            sMap.get(pp).add(s);
        }
        return new ArrayList<>(sMap.values());
    }

    private double primeProduct(String s) {
        int[] prime = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        double result = 1.0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            result = result * prime[ch - 'a'];
        }
        return result;
    }
}
